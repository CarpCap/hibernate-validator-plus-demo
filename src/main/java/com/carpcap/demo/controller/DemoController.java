package com.carpcap.demo.controller;

import com.carpcap.demo.dto.User;
import com.carpcap.validatorplus.groups.PostGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CarpCap
 */
@RestController
public class DemoController {

    @RequestMapping("test")
    public String test(@Validated(PostGroup.class) User user) {
        return user.getUser();
    }
}
