package com.dockerk8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dockerk8Application {

	public static void main(String[] args) {
		SpringApplication.run(Dockerk8Application.class, args);
		System.out.println("--> Running <--");
	}

}
