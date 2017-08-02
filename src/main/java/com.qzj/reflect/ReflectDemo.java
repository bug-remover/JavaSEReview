package com.qzj.reflect;

/**
 *
 * 假设存在一个Code类以及它的一个实例code1
 Class c1 = Code.class; 这说明任何一个类都有一个隐含的静态成员变量class，这种方式是通过获取类的静态成员变量class得到的
 Class c2 = code1.getClass(); code1是Code的一个对象，这种方式是通过一个类的对象的getClass()方法获得的
 Class c3 = Class.forName("com.trigl.reflect.Code"); 这种方法是Class类调用forName方法，通过一个类的全量限定名获得
 *
 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        //第一种
        Class reflectDemoClass1 = ReflectDemo.class;
        System.out.println(reflectDemoClass1.getName());

        //第二种
        ReflectDemo demo = new ReflectDemo();
        Class reflectDemoClass2 = demo.getClass();
        System.out.println(reflectDemoClass2.getName());

        //第三种
        Class reflectDemoClass3 = Class.forName("com.qzj.reflect.ReflectDemo");
        System.out.println(reflectDemoClass3.getName());
    }

}
