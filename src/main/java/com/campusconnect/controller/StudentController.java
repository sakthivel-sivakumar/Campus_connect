package com.campusconnect.controller;

import com.campusconnect.entity.Student;
import com.campusconnect.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // CREATE
    @PostMapping
    public Student addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

    // READ ALL
    @GetMapping
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {

        return studentService.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Long id,
            @RequestBody Student student) {

        return studentService.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {

        return studentService.deleteStudent(id);
    }
}
