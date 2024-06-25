package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

@GetMapping("/message")
	public String message(){
		return "Congrats for your Spring Demo!!!!!";

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
