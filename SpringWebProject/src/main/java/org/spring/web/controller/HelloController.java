package org.spring.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }
	
	@RequestMapping("/get")
    public String get() {
        return "Hello Spring Boot!";
    }

}
