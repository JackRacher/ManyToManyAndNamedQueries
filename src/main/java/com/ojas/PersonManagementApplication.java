package com.ojas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ojas.models.Person;
import com.ojas.service.PersonService;

@SpringBootApplication
public class PersonManagementApplication implements CommandLineRunner {

	@Autowired
	PersonService service;

	public static void main(String[] args) {

		SpringApplication.run(PersonManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		createPerson();
//		createPersons();
//		getPersonsByName();
//		getPersonByIds();
//		getPersonsByLastName();
//		findPersonInfobyFirstNameorEmail();
//		updatePerson();
//		deletePersonById();
	}

	private void createPerson() {
		Person person = new Person("vijay", "kumar", "vijay@gmail.com", new Date());
		person = service.cretePerson(person);
		System.out.println("saved");

	}

	private void getPersonsByName() {
		List<Person> personList = service.getPersonsByFirstName("Ram");
		for (Person person : personList) {
			System.out.println("Person Object" + person.toString());
		}
	}

	private void getPersonsByLastName() {
		List<Person> personList = service.getPersonsByLastName("Seth");
		for (Person person : personList) {
			System.out.println("Person Object" + person.toString());
		}
	}

	private void findPersonInfobyFirstNameorEmail() {
		List<Person> personList = service.findPersonInfobyFirstNameorEmail("Sita", "abc@gmail.com");
		for (Person person : personList) {
			System.out.println("Person Object" + person.toString());

		}
	}

	private void fetchByLastNameLength() {
		List<Person> personList = service.fetchByLastNameLength(5L);
		for (Person person : personList) {
			System.out.println("Person Object" + person.toString());

		}
	}

	private void updatePerson() {
		Person person = new Person(1, "vijaynew", "kumarnew", "vijum2@gmail.com", new Date());
		service.updatePerson(person);
		System.out.println("updated");
	}

	private void deletePersonById() {
		service.deletePerson(3);
	}

	private void getPersonByIds() {
		List<Integer> personList = new ArrayList<Integer>();
		personList.add(1);
		personList.add(2);
		personList.add(3);
		personList.add(4);
		personList.add(5);
		Iterable<Person> personsList = service.getPersonByIds(personList);
		for (Person person : personsList) {
			System.out.println("Person Object" + person.toString());

		}
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Kiran", "kumar", "kiran@gmail.com", new Date()),
				new Person("Ram", "kumar", "abc@gmail.com", new Date()),
				new Person("Sita", "Laxmi", "sita@gmail.com", new Date()),
				new Person("Lakshamn", "Seth", "lakshman@gmail.com", new Date()));

		Iterable<Person> list = service.cretePersons(personList);
		for (Person person : list) {
			System.out.println("Person Object" + person.toString());

		}

	}

}
