package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(2);
            arrayList.add(randomNum);
        }

        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(2);
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum2 = random.nextInt(2);
            linkedList.add(randomNum2);
        }
        System.out.println("Arraylist: " + arrayList);
        sort(arrayList);
        System.out.println();
        System.out.println("Arrays: " + Arrays.toString(list));
        sort(list);
        System.out.println();
        System.out.println("LinkedList: " + linkedList);
        sort(linkedList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        for (int a : array) {
            System.out.print(a + " ");

        }
    }

    public static void sort(ArrayList<Integer> arr) {
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");

        }
    }

    public static void sort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");

        }


    }


}

