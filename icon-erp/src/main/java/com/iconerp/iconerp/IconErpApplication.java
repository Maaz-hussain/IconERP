package com.iconerp.iconerp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaAuditing
@ComponentScan("com.iconerp")
@EnableJpaRepositories("com.iconerp.repositories")
@EntityScan("com.iconerp.entities")
@SpringBootApplication
public class IconErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(IconErpApplication.class, args);
	}

}
