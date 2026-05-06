package com.srm.src;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // UC5 Flow: Receive Row and Column
        System.out.println("Enter move (row and column: 0-2): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        // UC5 Flow: Validation performed
        if (isValidMove(row, col)) {
            // UC5 Flow: Move accepted
            board[row][col] = 'X'; 
            System.out.println("Move accepted!");
        } else {
            // UC5 Flow: Move rejected
            System.out.println("Invalid move! Cell is out of bounds or already occupied.");
        }
    }

    public static boolean isValidMove(int row, int col) {
        // Boundary check
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }
        // Occupancy check
        return board[row][col] == '-';
    }
}

