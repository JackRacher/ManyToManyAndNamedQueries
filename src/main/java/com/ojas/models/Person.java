package com.ojas.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = {
		@NamedQuery(name = "Person.findPersonByLastName", query = "select p from Person p where p.lastName = ?1"),
		@NamedQuery(name = "Person.findPersonInfoByFirstNameOrEmail", query = "select p from Person p where p.firstName=?1 or p.email=?2"),
		@NamedQuery(name = "Person.fetchByLastNameLength", query = "select p from Person p where CHAR_LENGTH(p.lastName) =:length")
})
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Date creationDate;
	
	public Person(){
		
	}
	
	
	public Person(int i, String fristName, String lastName, String email, Date creationDate) {
		super();
		this.id = i;
		this.firstName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}
	
	public Person(String fristName, String lastName, String email, Date creationDate) {
		super();
		this.firstName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristName() {
		return firstName;
	}
	public void setFristName(String fristName) {
		this.firstName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fristName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	
}
