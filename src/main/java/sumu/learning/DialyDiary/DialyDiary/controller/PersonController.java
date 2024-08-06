package sumu.learning.DialyDiary.DialyDiary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sumu.learning.DialyDiary.DialyDiary.model.Person;
import sumu.learning.DialyDiary.DialyDiary.service.PersonService;

@RequestMapping("person")
@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/")
	public String welcomeMessage() {
		return "<h1>Hello, Welcome to the Webpage!</h1>";
	}
	
	@PostMapping("/add")
	public String something(@RequestBody Person person) {
		return personService.add(person);
	}
	
	@GetMapping("/getAllPersons")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}
	
	@GetMapping("/getByUsername/{username}")
	public Person getPersonById(@PathVariable String username) {
		return personService.getPersonByUserName(username);
	}
	
	@GetMapping("/getByAge/{age}")
	public List<Person> getPersonByAge(@PathVariable int age) {
		return personService.getPersonByAge(age);
	}
	
}
