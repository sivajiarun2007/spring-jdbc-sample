package com.spring.jdbc.sample.spring_jdbc_application.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Student {
	
	private Integer id;
	private String name;
	private Integer marks;

}
