package uz.course.springStudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.course.springStudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
