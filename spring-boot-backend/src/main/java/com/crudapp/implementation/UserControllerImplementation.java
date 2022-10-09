package com.crudapp.implementation;

import com.crudapp.contract.UserController;
import com.crudapp.model.User;
import com.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserControllerImplementation implements UserController {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<Integer> createUser(User user) {
        Integer result = userService.insert(user);
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @Override
    public ResponseEntity<User> getUserById(Integer id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @Override
    public ResponseEntity<Integer> updateUser(User user){
        Integer result=userService.updateUser(user);
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<Integer> deleteUser(Integer id){
        Integer result = userService.deleteUser(id);
        return ResponseEntity.ok(result);
    }
    }

