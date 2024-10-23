/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean program = true;
        RUNNING:
        do {
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Exercises",
                    "wow",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"calculate an exponent", "Find the min/max of any given numbers", "Find The sum/average of any given numbers", "Exit"},
                    null);

            switch (choice) {
                case -1:
                    break RUNNING;
                case 0:
                    power();
                    break;
                case 1:
                    minmax();
                    break;
                case 2:
                    sum();
                    break;

            }
            int run = JOptionPane.showConfirmDialog(null, "Run again?", "Another operation", JOptionPane.YES_NO_OPTION);
            switch (run) {
                case -1:
                    break RUNNING;
                case 0:
                    program = true;
                    break;
                case 1:
                    program = false;
                    break;
            }

        } while (program);
        JOptionPane.showMessageDialog(null, "Thank you for using Karl's program.");
    }

    public static void power() {
        String baseInput = JOptionPane.showInputDialog("Enter the base number:");
        String exponentInput = JOptionPane.showInputDialog("Enter the exponent:");

        int base = Integer.parseInt(baseInput);
        int exponent = Integer.parseInt(exponentInput);

        double result = 1;

        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else if (exponent < 0) {
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            result = 1 / result;
        }
        JOptionPane.showMessageDialog(null, String.format("%d raised to %d is equal to: %.2f", base, exponent, result));

    }

    public static void minmax() {
        {
            String sizeInput = JOptionPane.showInputDialog("Enter the size of the array:");
            int size = Integer.parseInt(sizeInput);
            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                String input = JOptionPane.showInputDialog("Enter value for element " + (i + 1) + ":");
                numbers[i] = Integer.parseInt(input);
            }

            StringBuilder result = new StringBuilder("You entered the following values:\n");
            for (int num : numbers) {
                result.append(num).append(" ");
            }
            int min = numbers[0];
            for (int minimum : numbers) {
                if (min > minimum) {
                    min = minimum;
                }
            }
            int max = numbers[0];
            for (int maximum : numbers) {
                if (max < maximum) {
                    max = maximum;
                }
            }
            int minmax = JOptionPane.showOptionDialog(
                    null,
                    result.toString(),
                    "min/max",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"Find the minimum value ", "find the maximum value"},
                    null);
            switch (minmax) {
                case -1 -> {
                }
                case 0 -> JOptionPane.showMessageDialog(null, "The minimum value is: " + min);
                case 1 -> JOptionPane.showMessageDialog(null, "The maximum value is: " + max);
            }

        }

    }

    public static void sum() {
        String sizeInput = JOptionPane.showInputDialog("Enter the size of the array:");
        int size = Integer.parseInt(sizeInput);
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            String input = JOptionPane.showInputDialog("Enter value for element " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(input);
        }

        StringBuilder result = new StringBuilder("You entered the following values:\n");
        for (int num : numbers) {
            result.append(num).append(" ");
        }

        int sum = 0;
        for (int add : numbers) {
            sum += add;
        }
        float ave = 0;
        ave = sum / numbers.length;
        String messagesum = result.toString() + "\nThe sum of all numbers is:" + sum;
        String messageave = result.toString() + "\nThe average of all numbers is:" + ave;
        String messagesumave = result.toString() + "\nThe sum of all numbers is:" + sum + "\nand average of all numbers is:" + ave;
        int sumave = JOptionPane.showOptionDialog(
                null,
                result.toString(),
                "sum/average",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new String[]{"find the Sum", "Find the average", "Find the average and sum"},
                null);
        switch (sumave) {
            case -1:
                break;
            case 0:
                JOptionPane.showMessageDialog(null, messagesum);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, messageave);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, messagesumave);
                break;
        }
    }
}
