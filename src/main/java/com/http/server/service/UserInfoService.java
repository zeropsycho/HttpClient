package com.http.server.service;

import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    public String getInfo(String id) {
        return "获取服务器端的信息,id：" + id;
    }
}
