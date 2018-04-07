package com.recurssion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(recursivefactorial(5));
    }
    public static int recursivefactorial(int num) {
        if(num==0) {
            return 1;
        }
        return num*recursivefactorial(num-1);
    }
}
