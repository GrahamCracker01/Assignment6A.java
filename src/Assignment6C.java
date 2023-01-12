//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment6C {

    //print array
    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println("");
        }
    }

    //check if board is full
    public static boolean isBoardFull(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals (" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    //add disc
    public static void addDisc(String[][] array, int player, int column) {
        for (int j = 3; j > -1; j--) {
            if (array[j][column].equals(" ")) {
                if (player == 1) {
                    array[j][column] = "X";
                }
                else if (player == 2){
                    array[j][column] = "O";
                }
                break;
            }
        }
    }

    //vertical win
    public static boolean winHorizontal(String[][] array) {
        int intCountX = 0, intCountO = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("X")) {
                    intCountX++;
                }
                else if (array[i][j].equals("O")) {
                    intCountO++;
                }
            }
            if (intCountX == 4 || intCountO == 4) {
                return true;
            }
            intCountX = 0;
            intCountO = 0;
        }
        return false;
    }

    //vertical win
    public static boolean winVertical(String[][] array) {
        int intCountX = 0, intCountO = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i].equals("X")) {
                    intCountX++;
                } else if (array[i][j].equals("O")) {
                    intCountO++;
                }
            }
            if (intCountX == 4 || intCountO == 4) {
                return true;
            }

            intCountX = 0;
            intCountO = 0;
        }
        return false;
    }

    //main
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        String[][] array;
        array = new String[4][4];
        boolean boolStop = false;
        int intInput, intPlayer = 1;

        //fill array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = " ";
            }
        }

        //main loop
        while (!boolStop) {
            System.out.print("Player " + intPlayer + ", enter a column: ");
            intInput = scan.nextInt();
            System.out.println("");
            addDisc(array, intPlayer, intInput);
            printArray(array);
            System.out.println("");
            if (winHorizontal(array)) {
                System.out.println("Player " + intPlayer + " wins!");
                boolStop = true;
            }
            if (winVertical(array)) {
                System.out.println("Player " + intPlayer + " wins!");
                boolStop = true;
            }
            else if (isBoardFull(array)) {
                System.out.println("The board is full. Tie game!");
                boolStop = true;
            }
            else {
                if (intPlayer == 2) {
                    intPlayer = 1;
                }
                else {
                    intPlayer++;
                }
            }
        }
    }
}

