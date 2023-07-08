package tictactoe;

import java.util.Arrays;

public class CreateGameField {

    public static void createField(char[] contensArray) {

        char[][] gameField = new char[3][3];

      System.out.println("---------");

        int mover = 0;

        for (int i = 0; i < gameField.length; i++) {

            System.out.print("| ");

            for (int k = 0; k < gameField[i].length; k++) {

                gameField[i][i] = contensArray[mover];
                System.out.print(contensArray[mover]);
                System.out.print(" ");

                mover++;
            }
            System.out.print("|");
            System.out.println();


        }
        System.out.println("---------");
        mover = 0;


    }








}
