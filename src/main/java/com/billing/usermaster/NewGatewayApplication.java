package com.billing.usermaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NewGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewGatewayApplication.class, args);
	}

}
