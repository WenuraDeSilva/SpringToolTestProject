package com.codefestday02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefestday02.entities.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer>{

}
