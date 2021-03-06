package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bean", "com.controller", "com.service"})
public class LoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAppApplication.class, args);
	}

}
