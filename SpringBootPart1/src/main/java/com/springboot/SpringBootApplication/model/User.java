package com.springboot.SpringBootApplication.model;

public class User {
        private long id;
        private String name;
        private String surname;

        public User( String name, String surname){
            this.name = name;
            this.surname = surname;
        }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    // add constructor, getter and setter
    }

