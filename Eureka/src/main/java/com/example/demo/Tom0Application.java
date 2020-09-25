package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tom0Application {

	public static void main(String[] args) {
		System.out.println("Eureka runs ");
		SpringApplication.run(Tom0Application.class, args);
	}

}
