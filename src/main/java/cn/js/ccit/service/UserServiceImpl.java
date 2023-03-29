package cn.js.ccit.service;

import cn.js.ccit.dao.UserDao;
import cn.js.ccit.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public User getById(Integer id){
        return userDao.getById(id);
    }

}
