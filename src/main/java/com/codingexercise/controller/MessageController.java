package com.codingexercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingexercise.model.Greeting;
import com.codingexercise.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
    private MessageService messageService;
	
	@RequestMapping("/hello")
	public Greeting greeting() {
		return messageService.getMessage();
	}

}
