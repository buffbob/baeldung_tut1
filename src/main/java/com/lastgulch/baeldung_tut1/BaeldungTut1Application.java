package com.lastgulch.baeldung_tut1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.lastgulch.baeldung_tut1.persistence")
@EntityScan("com.lastgulch.baeldung_tut1.model")
@SpringBootApplication
public class BaeldungTut1Application {
	public static void main(String[] args) {
		SpringApplication.run(BaeldungTut1Application.class, args);
	}
}
