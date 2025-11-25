package com.carpcap.demo.controller;

import com.carpcap.demo.dto.User;
import com.carpcap.demo.service.DemoService;
import com.carpcap.hvp.groups.CGetDef;
import com.carpcap.hvp.groups.CPostDef;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private DemoService demoService;

    @RequestMapping("testPostDef")
    public String testPostDef(@Validated(CPostDef.class) @RequestBody User user, HttpServletRequest request) {
        String header = request.getHeader("Accept-Language");
        System.out.println("Language:"+header);
        return "success testPostDef : "+user.getUser();
    }


    @RequestMapping("testGetDef")
    public String testGetDef(@Validated(CGetDef.class) @RequestBody User user, HttpServletRequest request) {
        String header = request.getHeader("Accept-Language");
        System.out.println("Language:"+header);
        return "success testGetDef : "+user.getUser();
    }



    @RequestMapping("testService")
    public String testService(String phone, HttpServletRequest request) {



        return "success test "+demoService.test(phone);
    }
}
