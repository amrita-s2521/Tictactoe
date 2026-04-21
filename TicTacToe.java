package com.srm.src;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }
    static int getUserSlot() {
        Scanner scan = new Scanner(System.in);
        int slot;
        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            if (scan.hasNextInt()) {
                slot = scan.nextInt();
                if (slot >= 1 && slot <= 9) {
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
                scan.next(); 
            }
        }
        scan.close();
        return slot;
    }
}