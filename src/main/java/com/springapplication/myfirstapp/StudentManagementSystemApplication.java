package com.springapplication.myfirstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springapplication.myfirstapp.entity.Student;
import com.springapplication.myfirstapp.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("vidya","Dotihal","dtvidyashree@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("surendraa","Pallai","surendraa@gmail.com");
		 * studentRepository.save(student2); Student student3 = new
		 * Student("aarav","pallai","aarav2020@gmail.com");
		 * studentRepository.save(student3); Student student4 = new
		 * Student("dhruva","pallai","dhruva2023@gmail.com");
		 * studentRepository.save(student4); Student student5 = new
		 * Student("manju","Dotihal","dtmanjunath@gmail.com");
		 * studentRepository.save(student5);
		 */
		
	}

}
