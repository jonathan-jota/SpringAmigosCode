package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.datatype.DatatypeConstants;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static javax.xml.datatype.DatatypeConstants.AUGUST;
import static javax.xml.datatype.DatatypeConstants.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student jonathan = new Student (
                    "Jonathan",
                    "jonathan@email.com",
                    LocalDate.of(2002, JANUARY, 19),
                    21
            );
            Student sofia = new Student (
                    "Sofia",
                    "sofia@email.com",
                    LocalDate.of(2009, AUGUST, 19),
                    12
            );

            repository.saveAll(
                    List.of(jonathan, sofia)
            );

        };
    }
}
