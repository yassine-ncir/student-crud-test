package testspring.student_crud.services;

import testspring.student_crud.entity.Student;

public interface StudentInterface {
    Student addStudent(Student student);
    void updateStudent(Long id, Student student);
    void deleteStudent(Long id);
    Student getStudentById(Long id);
}
