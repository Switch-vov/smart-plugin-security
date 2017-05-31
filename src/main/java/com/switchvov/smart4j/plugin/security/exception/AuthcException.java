package com.switchvov.smart4j.plugin.security.exception;

/**
 * 认证异常(当非法访问时抛出)
 * Created by Switch on 2017/5/31.
 */
public class AuthcException extends Exception {

    public AuthcException() {

    }

    public AuthcException(String message) {
        super(message);
    }

    public AuthcException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthcException(Throwable cause) {
        super(cause);
    }
}
