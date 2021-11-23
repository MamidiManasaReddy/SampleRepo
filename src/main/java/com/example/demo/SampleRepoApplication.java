package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRepoApplication.class, args);
		
		System.out.println("my Git app");
	}

}
