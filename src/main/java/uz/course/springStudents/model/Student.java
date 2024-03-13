package uz.course.springStudents.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

}
