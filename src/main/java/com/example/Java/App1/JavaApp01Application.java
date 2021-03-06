package com.example.Java.App1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class JavaApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaApp01Application.class, args);
	}

}
