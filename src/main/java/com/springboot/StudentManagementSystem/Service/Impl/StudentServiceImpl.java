package com.springboot.StudentManagementSystem.Service.Impl;

import com.springboot.StudentManagementSystem.Dto.StudentDto;
import com.springboot.StudentManagementSystem.Entity.Student;
import com.springboot.StudentManagementSystem.Mapper.StudentMapper;
import com.springboot.StudentManagementSystem.Repository.StudentRepository;
import com.springboot.StudentManagementSystem.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<StudentDto> getAllStudentList() {
        List<Student> students = studentRepository.findAll(); //here let's get studentDto objects from the students repository and In above statement getallstudents we have return format in StudentDTO..,,Now we will convert student JPA to Student DTO to refer see below statement
        List<StudentDto> studentDtos = students.stream()
                .map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
        return studentDtos;
    }

    @Override
    public void createStudent(StudentDto studentDto) {

        Student student = StudentMapper.mapToStudent(studentDto);
        studentRepository.save(student);
    }

    @Override
    public StudentDto getstudentById(Long studentid) {
        Student student = studentRepository.findById(studentid).get();
        StudentDto studentDto = StudentMapper.mapToStudentDto(student);
        return studentDto;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.mapToStudent(studentDto));

    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
