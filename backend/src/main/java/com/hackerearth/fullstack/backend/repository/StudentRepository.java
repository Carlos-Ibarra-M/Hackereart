package com.hackerearth.fullstack.backend.repository;

import com.hackerearth.fullstack.backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

