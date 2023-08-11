package com.example.demo.Student;

import antlr.Lookahead;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student justine =new Student(
                    "Justine",
                    "cherish@gmail.com",
                    LocalDate.of(2000 , JUNE, 6)
            );
            Student blessing =new Student(
                    "Blessing",
                    "blessing@gmail.com",
                    LocalDate.of(2006 , JUNE, 10)
            );
            Student davies =new Student(
                    "Davies",
                    "davies@gmail.com",
                    LocalDate.of(2003 , JANUARY, 10)
            );
            Student esther =new Student(
                    "Esther",
                    "esther@gmail.com",
                    LocalDate.of(1999 , FEBRUARY, 20)
            );
            repository.saveAll(
                    Arrays.asList(justine, blessing,davies,esther)
            );
            
        };
    }
}
