package com.infosys.crud.service;

import com.infosys.crud.exception.StudentException;
import com.infosys.crud.model.StudentDTO;
import com.infosys.crud.repository.StudentRepository;
import com.infosys.crud.repository.StudentRepositoryImpl;
import com.infosys.crud.validator.Validator;

public class StudentServiceImpl implements StudentService {
  // Validation and other bsns logic
	StudentRepository studentRepo=new StudentRepositoryImpl();
	public void addStudent(StudentDTO student) throws StudentException {
	 Validator.validate(student);
	 studentRepo.addStudent(student);
		
	}

}
