package com.volunteer.controller;

import com.volunteer.entity.TestTable;
import com.volunteer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.Null;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("main")
    @ResponseBody
    public List<TestTable> test(){
        //测试
        List<TestTable> list = testService.getList();
        return list;
    }
}
