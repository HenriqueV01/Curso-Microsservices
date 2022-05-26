package com.henriquevenancio.foo.services;

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
		
		return person ;
		
	}

}
