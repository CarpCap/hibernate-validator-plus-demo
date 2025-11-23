package com.carpcap.demo.common;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;

/**
 * @Description 自定义异常
 * @Author CarpCap
 * @CreateTime 2024/08/15 22:56
 */
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String validExceptionHandler(HttpServletResponse response, MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        StringBuffer stringBuffer = new StringBuffer();
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                //该格式仅仅作为response展示和log作用，前端应自己做校验
                stringBuffer.append(fieldError.getObjectName() + "--" + fieldError.getDefaultMessage() + " ");
            }
        }
        return stringBuffer.toString();
    }

    @ExceptionHandler(ValidationException.class)
    public String validExceptionHandler2(HttpServletResponse response, ValidationException ex) {
        String message = ex.getMessage();
        return message;
    }


}
