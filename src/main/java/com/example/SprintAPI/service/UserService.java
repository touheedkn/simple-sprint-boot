package com.example.SprintAPI.service;

import com.example.SprintAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User("John", 28, "john@gmail.com");
        User user2 = new User("Jane", 26, "jane@gmail.com");
        User user3 = new User("Zane", 46, "jane@gmail.com");
        User user4 = new User("Zoe", 16, "jane@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }
    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for(User user:userList){
            if(id.equals(user.getId())){
                optional = Optional.of(user);
                break;
            }
        }
        return Optional.ofNullable(optional.orElse(null));
    }

    public User[] getUsers() {
        return userList.toArray(new User[userList.size()]);
    }

    public void addUser(String name, int age, String email) {
        User user = new User(name, age, email);
        userList.add(user);
    }
}
