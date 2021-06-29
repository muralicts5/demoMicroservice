package com.example.testClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestClientApplication.class, args);
	}

	
	
	
}
