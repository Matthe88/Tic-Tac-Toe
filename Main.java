package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int countX = 0;
        int countO = 0;
        int countEmpty = 0;
        char[] gameFieldContens = new char[9];
        char newValue = 'X';

        Scanner reader = new Scanner(System.in);
        String input = "         ";


        // creates an array with single characters from string "input"
        for (int i = 0; i < input.length(); i++) {
            gameFieldContens[i] = input.charAt(i);
        }

        // counts the "X", "O" and "-" characters
        for (int i = 0; i < gameFieldContens.length; i++) {
            if (gameFieldContens[i] == 'X') {
                countX++;
            }
            if (gameFieldContens[i] == 'O') {
                countO++;
            }
            if (gameFieldContens[i] == '_') {
                countEmpty++;
            }
        }

        CreateGameField.createField(gameFieldContens);


        while (true) {

            String coordinates = reader.nextLine();
            char oldValue = CheckField.checkField(gameFieldContens, coordinates, newValue);

            if (oldValue == 'X') {
                  newValue = 'O';
            } else {
                newValue = 'X';
            }




            boolean winX = Analyzer.winX(gameFieldContens, countX, countO, countEmpty);
            boolean winO = Analyzer.winO(gameFieldContens, countX, countO, countEmpty);

            if ((winX == true && winO == false)) {
                System.out.println("X wins");
                break;
            }

            if ((winX == false && winO == true)) {
                System.out.println("O wins");
                break;
            }

            if ((Analyzer.draw(countX, countO)) == true && (winX == false) && (winO == false)) {
                System.out.println("Draw");
            }

            if (Analyzer.impossible(gameFieldContens, countX, countO, countEmpty) == true) {
                System.out.println("Impossible");
            }

            if (Analyzer.notFinished(countX, countO, countEmpty, winX, winO) == true) {
                System.out.println("Game not finished");
            }
        }
    }
}


