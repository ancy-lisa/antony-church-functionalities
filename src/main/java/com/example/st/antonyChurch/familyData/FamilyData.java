package com.example.st.antonyChurch.familyData;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Family Information")
public class FamilyData {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private long id;
	 @Column(name = "Name", nullable = false)
	 	private String name;
	 @Column(name = "Gender", nullable = false)
	 private String gender;
	 @Column(name = "Relationship", nullable = false)
	  	private String relationship;
	 @Column(name = "family Id", nullable = false)
	  	private long familyId;
	 @Column(name = "Date of birth", nullable = false)
	  	private LocalDate dateOfBirth;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getFamilyId() {
		return familyId;
	}
	public void setFamilyId(long familyId) {
		this.familyId = familyId;
	}
	public String getGender() {
	        return gender;
	}
	public void setGender(String gender) {
	        this.gender = gender;
	}
}
