package com.helencodes.studentsystem.controller;

import com.helencodes.studentsystem.Service.Studentservice;
import com.helencodes.studentsystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author elena
 */

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private Studentservice studentservice;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentservice.saveStudent(student);
        return "new student has been added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentservice.getAllStudents();
    }
}
