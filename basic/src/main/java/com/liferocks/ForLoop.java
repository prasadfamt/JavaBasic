package com.liferocks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Prasad on 18-01-2020.
 */
public class ForLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("========================================");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("========================================");

        List<String> daysList = new ArrayList<String>();
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        daysList.add("Sunday");

        for (String day : daysList) {
            System.out.println(day);
        }

        System.out.println("========================================");

        Iterator<String> dayIterator = daysList.iterator();
        while (dayIterator.hasNext()) {
            System.out.println(dayIterator.next());
        }

        System.out.println("========================================");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    System.out.println(i);
                    break;
                } else {
                    System.out.println("O");
                }
            }
        }

        int i = 0;

        do {
            if (daysList.get(i).equals("Tuesday")) {
                break;
            }
            System.out.println(daysList.get(i));
            ++i;
        } while (true);

    }
}
