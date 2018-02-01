package com.cmyzzf.funjoke.service.impl;

import com.cmyzzf.funjoke.mapper.IFunJokeMapper;
import com.cmyzzf.funjoke.model.FunJokeModel;
import com.cmyzzf.funjoke.service.IFunJokeTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zephyr on 2018/1/8.
 */
@Service("funJokeTestService")
public class FunJokeTestServiceImpl implements IFunJokeTestService{

    private static final Logger LOGGER = LoggerFactory.getLogger(FunJokeTestServiceImpl.class);

    @Autowired
    private IFunJokeMapper funJokeMapper;

    @Override
    public void testFunJoke() {
        System.out.println("hello,world");
    }

    @Override
    public FunJokeModel getFunJokeModel() {
        LOGGER.info("hello----mybatis");
        return funJokeMapper.getFunJokeModel();
    }


}
