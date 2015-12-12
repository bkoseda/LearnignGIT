package com.company;

import java.util.ArrayList;

/* I am the version from GIT */
/* I am the version from GIT */
/* I am the version from GIT */
/* I am the version from GIT */

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> integers = new ArrayList<Integer>(5);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        for (int i : integers)
        {
            System.out.println(new Integer(i).toString());
        }

        Main.printHello(args);
    }

    private static void printHello(String[] strings)
    {
        System.out.println("Hello World!");

        for (int i=0; i < strings.length; i++)
        {
            System.out.println(strings[i]);
        }
    }

    private static double average(double... values)
    {
        double retval = 0.0;
        for (double v : values)
            retval += v;
        return retval/values.length;
    }
}
