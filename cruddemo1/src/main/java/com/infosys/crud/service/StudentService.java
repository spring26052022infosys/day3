package com.infosys.crud.service;

import com.infosys.crud.exception.StudentException;
import com.infosys.crud.model.StudentDTO;

public interface StudentService {

	void addStudent(StudentDTO student) throws StudentException;

}
