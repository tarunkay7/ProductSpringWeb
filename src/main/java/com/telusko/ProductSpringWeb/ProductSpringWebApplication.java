package com.telusko.ProductSpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.telusko.ProductSpringWeb")
public class ProductSpringWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductSpringWebApplication.class, args);
	}

}
