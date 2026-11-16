package com.cjw.gomoku;

public class Board {
    public static final int SIZE = 15;
    private char[][] grid;
    public Board() {
        this.grid = new char[SIZE][SIZE];
        initializeGrid();
    }
    private void initializeGrid() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                grid[row][col] = '+';
            }
        }
    }
    public void draw() {
        System.out.print("  ");
        for (int col = 0; col < SIZE; col++) {
            System.out.printf("%2s ", (char)('A' + col));
        }
        System.out.println();

        for (int row = 0; row < SIZE; row++) {
            System.out.printf("%2d ", row + 1);
            for (int col = 0; col < SIZE; col++) {
                System.out.print(grid[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
