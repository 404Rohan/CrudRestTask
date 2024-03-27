package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String sname;
private String saddress;
private Long contactno;
public Long getContactno() {
	return contactno;
}
public void setContactno(Long contactno) {
	this.contactno = contactno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}



}
