package com.company;

public class Main {
    public static void main(String[] args) {

        Middle_school middleSchool = new Middle_school(6 ,Class.A," средней школы ",25,
                10,7,8);
        System.out.println(middleSchool.getInfo(6,Class.A," средней школы ",25,
                10,7,8));
        System.out.println();


        High_school highSchool = new High_school(10,Class.B," старшей школы ", 18,
                5,8,5);
        System.out.println(highSchool.getInfo(10,Class.B," старшей школы ", 18,
                5,8,5));
        System.out.println();

        High_school high_school = new High_school(11,Class.C," старшей школы ", 19,
                6,10,3);
        System.out.println(high_school.getInfo(11,Class.C," старшей школы ", 19,
                6,10,3));



    }

}