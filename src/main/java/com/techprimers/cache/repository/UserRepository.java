package com.techprimers.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.techprimers.cache.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);
}
