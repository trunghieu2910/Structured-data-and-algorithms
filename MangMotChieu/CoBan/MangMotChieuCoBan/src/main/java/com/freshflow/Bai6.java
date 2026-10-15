package com.freshflow;

public class Bai6 {
    public static void CapSoCoTongBangX(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("Cặp số có tổng bằng " + x + ": (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
