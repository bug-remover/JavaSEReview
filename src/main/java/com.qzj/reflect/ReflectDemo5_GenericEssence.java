package com.qzj.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo5_GenericEssence {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList();
        stringList.add("string");
        //stringList.add(11);           //集合泛型为string，插入int，编译通不过

        //通过反射添加
        Class listClass = stringList.getClass();
        try {
            Method addMethod = listClass.getMethod("add", Object.class);    //反射得到add方法
            addMethod.invoke(stringList, 22);                               //给list增加一个元素，非string
            System.out.println(stringList.size());

            //输出2，在编译器的时候，泛型会限制集合内元素类型保持一致，但是编译器结束进入
            // 运行期以后，泛型就不再起作用了，即使是不同类型的元素也可以插入集合
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
