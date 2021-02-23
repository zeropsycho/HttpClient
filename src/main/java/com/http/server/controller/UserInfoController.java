package com.http.server.controller;

import com.common.ResultMsg;
import com.http.server.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.http.Path;

@RestController
@RequestMapping("/user/")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "get/info/{id}")
    @ResponseBody
    public ResultMsg getUserInfo(@PathVariable String id) {
        return new ResultMsg(200, "成功", userInfoService.getInfo(id));
    }
}
