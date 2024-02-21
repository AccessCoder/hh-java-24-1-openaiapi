package de.neuefische.hhjava241openaiapi.controller;

import de.neuefische.hhjava241openaiapi.service.ChatGptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat") // xx/api/chat?q=was+ist+eine+primzahl
@RequiredArgsConstructor
public class ChatGptController {

    private final ChatGptService service;

    @GetMapping
    public String askQuestion(@RequestParam String q){
        return service.askQuestion(q);
    }
}
