package com.debuggeandoideas.erp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.debuggeandoideas.erp")
public class ErpLiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpLiteApplication.class, args);
	}

}