package com.school.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name="shift")
public class Shift {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="shiftName")
	private String shiftName; 
	
	@Column(name="createdTime")
	private String createdTime;
	
   public Shift() {
		 
	 }

   public Shift(Integer id, String shiftName,String createdTime) {
	   //super();
	   this.id = id;
	   this.shiftName = shiftName;
	   this.createdTime=createdTime;
   }

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getShiftName() {
	return shiftName;
}

public void setShiftName(String shiftName) {
	this.shiftName = shiftName;
}

public String getCreatedTime() {
	return createdTime;
}

public void setCreatedTime(String createdTime) {
	this.createdTime = createdTime;
}
   
   
 

}
