package com.cmyzzf.funjoke.service.impl;

import com.zzfcmy.funjoke.service.IFunJokeTestService;
import org.springframework.stereotype.Service;

/**
 * Created by zephyr on 2018/1/8.
 */
@Service("funJokeTestService")
public class FunJokeTestServiceImpl implements IFunJokeTestService{

    @Override
    public void testFunJoke() {
        System.out.println("hello,world");
    }
}
