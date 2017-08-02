package com.qzj.reflect;

import java.lang.reflect.Field;

/**
 *
 public Field getDeclaredField(String name) // 获得该类自身声明的所有变量，不包括其父类的变量
 public Field getField(String name) // 获得该类自所有的public成员变量，包括其父类变量

 */
public class ReflectDemo3 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class reflectDemo3Class = Class.forName("com.qzj.reflect.Code");

        reflectDemo3Class.getDeclaredFields();      //获取class对象的所有属性
        reflectDemo3Class.getFields();              //获取class对象的public属性

        reflectDemo3Class.getDeclaredField("name");     //获取class指定属性
        //reflectDemo3Class.getField("name");             //获取class指定的public属性

        Class c = Class.forName("com.qzj.reflect.Code");
        Field field = c.getDeclaredField("message");    //因为msg变量是private的，所以不能用getField方法

        Object o = c.newInstance();
        field.setAccessible(true);//设置是否允许访问，因为该变量是private的，所以要手动设置允许访问，如果msg是public的就不需要这行了。

        Object msg = field.get(o);
        System.out.println(msg);
    }

}
