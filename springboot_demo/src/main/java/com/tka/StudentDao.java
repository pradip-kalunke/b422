package com.tka;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao { // Spring -- JPAhibernate] --> ORM --> Hibernate[]

	@Autowired
	SessionFactory sf; // auto bean creation ---

	public Student getStudentById(int id) {
		Session ssn = sf.openSession();
		return ssn.get(Student.class, id);
	}

	public void addStudent(Student stud) {
		System.err.println(">>in Dao > addStu() ");
		Session ssn = sf.openSession();
		ssn.save(stud);
		ssn.beginTransaction().commit();
		System.err.println("inserted in db....\n\n");
	}

	public void updateStudent(Student stud) {
		Session ssn = sf.openSession();
		ssn.update(stud);
		ssn.beginTransaction().commit();
		System.err.println("updated in db....\n\n");
	}

	public void deleteStudent(int id) {
		Session ssn = sf.openSession();
		Student s = ssn.get(Student.class, id);
		if (s != null) {
			ssn.delete(s);
			ssn.beginTransaction().commit();
			System.err.println("deleted in db....\n\n");
		}
	}
	
	public List<Student>  getAllStudent(){
		return null;
	}

}
