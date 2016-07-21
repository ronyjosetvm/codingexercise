package com.codingexercise.service.impl;

import org.springframework.stereotype.Service;

import com.codingexercise.model.Greeting;
import com.codingexercise.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	
	public Greeting getMessage() {
		return new Greeting("world");
	}

}
