package com.http.client.controller;

import com.common.ResultMsg;
import com.http.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/info/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "id")
    @ResponseBody
    public ResultMsg getInfo() {
        userService.getUserInfo();
        return new ResultMsg(200, "请求成功");
    }
}
