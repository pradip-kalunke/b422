package com.tka;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component // spring as bean ---
@Entity
public class Student {  // Encapsulate --Entity --Bean --POJO

	@Id
	int sid;
	String name;
	String course;
	float per;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name, String course, float per) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.per = per;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + ", per=" + per + "]";
	}

}
