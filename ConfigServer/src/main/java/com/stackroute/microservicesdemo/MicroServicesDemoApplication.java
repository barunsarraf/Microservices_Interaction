package com.stackroute.microservicesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableConfigServer
/*@EnableEurekaClient*/
@SpringBootApplication
public class MicroServicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesDemoApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String home() {
		return "ConfigServer Micro Services Eureka Client application";
	}

}
