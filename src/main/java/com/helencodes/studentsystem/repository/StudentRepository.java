package com.helencodes.studentsystem.repository;

import com.helencodes.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author elena
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
