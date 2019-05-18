package com.geekbrains.geekmarket.controllers;

import com.geekbrains.geekmarket.entities.Student;
import com.geekbrains.geekmarket.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    @GetMapping("")
    public String shopPage(Model model) {
        List<Student> allStudent = studentService.getAllStudents();
        model.addAttribute("students", allStudent);
        return "students-page";
    }
}

