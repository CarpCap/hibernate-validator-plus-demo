package com.carpcap.demo.dto;

import com.carpcap.hvp.annotation.*;
import com.carpcap.hvp.groups.CGet;
import com.carpcap.hvp.groups.CPost;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.validation.constraints.NotBlank;
import javax.validation.groups.Default;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Kwon
 */
public class User {
    @NotBlank(groups = CPost.class,message = "名字不能为空")
    private String name;
    private Integer age;
    private Integer sex;
    @CDateRange(groups = CPost.class,min = "2022-04-01",max = "2022-06-01",allowNull = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date d1;
    @CDateRange (groups = {CPost.class, Default.class},min = "2023-04-01",max = "2023-06-01")
    private String d2;
    @CPhone
    private String phone;
    @CIpv4(groups = CPost.class)
    private String ip;
    @CDomain(groups = CPost.class)
    private String domain;

    @CIdCard
    private String idCard;

    @CAccount(max = 9,allowNull = false)
    private String user;
    @CPassword
    private String passwd;


    @CBankCard(groups = CGet.class,allowNull = false)
    private String bankCard;


    @CMoney(groups = CGet.class,decimalPlaces=3)
    private String moneyStr;

    @CMoney(groups = CGet.class)
    private Integer moneyInt;


    @CMoney(groups = CGet.class,allowNull = false)
    private BigDecimal moneyBig;


    @CMacAddress(groups = CGet.class,allowNull = false)
    private String mac;


    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getMoneyStr() {
        return moneyStr;
    }

    public void setMoneyStr(String moneyStr) {
        this.moneyStr = moneyStr;
    }

    public Integer getMoneyInt() {
        return moneyInt;
    }

    public void setMoneyInt(Integer moneyInt) {
        this.moneyInt = moneyInt;
    }

    public BigDecimal getMoneyBig() {
        return moneyBig;
    }

    public void setMoneyBig(BigDecimal moneyBig) {
        this.moneyBig = moneyBig;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
