package com.springtest.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/get")
public String getData() {
	return "Test application running successfully";
	
}	
}
