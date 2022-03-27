package com.company.model;

import com.company.enumses.Gender;

import java.util.Objects;

public class User implements Comparable<User> {
    private int age;
    private String name;
    private int id;
    private Gender gender;

    public User() {
    }

    public User(int age, String name, int id, Gender gender) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" + "age=" + age + ", name='"
                + name + '\'' + ", id=" + id +
                ", gender=" + gender + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && id == user.id && Objects.equals(name, user.name) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, id, gender);
    }

    @Override
    public int compareTo(User user) {
        return Integer.compare(user.getAge(), this.age);
    }
}
