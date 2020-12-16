package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String messageService() {
		return "Hello, I am Spring";
	}
	
}
