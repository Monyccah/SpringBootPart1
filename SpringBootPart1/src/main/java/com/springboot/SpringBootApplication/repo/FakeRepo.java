package com.springboot.SpringBootApplication.repo;

import com.springboot.SpringBootApplication.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRepo  implements FakeRepoInterface{

    List<User> users = new ArrayList<>();
    @Override
    public void insertUser(String name, String surname) {

        User user = new User( name, surname);
        users.add(user);
    }

    @Override
    public User findUserById(long id) {

        for (User user: users){

            if (id == user.getId()){
                User user1 = new User(user.getName(), user.getSurname());
                return user1;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(long id) {

        for (User user: users){

            if(id == user.getId()){
                users.remove(user);
            }
        }

    }
}
