package com.cmyzzf.funjoke.mapper;


import com.cmyzzf.funjoke.model.FunJokeModel;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by zephyr on 2018/2/1.
 */
public interface IFunJokeMapper extends Mapper<FunJokeModel> {

    FunJokeModel getFunJokeModel();

}
