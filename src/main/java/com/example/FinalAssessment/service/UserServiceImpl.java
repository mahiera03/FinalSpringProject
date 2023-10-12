package com.example.FinalAssessment.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalAssessment.entity.User;
import com.example.FinalAssessment.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;
    @Override
    public User postNewUser(User user) {
        return userRepo.save(user);
    }
}

