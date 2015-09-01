package me.lim.service.service;

import me.lim.model.User;

import java.util.List;



public interface UserService {

    public int insertUser(User user);

    public void delUser(int id);

    public User findUser(int id);

    public List<User> findAllUser();

    public void updateUser(User user);


}
