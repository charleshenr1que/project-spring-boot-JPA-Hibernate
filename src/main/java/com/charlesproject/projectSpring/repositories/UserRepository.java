package com.charlesproject.projectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlesproject.projectSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
