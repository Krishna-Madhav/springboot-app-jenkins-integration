package com.BootLearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static Logger logger  = LoggerFactory.getLogger(Application.class);
	
	@PostConstruct
	public void start() {
		logger.info("Spring Boot Application started...");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(Application.class, args);
	}

}
 