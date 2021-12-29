package com.homemade.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DevApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevApplication.class, args);
	}

	@GetMapping("/hello") 
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		String response = String.format("Hello %s", name); 

		System.out.println("[hello] response_data : [" + response + "]");

		return response;
	}

}
