package tictactoe;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class CheckField {


    public static char checkField(char[] gameField, String coordinate, char newValue) {

        String[] splitCoordinate = coordinate.split(" ");


        int reihe = 0;
        int spalte = 0;
        boolean messageNumber = false;
        char otherValue = 'X';

        if (newValue == 'X') {
            otherValue = 'O';
        }

        if (newValue == 'O') {
            otherValue = 'X';
        }





        try {
            reihe = Integer.valueOf(splitCoordinate[0]);
            spalte = Integer.valueOf(splitCoordinate[1]);
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
            messageNumber = true;
        }


        if (messageNumber == false && (reihe < 1 || reihe > 3 || spalte < 1 || spalte > 3)) {
            System.out.println("Coordinates should be from 1 to 3!");

        }

        if (reihe == 1 && spalte == 1) {
            if (gameField[0] == ' ') {
                gameField[0] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[0] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");


            }
        }

        if (reihe == 1 && spalte == 2) {
            if (gameField[1] == ' ') {
                gameField[1] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[1] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");



            }
        }

        if (reihe == 1 && spalte == 3) {
            if (gameField[2] == ' ') {
                gameField[2] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[2] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");


            }
        }

        if (reihe == 2 && spalte == 1) {
            if (gameField[3] == ' ') {
                gameField[3] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[3] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");



            }
        }

        if (reihe == 2 && spalte == 2) {
            if (gameField[4] == ' ') {
                gameField[4] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[4] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");



            }
        }

        if (reihe == 2 && spalte == 3) {
            if (gameField[5] == ' ') {
                gameField[5] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[5] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");



            }
        }

        if (reihe == 3 && spalte == 1) {
            if (gameField[6] == ' ') {
                gameField[6] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[6] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");



            }
        }

        if (reihe == 3 && spalte == 2) {
            if (gameField[7] == ' ') {
                gameField[7] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[7] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");


            }
        }

        if (reihe == 3 && spalte == 3) {
            if (gameField[8] == ' ') {
                gameField[8] = newValue;
                CreateGameField.createField(gameField);
                return newValue;
            } else if (gameField[8] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
            }
        }


        return otherValue;

    }
}








