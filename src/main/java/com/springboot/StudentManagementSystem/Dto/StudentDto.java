package com.springboot.StudentManagementSystem.Dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long Id;
    @NotEmpty(message = "Student firstName should not be empty")
    private String FirstName;
    @NotEmpty(message = "Student lastName should not be empty")
    private String LastName;
    @NotEmpty(message = "Student email should not be empty")
    @Email
    private String Email;
}
