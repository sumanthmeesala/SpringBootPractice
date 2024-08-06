package sumu.learning.DialyDiary.DialyDiary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sumu.learning.DialyDiary.DialyDiary.model.Person;
import sumu.learning.DialyDiary.DialyDiary.repo.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepo;
	
	public String add(Person person) {
		Optional<Person> existPerson = personRepo.findById(person.getUsername());
		if(existPerson.isEmpty()) {
			personRepo.save(person);
			return "Person Added Successfully";
		}
		return "Person with "+person.getUsername() + "already Exists";
	}
	
	public List<Person> getAllPerson() {
		return personRepo.findAll();
	}
	
	public Person getPersonByUserName(String username) {
		return personRepo.findByUsername(username);
	}
	
	public List<Person> getPersonByAge(int age) {
		return personRepo.findByAge(age);
	}

}
