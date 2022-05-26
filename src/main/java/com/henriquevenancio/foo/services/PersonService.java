package com.henriquevenancio.foo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.henriquevenancio.foo.model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {		
		Person person =  new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Henrique");
		person.setLasttName("Venancio");
		person.setAddress("Recife - PE");
		person.setGender("Masculino");		
		
		return person;
		
	}
	
	public List<Person> findAll() {		
		List<Person> persons = new ArrayList<Person>();
		
		for (int i = 0; i < 10; i++) {
			Person person = mockPerson(i);			
			persons.add(person);
		}		
		return persons;		
	}

	private Person mockPerson(int i) {
		Person person =  new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Henrique" + i);
		person.setLasttName("Venancio" + i);
		person.setAddress("Recife - PE");
		person.setGender("Masculino");		
		
		return person;
	}
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
