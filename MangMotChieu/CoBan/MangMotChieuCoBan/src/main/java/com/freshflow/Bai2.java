package com.freshflow;

public class Bai2 {
    public void trungBinhCongNguyenTo(int[] arr){
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Ultil.isPrime(arr[i])) {
                sum += arr[i];
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung bình cộng các số nguyên tố: " + average);
        } else {
            System.out.println("Không có số nguyên tố trong mảng.");
        }
    }
}
