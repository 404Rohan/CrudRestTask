package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	
	@PostMapping("/Insert")
	public String addStudent(@RequestBody Student s) {
		ss.addStudent(s);
		return "Student Add Succesfully";
	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		ss.deleteStudent(id);
		return "Student Delete Succesfully";
	}
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		
		List<Student> s=ss.getAllStudent();
		return s;
	}
	
	@GetMapping("/GetStudent/{id}")
	public Student getStudent(@PathVariable("id")int id){
		
		Student s=ss.getStudent(id);
		return s;
	}
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student s) {
		Student s1=ss.updateStudent(s);
		return  s1;
	}
}
