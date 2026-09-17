package com.campusconnect.service;

import com.campusconnect.entity.Student;
import com.campusconnect.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    public Student addStudent(Student student) {

        return studentRepository.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    // READ ONE
    public Student getStudentById(Long id) {

        return studentRepository.findById(id)
                .orElse(null);
    }

    // UPDATE
    public Student updateStudent(Long id, Student student) {

        Student existingStudent =
                studentRepository.findById(id)
                        .orElse(null);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setPhone(student.getPhone());
        existingStudent.setDepartment(student.getDepartment());
        existingStudent.setGraduationYear(student.getGraduationYear());
        existingStudent.setCgpa(student.getCgpa());

        return studentRepository.save(existingStudent);
    }

    // DELETE
    public String deleteStudent(Long id) {

        if (!studentRepository.existsById(id)) {
            return "Student not found";
        }

        studentRepository.deleteById(id);

        return "Student deleted successfully";
    }
}