package ru.gigbrains.jca.lesson1_intro;

import java.util.Arrays;

public class ClassWork {

    public static void main(String... args) {
        int[] arrayInt = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0;i<arrayInt.length;i++){
            if (arrayInt[i]==0){
                arrayInt[i]=1;
            } else {
                arrayInt[i]=0;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
        int[] arrayInt1 = new int[8];
        for (int i=0;i<8;i++){
            arrayInt1[i]=i*3;
        }
        System.out.println(Arrays.toString(arrayInt1));

        int[] arrayInt2 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(arrayInt2));
        for (int i=0;i<arrayInt2.length;i++){
            if (arrayInt2[i]<6){
                arrayInt2[i]*=2;
            }
        }
        System.out.println(Arrays.toString(arrayInt2));
        // минимальный и максимальный элемент
        int varMin = arrayInt2[0];
        int varMax = arrayInt2[0];
        for (int tempVar : arrayInt2) {
            if (tempVar<varMin) {varMin=tempVar;}
            if (tempVar>varMax) {varMax=tempVar;}
        }
        System.out.println(varMin);
        System.out.println(varMax);
        System.out.println("=======================================================");
        arrayInt2[1]=13;
        System.out.println(isMirrorArray(arrayInt2));

    }

    private static boolean isMirrorArray(int[] inArray) {
        int leftSumm  = 0;
        int rightSumm = 0;
        int liftPos = 0;
        int rightPos = inArray.length-1;
        while (liftPos!=rightPos-1){
            if (leftSumm<rightSumm){
                leftSumm+=inArray[++liftPos];
            } else {
                rightSumm+=inArray[--rightPos];
            }
        }
        return (leftSumm==rightSumm);
    }

}