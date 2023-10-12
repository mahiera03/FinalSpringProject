package com.example.FinalAssessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalAssessment.entity.User;



public interface UserRepository extends JpaRepository<User,Integer>{

}
