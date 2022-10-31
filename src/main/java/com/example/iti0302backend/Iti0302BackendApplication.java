package com.example.iti0302backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories   //not sure
public class Iti0302BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(Iti0302BackendApplication.class, args);
    }

}
