package com.ata.service;

import java.util.List;

import com.ata.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student getStudentById(int id);

	Student createStudent(Student student);

	Student updateStudent(int id, Student student);

	void deletestudent(int id);

}
