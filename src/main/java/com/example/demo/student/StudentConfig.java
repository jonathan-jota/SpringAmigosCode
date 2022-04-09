package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student jonathan = new Student (
                    "Jonathan",
                    "jonathan@email.com",
                    LocalDate.of(1987, JANUARY, 19)
            );
            Student sofia = new Student (
                    "Sofia",
                    "sofia@email.com",
                    LocalDate.of(2019, AUGUST, 19)
            );

            repository.saveAll(
                    List.of(jonathan, sofia)
            );

        };
    }
}
