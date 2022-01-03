package com.microservices.config.SpringCloudConfigurationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigurationServiceApplication.class, args);
	}

}
