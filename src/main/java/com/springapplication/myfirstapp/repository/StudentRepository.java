package com.springapplication.myfirstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapplication.myfirstapp.entity.Student;


//@repository annotation is not required here as it is put on top of 
//jparepository which this calss is alreay extending 
public interface StudentRepository extends JpaRepository<Student, Long>{

}
