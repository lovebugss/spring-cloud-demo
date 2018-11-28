package com.itrjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
	}
}