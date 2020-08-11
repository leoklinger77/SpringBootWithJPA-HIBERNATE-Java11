package com.leandroklinger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroklinger.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
