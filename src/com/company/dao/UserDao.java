package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    ArrayList<User> users = new ArrayList<>();


    public void addUsers(User user) {
        users.add(user);
    }

    public void findToUsers(int id) {
        List l = users.stream().map(x -> x.getId()).toList();
        if (l.contains(id)) {
            for (User user : users) {
                if (user.getId() == id) {
                    System.out.println(user);
                }
            }
        } else {
            throw new RuntimeException("Системада мындай id:" + id + " менен ползователь жок!");
        }
    }

    public void removeIdUsers(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    public void getIdUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Override
    public String toString() {
        return "UserDao{" + "users=" + users + '}';
    }
}
