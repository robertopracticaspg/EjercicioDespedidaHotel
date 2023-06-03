package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.dao")
@SpringBootApplication(scanBasePackages = {"com.curso.controller", "com.curso.service","com.curso.inicio"})
public class Ej05HotelApplication {

	/**
	 * Punto de entrada para la aplicación Spring Boot.
	 * 
	 * @param args Los argumentos de línea de comandos.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Ej05HotelApplication.class, args);
	}

}
