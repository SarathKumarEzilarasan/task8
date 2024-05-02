package test;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine(); // "10 12"

        String[] arr = s.split(" ");

        int i = Integer.parseInt(arr[0]);
        int j = Integer.parseInt(arr[1]);

        // int , float , double ..... -> class

        System.out.println(i);
        System.out.println(j);






    }
}
