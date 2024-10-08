package testspring.student_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testspring.student_crud.entity.Student;
import testspring.student_crud.services.StudentInterface;

@RestController
public class StudentController {
    @Autowired
    StudentInterface studentInterface;

    @PostMapping("/addStudent")
    Student addStudent(@RequestBody Student student){
        return studentInterface.addStudent(student);
    }

    @PutMapping("/updateStudent/{id}")
    void updateStudent(@PathVariable Long id ,@RequestBody Student student){
        studentInterface.updateStudent(id, student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    void deleteStudent(@PathVariable Long id){
        studentInterface.deleteStudent(id);
    }

    @GetMapping("/getStudentById/{id}")
    Student getStudentById(@PathVariable Long id){
        return studentInterface.getStudentById(id);
    }
}
