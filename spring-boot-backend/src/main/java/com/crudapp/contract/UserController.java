package com.crudapp.contract;

import com.crudapp.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RequestMapping(value = "/Users")
public interface UserController {

    @PostMapping(value= "/createUser")
    ResponseEntity<Integer>createUser(@RequestBody User user);

    @GetMapping(value= "/getUsers")
    ResponseEntity<List<User>> getUsers();

    @GetMapping(value= "/getUsers/{id}")
    ResponseEntity<User> getUserById(@PathVariable Integer id);

    @PutMapping(value = "/updateUser")
    ResponseEntity<Integer> updateUser(@RequestBody User user);

    @DeleteMapping(value= "/deleteUser/{id}")
    ResponseEntity<Integer> deleteUser(@PathVariable Integer id);

}
