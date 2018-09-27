package com.mundomagico.mundomagico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mundomagico")
public class MundomagicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundomagicoApplication.class, args);
	}
}
