package com.example.demo.Student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student {

    @Id 
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long Id;
    private String name;
    private String email;
    private LocalDate DOB;
    private int age;

//Constructors
    public Student() {
    }

    public Student(
            Long id,
            String name,
            String email,
            LocalDate DOB,
            int age) {
        Id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;
    }

    public Student(
            String name,
            String email,
            LocalDate DOB,
            int age) {
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;
    }
//GETTERS abd SETTERS
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                ", age=" + age +
                '}';
    }
}

