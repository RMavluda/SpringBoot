package uz.course.springStudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.course.springStudents.model.Student;
import uz.course.springStudents.repository.InMemoryStudentDAO;
import uz.course.springStudents.service.StudentService;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudent(){
       return repository.findAllStudent();

    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }

}
