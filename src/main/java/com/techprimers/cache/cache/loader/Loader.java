package com.techprimers.cache.cache.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.techprimers.cache.model.User;
import com.techprimers.cache.repository.UserRepository;

@Component
public class Loader {
	@Autowired
	UserRepository userRepository;
	
	@PostConstruct
	@Transactional
	public void loadAll() {
		System.out.println("Loading data...");
		userRepository.saveAll(getData());
		System.out.println("Loading completed.");
	}
	
	private List<User> getData() {
		List<User> users = new ArrayList<>();
		users.add(new User("Frank Zappa", "Engineering", 1000000L));
		users.add(new User("Rod Jefferson", "Test", 1200000L));
		users.add(new User("Mike Oldfield", "Infrastructure", 1500000L));
		return users;
	}
}
