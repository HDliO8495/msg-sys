package com.sdx.ms.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdx.ms.common.Results;
import com.sdx.ms.domain.User;
import com.sdx.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaolong on 2017/12/18.
 */
@RestController
@RequestMapping("/xiaolong/userController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUsers",method = RequestMethod.GET)
    public List<User> selectUsers(User user, Integer pageNum, Integer pageSize){
        List<User> list = new ArrayList<User>();
        list=userService.selectUsers(user,pageNum,pageSize);
        return list;
    }

    @RequestMapping(value = "/selectUsers2",method = RequestMethod.GET)
    public List<User> selectUsers2(User user, Integer ifPage, Integer pageNum, Integer pageSize, HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<User> list = new ArrayList<User>();
        list=userService.selectUsers2(user,ifPage,pageNum,pageSize);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(list);
        String callback = request.getParameter("callback");
        //PrintWriter printWriter = response.getWriter();
        //printWriter.write(callback+"("+json+")")
        Map<String,String> map = new HashMap<String,String>();
        map.put(callback,"1234");
        return list;
    }

    //是否存在用户
    @RequestMapping(value = "/selectUserExists",method = RequestMethod.GET)
    public Integer selectUserExists(User user){
        return userService.selectUserExists(user);
    }

    //是否存在用户
    @RequestMapping(value = "/selectUser",method = RequestMethod.GET)
    public Object selectUser(User user){
        if(null == user.getUserName() || "".equals(user.getUserName())){
            return Results.PARAMETER_INCORRENT;
        }
        user = userService.selectUser(user);
        Results.Result result = Results.SUCCESS;
        result.setResult(user);
        return result;
    }

}
