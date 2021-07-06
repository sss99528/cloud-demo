package com.lh.demo.工厂模式.工厂方法模式;

public class Test {
    public static void main(String[] args) {
        new JavaCourseFactory().create().read();
        new PythonCourseFactory().create().read();
    }
}
