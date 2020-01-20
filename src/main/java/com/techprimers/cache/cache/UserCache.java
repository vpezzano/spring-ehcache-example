package com.techprimers.cache.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.techprimers.cache.model.User;
import com.techprimers.cache.repository.UserRepository;

@Component
public class UserCache {
 
	@Autowired
	private UserRepository userRepository;
	
	/*
	 * The value must be the same as specified in the ehcache.xml
	 */
	@Cacheable(value = "userCache", key = "#name")
	public User getUser(String name) {
		System.out.println("Retrieving from db for user: " + name);
		return userRepository.findByName(name);
	}
}
