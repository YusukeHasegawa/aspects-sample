package com.example.aspectssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication
@EnableSpringConfigured
public class AspectsSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectsSampleApplication.class, args);
	}

}
