package com.userapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestAppController {

	@GetMapping("/message")
	public String getMessage() {
		
		return "Welcome Azure !!";
	}
}
