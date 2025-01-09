package com.springboot.StudentManagementSystem.Mapper;

import com.springboot.StudentManagementSystem.Dto.StudentDto;
import com.springboot.StudentManagementSystem.Entity.Student;

public class StudentMapper {


    public static StudentDto mapToStudentDto(Student student){ //The method is designed to convert a StudentEntity to a StudentDto
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto){ //This method is designed to convert a StudentDto to a StudentEntity
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
         return student;
    }
}
