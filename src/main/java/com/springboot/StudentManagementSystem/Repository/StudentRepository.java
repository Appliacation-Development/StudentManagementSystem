package com.springboot.StudentManagementSystem.Repository;

import com.springboot.StudentManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
