package com.xttc.service.Imp;

import com.xttc.dao.UserDao;
import com.xttc.domain.User;
import com.xttc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        User login = userDao.login(user);
        return login;
    }
}
