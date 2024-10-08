package ru.yandex.practicum.catsgram.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.controller.PostController;
import ru.yandex.practicum.catsgram.model.User;

import java.util.ArrayList;
import java.util.HashMap;

@Service

public class UserService {
    private static final Logger log = LoggerFactory.getLogger(PostController.class);
    private final HashMap<String, User> users= new HashMap<>();

    public ArrayList<User> findAll() {
        log.debug("Текущее количество пользователей: {}", users.size());
        return new ArrayList<User>(users.values());
    }

    public User create(User user) {
        users.put(user.getEmail(), user);
        return user;
    }

    public User update(User user) {
        users.put(user.getEmail(), user);
        return user;
    }
}
