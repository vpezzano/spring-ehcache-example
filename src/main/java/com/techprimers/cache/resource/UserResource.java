package com.techprimers.cache.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.cache.cache.UserCache;
import com.techprimers.cache.model.User;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {
	@Autowired
	private UserCache userCache;
	
	@GetMapping(value = "/{name}")
	public User getUser(@PathVariable final String name) {
		return userCache.getUser(name);
	}
}
