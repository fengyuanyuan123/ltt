package cn.it.service.impl;

import cn.it.dao.IUserDao;
import cn.it.model.User;
import cn.it.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User selectUser(long userId) {

        return userDao.selectUser(userId);
    }
}
