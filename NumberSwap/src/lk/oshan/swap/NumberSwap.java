package lk.oshan.swap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSwap {

    private static Integer first;
    private static Integer second;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter the first number : ");
            first = scanner.nextInt();

            System.out.print("Please enter the second number : ");
            second = scanner.nextInt();

            System.out.println("Old ---> First: "+first+", Second: "+second);

            first = first+second;
            second = first-second;
            first = first-second;

            System.out.println("New ---> First: "+first+", Second: "+second);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input. Program will be terminated!");
        }
        catch (NullPointerException f){
            System.out.println("Program terminated due to invalid input");
        }

    }
}
