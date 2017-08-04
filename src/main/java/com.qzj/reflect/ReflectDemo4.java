package com.qzj.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) //  获得该类所有的构造器，不包括其父类的构造器
 * public Constructor<T> getConstructor(Class<?>... parameterTypes) // 获得该类所以public构造器，包括父类
 *
 *
 *   boolean isPrimitive = class1.isPrimitive();//判断是否是基础类型
     boolean isArray = class1.isArray();//判断是否是集合类
     boolean isAnnotation = class1.isAnnotation();//判断是否是注解类
     boolean isInterface = class1.isInterface();//判断是否是接口类
     boolean isEnum = class1.isEnum();//判断是否是枚举类
     boolean isAnonymousClass = class1.isAnonymousClass();//判断是否是匿名内部类
     boolean isAnnotationPresent = class1.isAnnotationPresent(Deprecated.class);//判断是否被某个注解类修饰
     String className = class1.getName();//获取class名字 包含包名路径
     Package aPackage = class1.getPackage();//获取class的包信息
     String simpleName = class1.getSimpleName();//获取class类名
     int modifiers = class1.getModifiers();//获取class访问权限
     Class<?>[] declaredClasses = class1.getDeclaredClasses();//内部类
     Class<?> declaringClass = class1.getDeclaringClass();//外部类

     getSuperclass()：获取某类的父类
     getInterfaces()：获取某类实现的接口
 */
public class ReflectDemo4 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class reflectDemo4 = Class.forName("com.qzj.reflect.Code");

        reflectDemo4.getDeclaredConstructors();     //  获得该类所有的构造器，不包括其父类的构造器
        reflectDemo4.getConstructors();             // 获得该类所以public构造器，包括父类

        //获取构造函数
        Constructor constructor = reflectDemo4.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);    //设置是否允许访问，因为该构造器是private的，所以要手动设置允许访问，如果构造器是public的就不需要这行了。
        Object code = constructor.newInstance("id001", "name001");
        Code codeInstance = (Code) code;
        System.out.println("id-->" + codeInstance.getId() + "，name-->" + codeInstance.getName());
    }

}
