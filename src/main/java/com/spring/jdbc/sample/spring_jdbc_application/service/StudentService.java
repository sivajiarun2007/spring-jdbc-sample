package com.spring.jdbc.sample.spring_jdbc_application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.sample.spring_jdbc_application.model.Student;
import com.spring.jdbc.sample.spring_jdbc_application.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public void addStudent(Student student) {
		System.out.println("adding Student");
		studentRepo.save(student);
	}

	public void getAllStudents() {
		System.out.println(studentRepo.fetchAllStudents());
	}

}
