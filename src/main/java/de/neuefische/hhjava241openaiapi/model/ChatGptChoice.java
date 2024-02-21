package de.neuefische.hhjava241openaiapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGptChoice {

    /**
     * {
     *     "message": {
     *         "content": "This is a test!"
     *     }
     * }
     */

    private ChatGptMessage message;
}
