package com.crudapp.service;

import com.crudapp.model.User;
import java.util.List;

public interface UserService {

    Integer insert(User user);

    List<User> getUsers();

    User getUserById(Integer id);

    Integer updateUser(User user);

    Integer deleteUser(Integer id);

}
