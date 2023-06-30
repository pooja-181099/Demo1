package com.example.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController {
	
	@GetMapping(value="/msg")
	public String msg()
	{
		return "Welcome....";
	}
	
}
