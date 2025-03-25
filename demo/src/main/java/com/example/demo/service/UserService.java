package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.DemoApplication;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final DemoApplication demoApplication;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository, DemoApplication demoApplication) {
        this.userRepository = userRepository;
        this.demoApplication = demoApplication;
    }

    public String handleHello() {
        return "Hello from service";
    }

    public User handleSaveUser(User user) {
        User david = this.userRepository.save(user);
        return david;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public void deleteById(long id) {
        this.userRepository.deleteById(id);
    }
}
