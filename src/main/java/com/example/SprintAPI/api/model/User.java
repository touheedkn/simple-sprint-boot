package com.example.SprintAPI.api.model;

public class User {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public int setId(int id){
        return this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public int getAge(){
        return age;
    }

    public int setAge(int age){
        return this.age = age;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String email){
        return this.email = email;
    }
}
