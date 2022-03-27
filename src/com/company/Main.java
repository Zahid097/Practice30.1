package com.company;

import com.company.enumses.Gender;
import com.company.model.User;
import com.company.service.UserService;
import com.company.service.impl.UserServiceImpl;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user1 = new User(23, "Altyn", 1, Gender.MAN);
        User user2 = new User(19, "Almaz", 2, Gender.MAN);
        User user3 = new User(32, "Anara", 3, Gender.WOMEN);

        userService.addUsers(user1);
        userService.addUsers(user2);
        userService.addUsers(user3);

        try {
            userService.findToId(44);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        userService.getIdUsers();
        System.out.println();

        userService.removeId(2);
        userService.getIdUsers();

        Map<Integer, String> map = new HashMap<>();
        map.put(18, "Almaz");
        map.put(20, "Aman");
        map.put(23, "Asan");
        map.put(26, "Altyn");

        for (Map.Entry<Integer, String> ab : map.entrySet()) {
            System.out.println(ab.getKey() + " " + ab.getValue());
        }

        map.entrySet().stream().forEach(value -> System.out.println(value.getKey() + " : " + value.getValue()));

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        Set<User> users = new HashSet<>();

        users.add(new User(19, "Aman", 1, Gender.MAN));
        users.add(new User(18, "Asan", 2, Gender.MAN));
        users.add(new User(29, "Almaz", 3, Gender.MAN));
        users.add(new User(22, "Altyn", 4, Gender.MAN));
        users.add(new User(19, "Aman", 1, Gender.MAN));

        TreeSet<User> sort = new TreeSet<>(users);
        for (User ab : sort) {
            System.out.println(ab);

        }
    }
}


