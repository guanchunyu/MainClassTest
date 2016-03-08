package com.rain.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        // 尝试输入一个简单的lambda表达式来测试是否可以编译和运行java8的代码
        // new Thread(()>System.out.println("这是一个java8的小例子,可以使用lambda表达式")).start();
        //test();
        lambdaStudy();
    }

    public static void test() {
        List<String> names = Arrays.asList("peter", "anna", "bike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        System.out.println(names);
    }
    
    /**
     * lambda 学习
     */
    public static void lambdaStudy(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic",  
                "Stanislas Wawrinka",  
                "David Ferrer","Roger Federer",  
                "Andy Murray","Tomas Berdych",  
                "Juan Martin Del Potro"};  
         List<String> players =  Arrays.asList(atp);  
           
         // 以前的循环方式  
         for (String player : players) {  
              System.out.print(player + "; ");  
         }  
         
         // 使用 lambda 表达式以及函数操作(functional operation)  
         players.forEach((player) -> System.out.print(player + "; "));  
         
         // 在 Java 8 中使用双冒号操作符(double colon operator)  
         players.forEach(System.out::println);  
         System.out.println("测试用");
    }
}
