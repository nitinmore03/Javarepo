package com.springtestdemo.Springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/getdata")
	public String getData() {
		
		return "Request received successfully.";
	}
}
