package com.spring.jdbc.sample.spring_jdbc_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.jdbc.sample.spring_jdbc_application.model.Student;
import com.spring.jdbc.sample.spring_jdbc_application.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		 
		 
		 Student student = ctx.getBean(Student.class);
		 student.setId(4);
		 student.setMarks(60);
		 student.setName("Gandhi");
		 
		 StudentService studentSvc = ctx.getBean(StudentService.class);
		 
		 System.out.println("Insert started");
		 
		 studentSvc.addStudent(student);
		 
		 System.out.println("Insert completed");
		 
		 
		 System.out.println("Fetch started");
		 
		 studentSvc.getAllStudents();
		 
		 System.out.println("Fetch completed");
		
	}

}
