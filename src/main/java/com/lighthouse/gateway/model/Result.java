package com.lighthouse.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;


/**
 * @author gjk
 * <p> 2021-12-25 </p>
 * <p>  </p>
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Result<Void> SUCCESS_RESULT = new Result<>(0, "success", null);

    public static final Result<Void> FAIL_RESULT = new Result<>(500, "fail", null);

    private Integer code;

    private String message;


    private T data;

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }

    public static <T> Result<T> successMsg(String msg) {
        return new Result<>(0, msg, null);
    }

    public static <T> Result<T> successData(String msg, T data) {
        return new Result<>(0, msg, data);
    }

    public static <T> Result<T> successData(T data) {
        return new Result<>(0, "success", data);
    }

    public static <T> Result<T> errorMsg(String msg) {
        return new Result<>(500, msg, null);
    }

    public static <T> Result<T> errorMsg(Integer code, String msg) {
        return new Result<>(code, msg, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
