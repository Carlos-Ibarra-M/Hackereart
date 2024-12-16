package com.hackerearth.fullstack.backend.controller;

import com.hackerearth.fullstack.backend.exception.CustomException;
import com.hackerearth.fullstack.backend.model.Student;
import com.hackerearth.fullstack.backend.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "index.html";
    }

    // Write code to get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return null;
    }

    // Write code to get student by id else return null
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return null;
    }

    // Write code to add student and return added student
    // If marks or attendance is less than 0 or greater than 100 then throw CustomException with message
    // "Marks should be between 0 and 100" or "Attendance should be between 0 and 100" respectively
    // and status code 400
    @PostMapping
    public Student addStudent(@RequestBody Student student) throws Exception {
        return null;
    }

    // Write code to update student and return updated student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return null;
    }

    // Write code to delete student by id
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
    }

    // Write code to update promotion status of student by id and return student object
    // If marks and attendance is greater than 85 then set promotion_status to true else false
    @PutMapping("/{id}/updatePromotionStatus")
    public Student updatePromotionStatus(@PathVariable Long id) {
        return null;
    }
}