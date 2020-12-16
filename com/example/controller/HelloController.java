package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	HelloService h;
	
	@RequestMapping("/hello")
	public String message() {
		return h.messageService() ;
		
	}
	
}
