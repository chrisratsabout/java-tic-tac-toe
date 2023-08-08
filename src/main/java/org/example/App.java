package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    List<String> topRow = new ArrayList<>();
    List<String> middleRow = new ArrayList<>();
    List<String> bottomRow = new ArrayList<>();

    public void initialize() {
        System.out.println("Tic Tac Toe");
        System.out.println("Enter the number where you want to place the \"X\" or \"O\".");
        populateBoard();
        displayBoard();
        promptXLocation();
    }

    private void promptXLocation() {
        //DRAW
        if(!topRow.get(0).equals("1") && !topRow.get(1).equals("2") && !topRow.get(2).equals("3") && !middleRow.get(0).equals("4") && !middleRow.get(1).equals("5") && !middleRow.get(2).equals("6") && !bottomRow.get(0).equals("7") && !bottomRow.get(1).equals("8") && !bottomRow.get(2).equals("9")){
            displayBoard();
            System.out.println("Draw!");
            System.exit(0);
        } else {
            System.out.println("Player 1 (X), please make a selection:");
            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());

            //TOP ROW
            if (option == 1) {
                if (topRow.get(0).equals("X") || topRow.get(0).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    topRow.set(0, "X");
                    checkForWinAfterXSelection();
                }
            }

            if (option == 2) {
                if (topRow.get(1).equals("X") || topRow.get(1).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    topRow.set(1, "X");
                    checkForWinAfterXSelection();
                }
            }

            if (option == 3) {
                if (topRow.get(2).equals("X") || topRow.get(2).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    topRow.set(2, "X");
                    checkForWinAfterXSelection();
                }
            }

            //MIDDLE ROW

            if (option == 4) {
                if (middleRow.get(0).equals("X") || middleRow.get(0).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {

                    middleRow.set(0, "X");
                    checkForWinAfterXSelection();
                }
            }

            if (option == 5) {
                if (middleRow.get(1).equals("X") || middleRow.get(1).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    middleRow.set(1, "X");
                    checkForWinAfterXSelection();
                }
            }

            if (option == 6) {
                if (middleRow.get(2).equals("X") || middleRow.get(2).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    middleRow.set(2, "X");
                    checkForWinAfterXSelection();
                }
            }

            //BOTTOM ROW
            if (option == 7) {
                if (bottomRow.get(0).equals("X") || bottomRow.get(0).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    bottomRow.set(0, "X");
                    checkForWinAfterXSelection();
                }
            }

            if (option == 8) {
                if (bottomRow.get(1).equals("X") || bottomRow.get(1).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    bottomRow.set(1, "X");
                    checkForWinAfterXSelection();
                }
            }

            if (option == 9) {
                if (bottomRow.get(2).equals("X") || bottomRow.get(2).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptXLocation();
                } else {
                    bottomRow.set(2, "X");
                    checkForWinAfterXSelection();
                }
            }

            if(option < 1 || option > 9){
                System.out.println("Try again.");
                promptXLocation();
            }


        }




    }

    private void promptOLocation() {
        //DRAW
        if(!topRow.get(0).equals("1") && !topRow.get(1).equals("2") && !topRow.get(2).equals("3") && !middleRow.get(0).equals("4") && !middleRow.get(1).equals("5") && !middleRow.get(2).equals("6") && !bottomRow.get(0).equals("7") && !bottomRow.get(1).equals("8") && !bottomRow.get(2).equals("9")){
            displayBoard();
            System.out.println("Draw!");
            System.exit(0);
        } else {
            System.out.println("Player 2 (O), please make a selection:");
            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());

            //TOP ROW
            if (option == 1) {
                if (topRow.get(0).equals("X") || topRow.get(0).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    topRow.set(0, "O");
                    checkForWinAfterOSelection();
                }
            }

            if (option == 2) {
                if (topRow.get(1).equals("X") || topRow.get(1).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    topRow.set(1, "O");
                    checkForWinAfterOSelection();
                }
            }

            if (option == 3) {
                if (topRow.get(2).equals("X") || topRow.get(2).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    topRow.set(2, "O");
                    checkForWinAfterOSelection();
                }
            }

            //MIDDLE ROW

            if (option == 4) {
                if (middleRow.get(0).equals("X") || middleRow.get(0).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    middleRow.set(0, "O");
                    checkForWinAfterOSelection();
                }
            }

            if (option == 5) {
                if (middleRow.get(1).equals("X") || middleRow.get(1).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    middleRow.set(1, "O");
                    checkForWinAfterOSelection();
                }
            }

            if (option == 6) {
                if (middleRow.get(2).equals("X") || middleRow.get(2).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    middleRow.set(2, "O");
                    checkForWinAfterOSelection();
                }
            }

            //BOTTOM ROW
            if (option == 7) {
                if (bottomRow.get(0).equals("X") || bottomRow.get(0).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    bottomRow.set(0, "O");
                    checkForWinAfterOSelection();
                }
            }

            if (option == 8) {
                if (bottomRow.get(1).equals("X") || bottomRow.get(1).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    bottomRow.set(1, "O");
                    checkForWinAfterOSelection();
                }
            }

            if (option == 9) {
                if (bottomRow.get(2).equals("X") || bottomRow.get(2).equals("O")) {
                    System.out.println("Pick a different location.");
                    promptOLocation();
                } else {
                    bottomRow.set(2, "O");
                    checkForWinAfterOSelection();
                }
            }

            if(option < 1 || option > 9){
                System.out.println("Try again.");
                promptOLocation();
            }
        }

    }

    private void checkForWinAfterXSelection(){

        //X WIN HORIZONTAL
        if(topRow.get(0).equals("X") && topRow.get(1).equals("X") && topRow.get(2).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }

        if(middleRow.get(0).equals("X") && middleRow.get(1).equals("X") && middleRow.get(2).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }

        if(bottomRow.get(0).equals("X") && bottomRow.get(1).equals("X") && bottomRow.get(2).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }

        //X WIN DIAGONAL
        if(topRow.get(0).equals("X") && middleRow.get(1).equals("X") && bottomRow.get(2).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }


        if(topRow.get(2).equals("X") && middleRow.get(1).equals("X") && bottomRow.get(0).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }

        //X WIN VERTICAL
        if(topRow.get(0).equals("X") && middleRow.get(0).equals("X") && bottomRow.get(0).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }


        if(topRow.get(1).equals("X") && middleRow.get(1).equals("X") && bottomRow.get(1).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }


        if(topRow.get(2).equals("X") && middleRow.get(2).equals("X") && bottomRow.get(2).equals("X")){
            displayBoard();
            System.out.println("X Wins!");
            System.exit(0);
        }
        displayBoard();
        promptOLocation();
    }

    private void checkForWinAfterOSelection(){
        //O WIN HORIZONTAL
        if(topRow.get(0).equals("O") && topRow.get(1).equals("O") && topRow.get(2).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }

        if(middleRow.get(0).equals("O") && middleRow.get(1).equals("O") && middleRow.get(2).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }

        if(bottomRow.get(0).equals("O") && bottomRow.get(1).equals("O") && bottomRow.get(2).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }

        //O WIN DIAGONAL
        if(topRow.get(0).equals("O") && middleRow.get(1).equals("O") && bottomRow.get(2).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }


        if(topRow.get(2).equals("O") && middleRow.get(1).equals("O") && bottomRow.get(0).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }

        //O WIN VERTICAL

        if(topRow.get(0).equals("O") && middleRow.get(0).equals("O") && bottomRow.get(0).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }


        if(topRow.get(1).equals("O") && middleRow.get(1).equals("O") && bottomRow.get(1).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }


        if(topRow.get(2).equals("O") && middleRow.get(2).equals("O") && bottomRow.get(2).equals("O")){
            displayBoard();
            System.out.println("O Wins!");
            System.exit(0);
        }
        displayBoard();
        promptXLocation();
    }

    private void populateBoard() {
        topRow.add("1");
        topRow.add("2");
        topRow.add("3");
        middleRow.add("4");
        middleRow.add("5");
        middleRow.add("6");
        bottomRow.add("7");
        bottomRow.add("8");
        bottomRow.add("9");
    }

    private void displayBoard() {
        displayTopRow();
        displayMiddleRow();
        displayBottomRow();
        System.out.println("");
        System.out.println("");
    }

    private void displayTopRow() {
        System.out.println(topRow.get(0) + " | " + topRow.get(1) + " | " + topRow.get(2));
    }

    private void displayMiddleRow() {
        System.out.println(middleRow.get(0) + " | " + middleRow.get(1) + " | " + middleRow.get(2));
    }

    private void displayBottomRow() {
        System.out.println(bottomRow.get(0) + " | " + bottomRow.get(1) + " | " + bottomRow.get(2));
    }
}
