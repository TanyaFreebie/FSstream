package com.company;

import java.util.Scanner;
import java.util.stream.Stream;




    public class Main {



        public static void main(String[] args) {
            //request a number from a user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the position you want to observe: ");
            int n = scanner.nextInt();

            //set answer as stream
            int fib = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                    .limit(n)//limit on position you need to see
                    .map(t->t[1])//map it, so you would see only last position of formulas array
                    .max((m, k) -> m.compareTo(k))//compare all results and find max number
                    .get();//return max number for int fib

            //print out result
            System.out.println("requested value is " + fib);


           ;

        }

    }
