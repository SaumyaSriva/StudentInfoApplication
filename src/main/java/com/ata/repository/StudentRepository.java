package com.ata.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ata.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

//	boolean existsById(Long id);
//
//	void deleteById(Long id);
//
//	Optional<Student> findById(Long id);

}
