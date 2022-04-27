package com.microservice.example.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventoryOrchestratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryOrchestratorApplication.class, args);
	}

}
