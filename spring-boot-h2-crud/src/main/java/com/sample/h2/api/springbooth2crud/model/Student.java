package com.sample.h2.api.springbooth2crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int studId;
	private String studFabSubject;
	private String studGrade;
	private String studName;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFabSubject() {
		return studFabSubject;
	}
	public void setStudFabSubject(String studFabSubject) {
		this.studFabSubject = studFabSubject;
	}
	public String getStudGrade() {
		return studGrade;
	}
	public void setStudGrade(String studGrade) {
		this.studGrade = studGrade;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	
}
