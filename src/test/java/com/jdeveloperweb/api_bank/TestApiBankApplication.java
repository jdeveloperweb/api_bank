package com.jdeveloperweb.api_bank;

import org.springframework.boot.SpringApplication;

public class TestApiBankApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApiBankApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
