package org.example.personalproject.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class personalprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(personalprojectApplication.class, args);
    }

}
