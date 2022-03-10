package com.lb.vo;

import lombok.Data;

/**
 * @version 1.0.0
 * @ClassName ResponseResult.java
 * @Description TODO
 * @createTime 2022年01月15日 18:16:00
 */
@Data
public class ResponseResult {
    private String code;
    private String message;
    private String data;

    public ResponseResult() {}

    public ResponseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
