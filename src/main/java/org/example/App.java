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
            System.out.println("\u001B[34mPlayer 1 (X), please make a selection:");
            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());

            switch(option) {
                case 1:
                    if (topRow.get(0).equals("X") || topRow.get(0).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {
                        topRow.set(0, "X");
                        checkForWinAfterXSelection();
                    }

                case 2:
                    if (topRow.get(1).equals("X") || topRow.get(1).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {
                        topRow.set(1, "X");
                        checkForWinAfterXSelection();
                    }
                case 3:
                    if (topRow.get(2).equals("X") || topRow.get(2).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {
                        topRow.set(2, "X");
                        checkForWinAfterXSelection();
                    }
                case 4:
                    if (middleRow.get(0).equals("X") || middleRow.get(0).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {

                        middleRow.set(0, "X");
                        checkForWinAfterXSelection();
                    }
                case 5:
                    if (middleRow.get(1).equals("X") || middleRow.get(1).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {
                        middleRow.set(1, "X");
                        checkForWinAfterXSelection();
                    }
                case 6:
                    if (middleRow.get(2).equals("X") || middleRow.get(2).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {
                        middleRow.set(2, "X");
                        checkForWinAfterXSelection();
                    }
                case 7:
                    if (bottomRow.get(0).equals("X") || bottomRow.get(0).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {
                        bottomRow.set(0, "X");
                        checkForWinAfterXSelection();
                    }
                case 8:
                    if (bottomRow.get(1).equals("X") || bottomRow.get(1).equals("O")) {
                        displayPickADifferentLocationMessageForX();
                    } else {
                        bottomRow.set(1, "X");
                        checkForWinAfterXSelection();
                    }
                case 9:
                    if (bottomRow.get(2).equals("X") || bottomRow.get(2).equals("O")) {
                        displayPickADifferentLocationMessageForX();
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
            System.out.println("\u001B[32mPlayer 2 (O), please make a selection:");
            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());

            //TOP ROW
            switch (option){
                case 1:
                    if (topRow.get(0).equals("X") || topRow.get(0).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        topRow.set(0, "O");
                        checkForWinAfterOSelection();
                    }
                case 2:
                    if (topRow.get(1).equals("X") || topRow.get(1).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        topRow.set(1, "O");
                        checkForWinAfterOSelection();
                    }
                case 3:
                    if (topRow.get(2).equals("X") || topRow.get(2).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        topRow.set(2, "O");
                        checkForWinAfterOSelection();
                    }
                case 4:
                    if (middleRow.get(0).equals("X") || middleRow.get(0).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        middleRow.set(0, "O");
                        checkForWinAfterOSelection();
                    }
                case 5:
                    if (middleRow.get(1).equals("X") || middleRow.get(1).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        middleRow.set(1, "O");
                        checkForWinAfterOSelection();
                    }
                case 6:
                    if (middleRow.get(2).equals("X") || middleRow.get(2).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        middleRow.set(2, "O");
                        checkForWinAfterOSelection();
                    }
                case 7:
                    if (bottomRow.get(0).equals("X") || bottomRow.get(0).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        bottomRow.set(0, "O");
                        checkForWinAfterOSelection();
                    }
                case 8:
                    if (bottomRow.get(1).equals("X") || bottomRow.get(1).equals("O")) {
                        displayPickADifferentLocationMessageForO();
                    } else {
                        bottomRow.set(1, "O");
                        checkForWinAfterOSelection();
                    }
                case 9:
                    if (bottomRow.get(2).equals("X") || bottomRow.get(2).equals("O")) {
                        displayPickADifferentLocationMessageForO();
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
            displayXWinsMessage();
        }

        if(middleRow.get(0).equals("X") && middleRow.get(1).equals("X") && middleRow.get(2).equals("X")){
            displayXWinsMessage();
        }

        if(bottomRow.get(0).equals("X") && bottomRow.get(1).equals("X") && bottomRow.get(2).equals("X")){
            displayXWinsMessage();
        }

        //X WIN DIAGONAL
        if(topRow.get(0).equals("X") && middleRow.get(1).equals("X") && bottomRow.get(2).equals("X")){
            displayXWinsMessage();
        }


        if(topRow.get(2).equals("X") && middleRow.get(1).equals("X") && bottomRow.get(0).equals("X")){
            displayXWinsMessage();
        }

        //X WIN VERTICAL
        if(topRow.get(0).equals("X") && middleRow.get(0).equals("X") && bottomRow.get(0).equals("X")){
            displayXWinsMessage();
        }


        if(topRow.get(1).equals("X") && middleRow.get(1).equals("X") && bottomRow.get(1).equals("X")){
            displayXWinsMessage();
        }


        if(topRow.get(2).equals("X") && middleRow.get(2).equals("X") && bottomRow.get(2).equals("X")){
            displayXWinsMessage();
        }
        displayBoard();
        promptOLocation();
    }

    private void checkForWinAfterOSelection(){
        //O WIN HORIZONTAL
        if(topRow.get(0).equals("O") && topRow.get(1).equals("O") && topRow.get(2).equals("O")){
            displayOWinsMessage();
        }

        if(middleRow.get(0).equals("O") && middleRow.get(1).equals("O") && middleRow.get(2).equals("O")){
            displayOWinsMessage();
        }

        if(bottomRow.get(0).equals("O") && bottomRow.get(1).equals("O") && bottomRow.get(2).equals("O")){
            displayOWinsMessage();
        }

        //O WIN DIAGONAL
        if(topRow.get(0).equals("O") && middleRow.get(1).equals("O") && bottomRow.get(2).equals("O")){
            displayOWinsMessage();
        }


        if(topRow.get(2).equals("O") && middleRow.get(1).equals("O") && bottomRow.get(0).equals("O")){
            displayOWinsMessage();
        }

        //O WIN VERTICAL

        if(topRow.get(0).equals("O") && middleRow.get(0).equals("O") && bottomRow.get(0).equals("O")){
            displayOWinsMessage();
        }


        if(topRow.get(1).equals("O") && middleRow.get(1).equals("O") && bottomRow.get(1).equals("O")){
            displayOWinsMessage();
        }


        if(topRow.get(2).equals("O") && middleRow.get(2).equals("O") && bottomRow.get(2).equals("O")){
            displayOWinsMessage();
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

    private void displayPickADifferentLocationMessageForX(){
        System.out.println("Pick a different location.");
        promptXLocation();
    }

    private void displayPickADifferentLocationMessageForO(){
        System.out.println("Pick a different location.");
        promptOLocation();
    }

    private void displayXWinsMessage(){
        displayBoard();
        System.out.println("X Wins!");
        System.exit(0);
    }

    private void displayOWinsMessage(){
        displayBoard();
        System.out.println("O Wins!");
        System.exit(0);
    }
}
