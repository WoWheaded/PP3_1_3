package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    boolean saveUser(User user);

    User findById(long id);

    boolean deleteById(Long userId);

    void updateUser(User user);

    User getUserByEmail(String email);
}