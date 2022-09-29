package ru.gigbrains.jca.lesson1_intro;

import java.util.Arrays;

public class ClassWork {

    public static void main(String... args) {
        //lesson2();
    }

    private static void lesson2() {
        exampleArrayArgsMethod(new int[] {7,3,8,1,65,23,9,58});
        exampleArrayArgsMethod();
        exampleArrayArgsMethod(34 );
        exampleArrayArgsMethod(1,2,3,4,5,7,11,16,27,42,94);
        exampleArgsWithOtherArgs("Vasya",19,'1','2','3');
        double a = 0.7;
        double b = 0.0;
        for (int i=0;i<70;i++){
            b +=0.01;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(Math.abs(a-b));
    }

    static void exampleArrayArgsMethod(int... arr){
        System.out.println(Arrays.toString(arr));
    }

    static void exampleArgsWithOtherArgs(String name,float f,char... charsarg){
        System.out.println(name);
        System.out.println(f);
        System.out.println(charsarg);
    }

}