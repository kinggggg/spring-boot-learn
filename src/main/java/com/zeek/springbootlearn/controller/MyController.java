
package com.zeek.springbootlearn.controller;

import com.zeek.springbootlearn.config.MyConfigBean;
import com.zeek.springbootlearn.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Object getPerson() {

        Person person = new Person();
        person.setId(25);
        person.setName("张三");
        person.setBirthday(new Date());

        System.out.println(myName);
        System.out.println(myAge);
        System.out.println("==============");
        System.out.println(myConfigBean.getMyName());
        System.out.println(myConfigBean.getMyAge());

        return person;
    }
}