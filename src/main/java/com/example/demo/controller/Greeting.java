package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/hello")
public class Greeting {

	@GetMapping(value = "/greet")
	public String greet() {
		return "Hello....!!";
	}

	@GetMapping(value = "/authenticate")
	public String greetAuthenticated() {
		return "Hello....!!";
	}
}
