package com.qzj.reflect;

public class Code {

    private String id;
    private String name;

    private String message = "测试获取field";

    public Code() {

    }

    private Code(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.println("id-->" + id + ",name-->" + name);
    }

    public void print(Code code) {
        System.out.println("id-->" + code.id + ",name-->" + code.name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
