package com.example.openaiapi.controllers;

import com.example.openaiapi.dtos.InputDto;
import com.example.openaiapi.dtos.OutputDto;
import com.example.openaiapi.services.Interface.ChatgptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatGptController {


    @Autowired
    private ChatgptService service;
    @GetMapping(path = "/")
    public String index() {
        return "index";
    }

    @PostMapping(path = "/")
    public String chat(Model model, @ModelAttribute InputDto dto) {
        try {
            List<OutputDto> outputDtosList=new ArrayList<OutputDto>();
            OutputDto output= service.sendChat(dto.getPrompt());
            outputDtosList.add(output);
            model.addAttribute("request", dto.getPrompt());
            model.addAttribute("response", output.getAnswer());
            model.addAttribute("listQA", outputDtosList);


        } catch (Exception e) {
            model.addAttribute("response", "OpenAi is experiencing high demand, try again later");
        }
        return "index";
    }
}
