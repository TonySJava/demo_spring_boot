package com.demo.controller;

import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.TestService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 不区分get post
     * localhost/test
     *
     * @return String
     */
    @RequestMapping()
    String test() {
        return testService.test();
    }

    /**
     * Get请求
     * localhost/test/test?name=jerome
     *
     * @param name 名字(默认必填)
     * @param age  年龄(非必填)
     * @return String
     */
    @RequestMapping(value = "test", method = RequestMethod.GET)
    String testGet(@RequestParam("name") String name, @RequestParam(value = "age", required = false) String age) {
        return testService.test() + name;
    }

    /**
     * Post请求
     *
     * @return String
     */
    @RequestMapping(value = "test", method = RequestMethod.POST)
    String testPost() {
        return testService.test();
    }

    /**
     * Restful请求
     * localhost/test/test/jerome
     *
     * @param name 名字(默认必填)
     * @return String
     */
    @RequestMapping("test/{name}")
    String testRestful(@PathVariable String name) {
        return testService.test() + name;
    }

    /**
     * 返回Map的json
     *
     * @return Json
     */
    @RequestMapping("testMap")
    Map<String, Object> testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "jerome");
        map.put("age", 26);
        return map;
    }

    /**
     * 返回List的json
     *
     * @return Json
     */
    @RequestMapping("testList")
    List<String> testList() {
        List<String> list = new ArrayList<>();
        list.add("苏志达");
        list.add("jerome");
        return list;
    }

    /**
     * 返回实体的json
     *
     * @return Json
     */
    @RequestMapping("testModel")
    User testModel() {
        return new User("苏志达", 26, 0, new Date(), 99.6);
    }

}
