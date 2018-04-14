package com.recinssort;

public class Main {

    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};

        InsertionSort(intArray,intArray.length);

        for(int i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }

    public static void InsertionSort(int[] input,int maxElement)
    {
        if(maxElement<2)
        {
            return;
        }
        InsertionSort(input, maxElement-1);
        int newElement = input[maxElement-1];

        int i;
        for(i=maxElement-1;i>0 && input[i-1]>newElement;i--) {
            input[i]=input[i-1];
        }
        input[i]=newElement;
        System.out.println("After each recursion maxElement,"+maxElement);
        for(int j=0;j<input.length;j++)
        {
            System.out.println(input[j]);
        }
        System.out.println("------------------------");
    }
}
