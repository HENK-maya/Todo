package com.sv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class TodController {
	
	@GetMapping(value="/message")
	public String getMessage() {
		return "Hi , welcome to my Todo App";
	}
	
	@GetMapping(value="/message")
	public String getAllMessage() {
		return "Hi , welcome to my Todo App for all message";
	}
}
