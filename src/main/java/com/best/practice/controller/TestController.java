package com.best.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/**
 */
@RestController

public class TestController {


    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String getHello() {
        return "成功";
    }


}
