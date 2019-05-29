package com.zhiyun.shiro.base;

import lombok.Data;

@Data
public class BaseResult<T> {
    /**
     * 执行状态
     */
    private Boolean result = true;
    /**
     * 执行信息
     */
    private String message = "成功";
    /**
     * 数据体
     */
    private T data;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
