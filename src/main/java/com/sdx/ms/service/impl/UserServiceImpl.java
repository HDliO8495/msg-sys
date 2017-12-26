package com.sdx.ms.service.impl;

import com.sdx.ms.common.BaseService;
import com.sdx.ms.common.Results;
import com.sdx.ms.dao.PublicDao;
import com.sdx.ms.domain.User;
import com.sdx.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/20.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private PublicDao publicDao;

    public UserServiceImpl(){}

    public UserServiceImpl(PublicDao publicDao){
        this.publicDao = publicDao;
    }

    public void setPublicDao(PublicDao publicDao){
        this.publicDao = publicDao;
    }

    @Override
    public List<User> selectUsers(User user, Integer pageNum, Integer pageSize) {
        pageNum=1;
        pageSize=10;
        List<User> list=publicDao.selectList("selectUserByID",user,pageNum,pageSize);
        return list;
    }

    @Override
    public List<User> selectUsers2(User user, Integer ifPage, Integer pageNum, Integer pageSize) {
        List<User> list=publicDao.selectList2("selectUserByID",user,ifPage,pageNum,pageSize);
        return list;
    }

    @Override
    public Integer selectUserExists(User user) {

        user=(User) publicDao.selectOne("selectUser",user);
        if(null != user){
            return 1;
        }
        return 0;
    }

    @Override
    public User selectUser(User user) {
        user=(User)publicDao.selectOne("selectUserById",user);
        return user;
    }
}
