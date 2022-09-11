package ru.gigbrains.jca.lesson1_intro;

public class ClassWork {

    public static void main(String... args) {
        forLoop();
        int choice = 1;
        for (;;) {
            System.out.println(choice++);
            if (choice >10) { break; }
        }
    }

    private static void forLoop() {
        for (int i = 0,j = 10;;i++, j-=2 ) {
            System.out.printf("i = %d, j = %d \n",i,j);
            if  (i>11 || j<0) { break;}
        }
    }


}
