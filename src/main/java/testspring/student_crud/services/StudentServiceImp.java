package testspring.student_crud.services;

import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testspring.student_crud.entity.Student;
import testspring.student_crud.repository.StudentRepository;

import java.util.Optional;

@Service
public class StudentServiceImp implements StudentInterface {
    private static final Logger log = LoggerFactory.getLogger(StudentServiceImp.class);
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        Student stud = studentRepository.findById(id).orElse(null);
        if (stud != null) {
            stud.setName(student.getName());
            stud.setAdress(student.getAdress());
            stud.setAge(student.getAge());
            studentRepository.save(stud);
        }
    }

    @Override
    public void deleteStudent(Long id) {
        Student s = studentRepository.findById(id).orElse(null);
        if (s != null) {
            studentRepository.delete(s);
        }else {
            log.info("Student not found");
        }
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
