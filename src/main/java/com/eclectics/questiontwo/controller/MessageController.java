package com.eclectics.questiontwo.controller;

import com.eclectics.questiontwo.consumers.MessageConsumer;
import com.eclectics.questiontwo.entities.Messages;
import com.eclectics.questiontwo.wrapper.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stored-messages")
public class MessageController {

    @Autowired
    private MessageConsumer service;
    @GetMapping
    public MessageResponse findAll(){
        return service.findAll();
    }
}
