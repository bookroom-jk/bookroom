package com.cmyzzf.funjoke.model;

import java.io.Serializable;

/**
 *
 * @author zephyr
 * @date 2018/2/1
 */
public class FunJokeModel implements Serializable {

    private static final long serialVersionUID = 4751429106099677392L;

    private String content;

    private String id;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
