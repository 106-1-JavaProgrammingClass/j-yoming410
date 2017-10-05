package com.company;
import java.util.Scanner;
public class hwk10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String sc = scn.nextLine();
        char ch1 = scn.next().charAt(0);
        char ch2 = scn.next().charAt(0);
        System.out.println(sc.replace(ch1,ch2));

    }
}