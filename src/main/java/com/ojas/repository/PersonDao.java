package com.ojas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.models.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {

	List<Person> findPersonInfoByFirstNameOrEmail(String fristName, String email);
	List<Person> findByLastName(String lastName);
	List<Person> findByFirstName(String firstName);
	List<Person> findPersonByLastName(String lastName);
	List<Person> findByFirstNameOrLastName(String fristName, String lastName);
	List<Person> fetchByLastNameLength(long length);
}
