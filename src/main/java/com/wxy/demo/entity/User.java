package com.wxy.demo.entity;

import lombok.Data;

/**
 * @Author wangxy
 * @Date 2019/6/20 22:39
 * @Description 用户实体类
 **/
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
