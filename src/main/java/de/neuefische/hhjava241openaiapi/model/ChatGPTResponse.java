package de.neuefische.hhjava241openaiapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTResponse {

    /**
     * {
     *     "choices": [
     *         {
     *             "message": {
     *                 "content": "This is a test!"
     *             }
     *         }
     *     ]
     * }
     */

    private List<ChatGptChoice> choices;

    public String getAnswer(){
        return getChoices().get(0).getMessage().getContent();
    }
}
