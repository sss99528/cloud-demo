package com.lh.demo.工厂模式.简单工厂模式;

public class Test {
    public static void main(String[] args) {
        CourseFactory.getInstance(PythonCourse.class).read();
    }
}
