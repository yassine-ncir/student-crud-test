package testspring.student_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testspring.student_crud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
