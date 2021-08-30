package com.bridgelabz.printarray;

public class PrintArray {
	
	public static <E> void toPrint(E[] inputArray){
        for(E element : inputArray){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3,4.4};
        Character[] characterArray = {'H','E','L','L','O'};

        PrintArray.toPrint(integerArray);
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(characterArray);
    }

}