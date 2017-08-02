package com.qzj.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * public Method getDeclaredMethod(String name, Class<?>... parameterTypes) // 得到该类所有的方法，不包括父类的
 * public Method getMethod(String name, Class<?>... parameterTypes) // 得到该类所有的public方法，包括父类的
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class reflectDemo2Class = Code.class;

        reflectDemo2Class.getDeclaredMethods();
        reflectDemo2Class.getMethods();

        reflectDemo2Class.getMethod("print", Code.class);
        reflectDemo2Class.getDeclaredMethod("print", Code.class);

        Class codeClass = Class.forName("com.qzj.reflect.Code");        //先生成class
        Object code = codeClass.newInstance();                          //newInstance可以初始化一个实例

        Method setNameMethod = codeClass.getMethod("setName", String.class);    //获取方法
        setNameMethod.invoke(code, "codeName");                                 //通过invoke调用该方法，参数第一个为实例对象，后面为具体参数值

        Method method = codeClass.getMethod("print", Code.class);
        method.invoke(code, code);
    }

}
