package com.tka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentDao studDao;

	public Student getStudentById(int id) {
		return studDao.getStudentById(id);
	}

	public void addStudent(Student stud) {
		studDao.addStudent(stud);
	}

	public void updateStudent(Student stud) {
		studDao.updateStudent(stud);
	}

	public void deleteStudent(int id) {
		studDao.deleteStudent(id);
	}
	
	public List<Student>  getAllStudent(){
		return null;
	}

}
