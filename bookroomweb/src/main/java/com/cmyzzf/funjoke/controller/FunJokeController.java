package com.cmyzzf.funjoke.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cmyzzf.funjoke.model.FunJokeModel;
import com.cmyzzf.funjoke.service.IFunJokeTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zephyr on 2018/1/10.
 */
@Controller
@RequestMapping("/funjoke")
public class FunJokeController {


    @Reference(version = "1.0")
    private IFunJokeTestService funJokeTestService;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public void test(){
        funJokeTestService.testFunJoke();
        System.out.println("Hello");
    }

    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public FunJokeModel getFunJokeMode(){
        return  funJokeTestService.getFunJokeModel();
    }


}
