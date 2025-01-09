package com.springboot.StudentManagementSystem.Service;

import com.springboot.StudentManagementSystem.Dto.StudentDto;
import jakarta.validation.Valid;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudentList();

    default void createStudent(StudentDto student) {
    }

    StudentDto getstudentById(Long studentid);

    void updateStudent(@Valid StudentDto studentDto);

    void deleteStudent(Long studentId);
}
