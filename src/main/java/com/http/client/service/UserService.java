package com.http.client.service;

import com.common.ResultMsg;
import com.http.client.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserApi userApi;

    public void getUserInfo() {
        ResultMsg info = userApi.getInfo("123");
        System.out.println("获取到用户的信息：" + info);
    }
}
