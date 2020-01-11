
package com.zeek.springbootlearn.controller;

import com.zeek.springbootlearn.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
class MyController {

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Object getPerson() {

        Person person = new Person();
        person.setId(25);
        person.setName("张三");
        person.setBirthday(new Date());

        return person;
    }
}