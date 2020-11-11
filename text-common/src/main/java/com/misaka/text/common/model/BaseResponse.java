package com.misaka.text.common.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {
    /**
     * 错误码，0代表正常，其他代表异常
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;

    public static BaseResponse success(Object data) {
        BaseResponse response = new BaseResponse();
        response.code = 0;
        response.msg = "ok";
        response.data = data;
        return response;
    }

    public static BaseResponse fail(String msg) {
        BaseResponse response = new BaseResponse();
        response.code = -1;
        response.msg = "执行异常";
        return response;
    }
}
