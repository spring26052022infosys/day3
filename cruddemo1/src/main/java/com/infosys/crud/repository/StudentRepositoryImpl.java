package com.infosys.crud.repository;

import java.util.ArrayList;
import java.util.List;

import com.infosys.crud.model.StudentDTO;

public class StudentRepositoryImpl implements StudentRepository {

	private List<StudentDTO> studentList=new ArrayList<>();
	public void addStudent(StudentDTO student) {
		studentList.add(student);
		
	}

}
