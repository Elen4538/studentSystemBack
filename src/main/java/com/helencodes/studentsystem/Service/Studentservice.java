package com.helencodes.studentsystem.Service;

import com.helencodes.studentsystem.model.Student;

import java.util.List;

/**
 * @author elena
 */
public interface Studentservice {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
