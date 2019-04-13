package com.example.SpringExercise.SpringExercise;

import com.example.repositioryImpl.EmployeeRepositoryImpl;
import com.example.repository.IEmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan({"com.example.controllers"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.model")
public class SpringExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExerciseApplication.class, args);
    }


   /* @Bean
    public IEmployeeRepository employeeRepository(){
        return new EmployeeRepositoryImpl();
    }*/





}
