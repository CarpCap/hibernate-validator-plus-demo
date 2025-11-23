package com.carpcap.demo.controller;

import com.carpcap.demo.dto.User;
import com.carpcap.hvp.groups.CPostDef;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author CarpCap
 */
@RestController
public class DemoController {

    @RequestMapping("test")
    public String test(@Validated(CPostDef.class) @RequestBody User user, HttpServletRequest request) {
        String header = request.getHeader("Accept-Language");


        System.out.println(header);


        return "result: "+user.getUser();
    }
}
