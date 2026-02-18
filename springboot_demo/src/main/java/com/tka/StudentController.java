package com.tka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService studService;

	@GetMapping("/")
	public String test() {
		return "welcome to spring Restful APIs.";
	}

	@GetMapping("/get-student/{id}")
	public Student getStudentById(@PathVariable int id) {
		Student stud = studService.getStudentById(id);
		return stud;
	}

	@PostMapping("/add-student")
	public String addStudent(@RequestBody Student stud) {
		System.err.println(">>  addStudent: " + stud);
		studService.addStudent(stud);
		return stud.getName() + " inserted successful........";
	}

	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student stud) {
		System.err.println(">>  updateStudent: " + stud);
		studService.updateStudent(stud);
		return stud.getName() + " updated successful........";
	}

	@DeleteMapping("/delete-student/{id}")
	public String deleteStudent(@PathVariable int id) {
		System.err.println(">>  delete Student: ");
		studService.deleteStudent(id);
		return id + " deleted successful........";
	}

	@GetMapping("/get-allstudents")
	public List<Student> getAllStudent() {
		return null;
	}

}
