package ru.yandex.practicum.catsgram.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.model.User;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(PostController.class);

    private HashMap<String, User> users= new HashMap<>();

    @GetMapping
    public ArrayList<User> findAll() {
        log.debug("Текущее количество пользователей: {}", users.size());
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
