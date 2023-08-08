package com.pack.blogrestwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.blogrestwebservices.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
