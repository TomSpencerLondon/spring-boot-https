package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHttpsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHttpsDemoApplication.class, args);
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Simple demo project to demonstrate how to enable HTTPS for your local spring Boot application";
	}

}
