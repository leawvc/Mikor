package com.shop.mikor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MikorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MikorApplication.class, args);
	}

}
