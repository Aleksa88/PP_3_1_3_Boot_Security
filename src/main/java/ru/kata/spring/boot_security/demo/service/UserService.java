package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<ru.kata.spring.boot_security.demo.model.User> getAllUsers();
    User saveUser(User user, Role role);
    void removeUserById(Integer id);
    ru.kata.spring.boot_security.demo.model.User getUserById(Integer id);
    ru.kata.spring.boot_security.demo.model.User findByUsername(String username);

}