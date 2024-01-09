package com.example.mothertochild.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="child")
public class Child 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="child_id")
	private long cId;
	
	@Column(name="child_name")
	private String cName;
	
	@Column(name="child_age")
	private String cAge;
	
	@Column(name="child_gender")
	private String cGender;
	
	@ManyToOne
	private Mother mother;

	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	public String getcGender() {
		return cGender;
	}

	public void setcGender(String cGender) {
		this.cGender = cGender;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}
}
