package com.geekbrains.geekmarket.services;

import com.geekbrains.geekmarket.entities.Student;
import com.geekbrains.geekmarket.repositories.StudentRepository;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

}
