package de.neuefische.hhjava241openaiapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTRequest {
    /**
     * {
     *      "model": "gpt-3.5-turbo",
     *      "messages": [
     *         {
     *             "role": "user",
     *             "content": "Say this is a test!"
     *         }
     *         ],
     *      "temperature": 0.7
     *    }
     */

    private String model;
    private List<ChatGptMessage> messages;

    public ChatGPTRequest(String question){
        this.model = "gpt-3.5-turbo";
        this.messages = List.of(new ChatGptMessage(question));
    }

}
