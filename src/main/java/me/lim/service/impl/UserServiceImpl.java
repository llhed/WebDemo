package me.lim.service.impl;

import me.lim.dao.UserDAO;
import me.lim.model.User;
import me.lim.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lim on 2015/8/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public int insertUser(User user) {
        // TODO Auto-generated method stub
        Map userMap = new HashMap();
        userMap.put("state",user.getState());
        userMap.put("nickname",user.getNickname());
        return userDAO.insertUser(userMap);
    }

    public void  delUser(int id){
        userDAO.delUser(id);
    }

    public User findUser(int id) {
        return userDAO.findUser(id);
    }

    public List<User> findAllUser() {
        return userDAO.findAllUser();
    }

    public void updateUser(User user){
        userDAO.updateUser(user);
    }

}

