package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ex38Test {

    public static void main(String[] Args){

        int n = 0;
        int num_numbers = 0;
        Scanner scanner = new Scanner(System.in);
        List<String> number_list = new ArrayList<String>();
        List<String> Even_list = new ArrayList<String>();

        System.out.print("Enter a list of numbers, separated by spaces: ");

        String number = scanner.nextLine();
        String Number_list[] = number.split(" ");
        number_list = Arrays.asList(Number_list);

        Even_list = filterEvenNumbers(number_list, num_numbers);

        System.out.print("The even numbers are");

        for (String s: Even_list) {
            System.out.print(" " + s);
        }

        System.out.print(".");

    }


    public static List<String> filterEvenNumbers(List<String> number_list, int num_numbers){

        List<String> Even_list = new ArrayList<String>();

        int i = 0;
        while (i < number_list.size()) {
            int num = Integer.parseInt(number_list.get(i));
            if (num % 2 == 0){
                Even_list.add(number_list.get(i));
            }
            i++;
        }

        return Even_list;

    }


}