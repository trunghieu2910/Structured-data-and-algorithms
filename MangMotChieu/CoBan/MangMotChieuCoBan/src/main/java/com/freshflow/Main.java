package com.freshflow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("35 Bai Mang 1 chieu");

        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,2,3,4};
        Bai2 bai2 = new Bai2();
        bai2.trungBinhCongNguyenTo(arr);

        Bai3 bai3 = new Bai3();
        bai3.soNhoNhat(arr);

        Bai6 bai6 = new Bai6();
        bai6.CapSoCoTongBangX(arr, 10);
    }
}