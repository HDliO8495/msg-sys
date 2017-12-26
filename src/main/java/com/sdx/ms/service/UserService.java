package com.sdx.ms.service;

import com.sdx.ms.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/20.
 */
public interface UserService {

    public List<User> selectUsers(User user, Integer pageNum, Integer pageSize);

    public List<User> selectUsers2(User user,Integer ifPage,Integer pageNum,Integer pageSize);

    //是否存在用户
    public Integer selectUserExists(User user);

    //查找某用户信息
    public User selectUser(User user);

}
