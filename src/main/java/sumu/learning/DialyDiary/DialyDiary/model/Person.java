package sumu.learning.DialyDiary.DialyDiary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {
	
	@Id
	String username;
	String password;
	int age;
	String address;
	
	
}
