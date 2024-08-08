package com.personal.app.functions;

import org.springframework.boot.SpringApplication;

public class TestFunctionsApplication {

	public static void main(String[] args) {
		SpringApplication.from(FunctionsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
