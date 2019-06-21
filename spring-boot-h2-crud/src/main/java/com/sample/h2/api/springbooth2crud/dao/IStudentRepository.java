package com.sample.h2.api.springbooth2crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.h2.api.springbooth2crud.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{
	List<Student> findByStudGrade(String grade);
}