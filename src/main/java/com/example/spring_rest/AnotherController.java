package com.example.spring_rest;

import com.example.spring_rest.credentials.InvalidCredentials;
import com.example.spring_rest.user.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AnotherController {

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUUs(UnauthorizedUser e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleIC(InvalidCredentials e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
