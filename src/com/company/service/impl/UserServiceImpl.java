package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDao();


    @Override
    public void addUsers(User user) {
        userDao.addUsers(user);
    }

    @Override
    public void findToId(int id) {
        userDao.findToUsers(id);
    }

    @Override
    public void removeId(int id) {
        userDao.removeIdUsers(id);
    }

    @Override
    public void getIdUsers() {
        userDao.getIdUsers();
    }
}
