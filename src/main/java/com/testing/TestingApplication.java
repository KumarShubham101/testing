package com.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingApplication {

	public static void main(String[] args) {
		String name="mike";
		int x=40;
		boolean isPresent=false;
		int y=200;
		char x='a';
		double z=10.3;
		float m=10.5f;
		SpringApplication.run(TestingApplication.class, args);
	}

}
