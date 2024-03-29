package uz.course.springStudents.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.course.springStudents.model.Student;
import uz.course.springStudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent(){
       //todo
        return service.findAllStudent();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Student successfully saved!";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }
    //      /api/v1/students/rahimqulimavluda@gmail.com

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable("email") String email){
        service.deleteStudent(email);
    }
}
