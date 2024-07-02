package com.tuto1.tuto1.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student abdou = new Student("Abdou", "ab@gmail.com", LocalDate.of(2024, 1, 10));
            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2024, 1, 10));
            repository.saveAll(List.of(abdou, alex));

        };
    }
}
