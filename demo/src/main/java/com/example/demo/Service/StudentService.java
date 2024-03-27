package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;

	public void addStudent(Student s) {
		sr.save(s);
		
	}

	public void deleteStudent(int id) {
		sr.deleteById(id);
		
	}

	

	public List<Student> getAllStudent() {
		List<Student> l= sr.findAll();
		return l;
	}

	public Student getStudent(int id) {
		Optional<Student> s=sr.findById(id);
		return s.get();
	}

	public Student updateStudent(Student s) {
		int s2=s.getId();
		Optional<Student> s3=sr.findById(s2);
		Student s4=s3.get();
		s4.setSname(s.getSname());
		s4.setContactno(s.getContactno());
		s4.setSaddress(s.getSaddress());
		return s4;
	}
	
	
}
