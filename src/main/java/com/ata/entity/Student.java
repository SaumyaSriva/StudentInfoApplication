package com.ata.entity;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "StudentMarks")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Rollno;
	private String name;
	private int classroom;

	@Transient
	private Grade grade;
	
	
	
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Student() {
		super();
	}

	public Student(int rollno, String name, int classroom) {
		super();
		Rollno = rollno;
		this.name = name;
		this.classroom = classroom;

	}






	public int getRollno() {
		return Rollno;
	}






	public void setRollno(int rollno) {
		Rollno = rollno;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getClassroom() {
		return classroom;
	}






	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", classroom=" + classroom + ", grade=" + grade + "]";
	}









	
}
