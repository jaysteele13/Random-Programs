import java.util.*;

public class Battleships { //battleships disguised as puzzle

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        int[][] grid; //2d array
        int gg = 0;
        grid = new int[5][5]; // 5 by 5 board game

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = 0; // initialise board w/0's
            }
        }

        AddShip(grid, 2, 3);
        AddShip(grid, 4, 4);
        AddShip(grid, 0, 3);
        AddShip(grid, 2, 1);
        AddShip(grid, 4, 4);
        AddShip(grid, 3, 4); //win count depends on added ships - sloppy coding!

        boolean shipSank = false;
        int secondCo = 0, count = 0, winCount = 0;
        System.out.println(ANSI_CYAN + "Complete the battleship...\n" + ANSI_RESET);

        PrintGrid(grid);

        int firstCo = Console.getInt("\n(" + ANSI_RED + "69 " + ANSI_RESET + "to exit)\nA");

        while((firstCo != 69) && ((firstCo >= 6 || firstCo <= 0))) {
            firstCo = Console.getInt("A");
            count++;

            if(count == 3){
                System.out.println("*TIP* Between what ages do you need intensive help in your life");
            }

            if(count == 5) {
                System.out.println("that's not a philosophical question to the all the idiots that think their funny.");
            }
        }



        ClearScreen();
        while(firstCo != 69) {
            secondCo = Console.getInt("B");

            while(secondCo >= 6 || secondCo <= 0) {
                secondCo = Console.getInt("B");
            }

            firstCo--;
            secondCo--;

            shipSank = SinkShip(grid, firstCo, secondCo);
            System.out.println("R: " + shipSank);


            PrintGrid(grid);

            if(shipSank){
                winCount++;
                if(winCount == 5){
                    System.out.println("Congratulations you have completed my simple battleship!");
                    firstCo = 69;
                }
            }

            if(winCount != 5) {
                firstCo = Console.getInt("A ");
                while ((firstCo != 69) && ((firstCo >= 6 || firstCo <= 0))) {
                    firstCo = Console.getInt("A");
                }
            }



        }

        if(winCount != 5) {
            System.out.println("idiot");
        }

    }

    //methods
    public static boolean ShipAt(int[][] g, int r, int c) {
        return (g[r][c] == 1);
    }

    public static void AddShip(int[][] g, int r, int c) {
        if (!ShipAt(g, r, c)) { //if ship isn't one
            g[r][c] = 1;
        }
    }

    public static boolean SinkShip(int[][] g, int r, int c) {
        if (ShipAt(g, r, c)) { //if ship is there... destroy!
            g[r][c] = -1;
            return true;

        } else {
            return false;
        }
    }

    public static void PrintGrid(int[][] g) {
        for (int r = 0; r < g.length; r++) {
            for (int c = 0; c < g[0].length; c++) {
                if (g[r][c] == 0) {// no ship
                    System.out.print(" ~");
                } else if (g[r][c] == 1) {//ship found
                    System.out.print(" V");
                } else {
                    System.out.print(" x");
                }

            }
            System.out.println();

        }
    }

    public static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
