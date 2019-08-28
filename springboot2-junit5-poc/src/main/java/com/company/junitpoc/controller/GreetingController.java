package com.company.junitpoc.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/greeting/{name}")
	public String greeting(@PathVariable("name")String name) {
		return "Hello "+ name;
	}

}