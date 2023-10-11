package com.springapplication.myfirstapp.service;

import java.util.List;

import com.springapplication.myfirstapp.entity.Student;

public interface StudentService {
	List<Student> getStudentData();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	Student getStudentById(Long id);
	
	void deleteStudentById(Long id);
}
