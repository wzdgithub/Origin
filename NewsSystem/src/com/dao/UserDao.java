package com.dao;

import com.bean.User;

import java.util.List;

/**
 * Created by admin on 2016/3/16.
 */
public interface UserDao {
    User login(String username, String password);
    boolean register(String username, String password, String email);
    List<User> selectUser(int start, int end);
    boolean deleteUser(int id);
    boolean updateUserDetails(int id, String name, String sex, String telephone, String email);
    User selectUserById(int id);
    boolean updateUserIcon(String icon, int id);
    int selectUserSum();
    boolean selectUserByName(String username);
}
