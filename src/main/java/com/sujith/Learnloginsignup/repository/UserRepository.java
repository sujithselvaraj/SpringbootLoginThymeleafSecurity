package com.sujith.Learnloginsignup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujith.Learnloginsignup.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	}
