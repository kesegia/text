package com.misaka.text.controller;

import com.misaka.text.service.impl.LoggerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

    @Autowired
    private LoggerServiceImpl loggerServiceImpl ;

    @GetMapping("login")
    public String addLogger() {
        loggerServiceImpl.addLogger();
        return "ssss";
        /*return BaseResponse.success(null);*/
    }


}
