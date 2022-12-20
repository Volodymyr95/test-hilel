package org.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] countryCodes = {"UK", "PL", "UA", "USA"};

        final int allowedAgeForEurope = 18;
        final int allowedAgeForUSA = 16;
        final int minCountryNumber = 0;
        final int maxCountryNumber = 3;
        final int usaCode = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose you country: ");

        for (int i = 0; i < countryCodes.length; i++) {
            System.out.println(countryCodes[i] + ": " + i);
        }

        int countryCode = scanner.nextInt();
        if ((countryCode >= minCountryNumber) && (countryCode <= maxCountryNumber)) {
            System.out.println("Type your age:");
            int age = scanner.nextInt();

            if (countryCode != usaCode) {
                System.out.println("Allowed: " + (allowedAgeForEurope <= age));
            } else {
                System.out.println("Allowed: " + (allowedAgeForUSA >= age));
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}
