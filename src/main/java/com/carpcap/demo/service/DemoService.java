package com.carpcap.demo.service;

import com.carpcap.hvp.annotation.CPhone;
import com.carpcap.hvp.groups.CPost;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


/**
 * @author CarpCap
 * @since 2025/11/25 20:40
 */
@Service
@Validated
public class DemoService {

    public String test(@CPhone String phone) {

        return "serivce:" + phone;
    }
}
