package sumu.learning.DialyDiary.DialyDiary.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sumu.learning.DialyDiary.DialyDiary.model.Person;

public interface PersonRepository extends JpaRepository<Person, String>{
	Person findByUsername(String username);
	
	List<Person> findByAge(int age);
}
