package com.spring.jdbc.sample.spring_jdbc_application.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.sample.spring_jdbc_application.model.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Student student) {
		
		int rowsAffected = jdbcTemplate.update("insert into student(id,name,marks) values (?,?,?)", student.getId(),
				student.getName(),student.getMarks());
		
		System.out.println("rowsAffected: " + rowsAffected);
		
		
	}

	public List<Student> fetchAllStudents() {
		return jdbcTemplate.query("select * from student" , (rs, rownum) -> {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setMarks(rs.getInt("marks"));
			return student;
		});
	}
	
	

}
