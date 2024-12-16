package com.hackerearth.fullstack.backend.sample;

import com.hackerearth.fullstack.backend.controller.StudentController;
import com.hackerearth.fullstack.backend.model.Student;
import com.hackerearth.fullstack.backend.repository.StudentRepository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class sampleTest {

    @Autowired
    private StudentController studentController;

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    public void setUp() {
        // Initialize the database with test data before each test
        Student student1 = new Student("John Doe", 20, 89, 90);
        Student student2 = new Student("Jane Smith", 22, 75, 80);
        studentRepository.saveAll(List.of(student1, student2));
    }

    @AfterEach
    public void tearDown() {
        // Clean up the database after each test
        studentRepository.deleteAll();
    }

    @Test
    public void testAddStudent() throws Exception {
        // Arrange
        Student newStudent = new Student("Alice Johnson", 18, 95, 95);

        // Act
        Student addedStudent = studentController.addStudent(newStudent);

        // Assert
        assertNotNull(addedStudent);
        assertEquals(newStudent.getName(), addedStudent.getName());
        assertEquals(newStudent.getMarks(), addedStudent.getMarks());
        assertEquals(newStudent.getAge(), addedStudent.getAge());
    }

    @Test
    public void testDeleteStudent() {
        // Arrange
        Student studentToDelete = studentRepository.findAll().get(0);

        // Act
        studentController.deleteStudent(studentToDelete.getId());

        // Assert
        assertFalse(studentRepository.existsById(studentToDelete.getId()));
    }
}
