package com.example.mothertochild.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mother")
public class Mother 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mother_id")
	private long mId;
	
	@Column(name="mother_name")
	private String mName;
	
	@Column(name="mother_age")
	private int mAge;
	
	@OneToMany(mappedBy = "mother")
	@JsonIgnore
	private List<Child> childs;

	public long getmId() {
		return mId;
	}

	public void setmId(long mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmAge() {
		return mAge;
	}

	public void setmAge(int mAge) {
		this.mAge = mAge;
	}

	public List<Child> getChilds() {
		return childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}
}
