package de.neuefische.hhjava241openaiapi.service;

import de.neuefische.hhjava241openaiapi.model.ChatGPTRequest;
import de.neuefische.hhjava241openaiapi.model.ChatGPTResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ChatGptService {

    private final RestClient client;

    public ChatGptService(
                          @Value("${open.ai.key}") String apikey,
                          @Value("${open.ai.url}") String baseurl){
        client = RestClient.builder()
                .baseUrl(baseurl)
                .defaultHeader("Authorization", "Bearer " + apikey) //<- Header mit Metainformationen. z. B. Unser Auth Token!
                .build();
    }

    public String askQuestion(String q) {
        ChatGPTRequest request = new ChatGPTRequest(q);
        ChatGPTResponse response = client.post()
                .body(request)
                .retrieve()
                .body(ChatGPTResponse.class);
        return response.getAnswer();
    }
}
