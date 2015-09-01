package me.lim.dao;

import me.lim.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by lim on 2015/8/26.
 */
public interface UserDAO {


    public int insertUser(Map userMap);

    public void delUser(int id);

    public User findUser(int id);

    public List<User> findAllUser();

    public void updateUser(User user);

}
