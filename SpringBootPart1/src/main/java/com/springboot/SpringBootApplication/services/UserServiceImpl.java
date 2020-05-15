package com.springboot.SpringBootApplication.services;


import com.springboot.SpringBootApplication.model.User;
import com.springboot.SpringBootApplication.repo.FakeRepo;
import com.springboot.SpringBootApplication.repo.FakeRepoInterface;

public class UserServiceImpl implements UserService{

    private FakeRepoInterface fakeRepoInterface;
    public UserServiceImpl(FakeRepoInterface fakeRepoInterface){
        this.fakeRepoInterface = fakeRepoInterface;
    }
    @Override
    public void addUser(String name, String surname) {

        fakeRepoInterface.insertUser(name, surname);
        System.out.println(name +" "+ "entered");
    }

    @Override
    public void removeUser(long id) {
        User user = fakeRepoInterface.findUserById(id);
        if (user != null){
            fakeRepoInterface.deleteUser(id);
            System.out.println(user.getName() +" "+ "removed");
        }

    }

    @Override
    public User getUser(long id) {
        User user = fakeRepoInterface.findUserById(id);
        if (user != null){
            System.out.println("hello "+ user.getName());
        }
        return null;
    }
}
