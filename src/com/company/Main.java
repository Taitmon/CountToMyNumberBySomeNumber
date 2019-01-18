package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number for the max count.");
        int maxCount = userinput.nextInt();

        System.out.println("please enter a second number to count by.");
        int step = userinput.nextInt();

        int counter = 0;
        while (counter <= maxCount)
        {
            System.out.println(counter);
            counter = counter + step;
        }

    }
}
