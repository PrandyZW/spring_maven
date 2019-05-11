package com.yzw.dao;

import java.lang.reflect.Method;

/**
 * Created by yzw on 2017/12/20.
 */
public class Main {

    public static void main(String [] args){

        Method[] methods = Person.class.getMethods();

        for(Method m : methods){
            System.out.println(m.getDeclaredAnnotations());
        }
    }
}
