package com.brkbthn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//401 Yetkisiz giriş
@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class ResourceAuthorizedException extends RuntimeException{
    public ResourceAuthorizedException(String message) {
        super(message);
    }
}
