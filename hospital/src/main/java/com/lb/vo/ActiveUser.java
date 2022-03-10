package com.lb.vo;

import lombok.Data;

/**
 * @version 1.0.0
 * @ClassName ActiveUser.java
 * @Description 注册用户
 * @createTime 2022年01月16日 10:44:00
 */
@Data
public class ActiveUser {
    private String username;
    private String password;
    private String certId;
}
