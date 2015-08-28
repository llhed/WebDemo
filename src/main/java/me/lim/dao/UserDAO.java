package me.lim.dao;

import me.lim.model.User;

/**
 * Created by lim on 2015/8/26.
 */
public interface UserDAO {

    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);


}
