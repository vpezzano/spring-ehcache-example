package com.techprimers.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.techprimers.cache.repository"})
public class SpringEhcacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEhcacheExampleApplication.class, args);
	}
}
