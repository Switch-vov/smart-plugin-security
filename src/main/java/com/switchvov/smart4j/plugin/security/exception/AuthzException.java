package com.switchvov.smart4j.plugin.security.exception;

/**
 * 授权异常(当权限无效时抛出)
 * Created by Switch on 2017/5/31.
 */
public class AuthzException extends RuntimeException {

    public AuthzException() {
    }

    public AuthzException(String message) {
        super(message);
    }

    public AuthzException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthzException(Throwable cause) {
        super(cause);
    }
}
