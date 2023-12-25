package com.kouenjirokusuke.crudapp.dao;

import com.kouenjirokusuke.crudapp.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
}
