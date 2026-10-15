package com.freshflow;

public class Bai3 {
    public static  void soNhoNhat(int[] arr){
        if (arr.length == 0) {
            System.out.println("Mảng rỗng.");
            return;
        }
        int tanSuatMin=0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] == min){
                ++tanSuatMin;
            }
        }

        System.out.println("Số nhỏ nhất trong mảng: " + min);
        System.out.println("Tần suất số nhỏ nhất trong mảng: " + tanSuatMin);
    }
}
