package com.Coders_team.ParaCasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ParaCasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParaCasaApplication.class, args);
		System.out.println("Hola Mundo");
	}
	
}

	