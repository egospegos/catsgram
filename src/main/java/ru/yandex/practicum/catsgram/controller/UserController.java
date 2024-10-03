package ru.yandex.practicum.catsgram.controller;


import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.model.User;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/users")
public class UserController {

    private HashMap<String, User> users= new HashMap<>();

    @GetMapping
    public ArrayList<User> findAll() {
        return new ArrayList<User>(users.values());
    }

    @PostMapping
    public User create(@RequestBody User user) {
        users.put(user.getEmail(), user);
        return user;
    }

    @PutMapping
    public User update(@RequestBody User user) {
        users.put(user.getEmail(), user);
        return user;
    }


}
