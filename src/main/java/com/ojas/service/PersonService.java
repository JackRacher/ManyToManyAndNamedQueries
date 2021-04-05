package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.models.Person;
import com.ojas.repository.PersonDao;

@Service
public class PersonService {

	@Autowired
	private PersonDao dao;


	public Person cretePerson(Person person) {
		return dao.save(person);

	}

	public Iterable<Person> cretePersons(List<Person> personList) {

		Iterable<Person> list = dao.saveAll(personList);
		return list;
	}

	public Iterable<Person> getPersonByIds(List<Integer> personList) {
		return dao.findAllById(personList);
	}

	public void deletePerson(Integer personId) {
		dao.deleteById(personId);

	}

	public void updatePerson(Person newperson) {
		dao.save(newperson);

	}

	public List<Person> getPersonsByLastName(String lastName) {
		return dao.findPersonByLastName(lastName);
	}

	public List<Person> findPersonInfobyFirstNameorEmail(String firstName, String email) {

		return dao.findPersonInfoByFirstNameOrEmail(firstName, email);
	}

	public List<Person> getPersonsByFirstName(String string) {
		return dao.findByFirstName(string);
	}

	public List<Person> fetchByLastNameLength(Long length) {
		return dao.fetchByLastNameLength(length);
	}

	public List<Person> findByLastNameAndFirstNameAllIgnoreCase(String firstName, String lastName) {
		return dao.findByFirstNameOrLastName(firstName, lastName);
	}
}
