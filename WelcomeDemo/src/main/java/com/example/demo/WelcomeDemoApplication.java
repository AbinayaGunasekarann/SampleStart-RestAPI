package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeDemoApplication.class, args);
		System.out.print("Welcome to the demo");
	}

}
