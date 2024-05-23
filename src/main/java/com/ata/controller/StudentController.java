package com.ata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ata.entity.Student;
import com.ata.service.StudentService;

@RestController
@RequestMapping("/studentmarks")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@GetMapping
    public List<Student> getAllStudent() {
        return studentservice.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
       Student student = studentservice.getStudentById(id);
        return ResponseEntity.of(Optional.ofNullable(student));
    }

    @PostMapping("/")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdstudent = studentservice.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdstudent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student) {
    	Student updatedStudent = studentservice.updateStudent(id, student);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
    	studentservice.deletestudent(id);
        return ResponseEntity.noContent().build();
    }
}
