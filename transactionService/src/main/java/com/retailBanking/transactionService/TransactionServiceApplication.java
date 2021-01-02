package com.retailBanking.transactionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class TransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionServiceApplication.class, args);
	}

//	@Bean
//	@LoadBalanced
//	public RestTemplate createRestTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
}
