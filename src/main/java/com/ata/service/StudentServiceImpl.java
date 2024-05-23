package com.ata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ata.entity.Grade;
import com.ata.entity.Student;
import com.ata.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentrepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private String URL = "http://localhost:8083/StudentGrade/rollNo/";
	
	
	@Override
	public List<Student> getAllStudents() {
		return studentrepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		
		Grade grade =  restTemplate.getForObject(URL + id, Grade.class);
		Student student = studentrepository.findById(id).orElse(null);
		student.setGrade(grade);
		return student;
		
	}

	@Override
	public Student createStudent(Student student) {
		return studentrepository.save(student);
	}


	@Override
	public Student updateStudent(int id, Student student) {
		if (studentrepository.existsById(id)) {
            //student.setId(id);
            return studentrepository.save(student);
        }
        return null; // Handle not found case
	}

	@Override
	public void deletestudent(int id) {
		studentrepository.deleteById(id);
	}

}
