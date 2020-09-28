package com;

public class Singlet {

    private static Singlet singlet = new Singlet();
    private static Singlet singlet1 = null;

    private Singlet(){}

    public static Singlet getInstance(){
        return singlet;
    }

    public static Singlet getInstance1(){
        if (singlet1 == null){
            singlet1 = new Singlet();
        }
        return singlet1;
    }

    public static void main(String[] args) {
        System.out.println(Singlet.getInstance());
        System.out.println(Singlet.getInstance1());
        System.out.println(Singlet.singlet);
        System.out.println(Singlet.singlet1);
    }


}
