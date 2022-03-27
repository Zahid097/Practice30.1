package com.company.service;

import com.company.model.User;

public interface UserService {

    void addUsers(User user);

    void findToId(int id);

    void removeId(int id);

    void getIdUsers();

}
