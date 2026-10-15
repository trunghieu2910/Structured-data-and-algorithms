package com.freshflow;

public class Bai1 {
    public void demChanLetinhTongChanLe(int[] arr){
        int countChan = 0;
        int countLe = 0;
        int sumChan = 0;
        int sumLe = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countChan++;
                sumChan += arr[i];
            } else {
                countLe++;
                sumLe += arr[i];
            }
        }

        System.out.println("Số lượng số chẵn: " + countChan);
        System.out.println("Số lượng số lẻ: " + countLe);
        System.out.println("Tổng các số chẵn: " + sumChan);
        System.out.println("Tổng các số lẻ: " + sumLe);
    }
}
