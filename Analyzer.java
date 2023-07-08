package tictactoe;

public class Analyzer {

    public static boolean winX(char[] gameFieldContens, int countX, int CountO, int countEmpty) {

        if (gameFieldContens[0] == gameFieldContens[1] && gameFieldContens[1] == gameFieldContens[2] && gameFieldContens[0] == 'X') {
            return true;
        } else if (gameFieldContens[3] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[5] && gameFieldContens[3] == 'X') {
            return true;
        } else if (gameFieldContens[6] == gameFieldContens[7] && gameFieldContens[7] == gameFieldContens[8] && gameFieldContens[6] == 'X') {
            return true;
        } else if (gameFieldContens[0] == gameFieldContens[3] && gameFieldContens[6] == gameFieldContens[3] && gameFieldContens[0] == 'X') {
            return true;
        } else if (gameFieldContens[1] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[7] && gameFieldContens[1] == 'X') {
            return true;
        } else if (gameFieldContens[2] == gameFieldContens[5] && gameFieldContens[5] == gameFieldContens[8] && gameFieldContens[2] == 'X') {
            return true;
        } else if (gameFieldContens[0] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[8] && gameFieldContens[4] == 'X') {
            return true;
        } else if (gameFieldContens[2] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[6] && gameFieldContens[2] == 'X') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean winO(char[] gameFieldContens, int countX, int CountO, int countEmpty) {

        if (gameFieldContens[0] == gameFieldContens[1] && gameFieldContens[1] == gameFieldContens[2] && gameFieldContens[0] == 'O') {
            return true;
        } else if (gameFieldContens[3] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[5] && gameFieldContens[3] == 'O') {
            return true;
        } else if (gameFieldContens[6] == gameFieldContens[7] && gameFieldContens[7] == gameFieldContens[8] && gameFieldContens[6] == 'O') {
            return true;
        } else if (gameFieldContens[0] == gameFieldContens[3] && gameFieldContens[6] == gameFieldContens[3] && gameFieldContens[0] == 'O') {
            return true;
        } else if (gameFieldContens[1] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[7] && gameFieldContens[1] == 'O') {
            return true;
        } else if (gameFieldContens[2] == gameFieldContens[5] && gameFieldContens[5] == gameFieldContens[8] && gameFieldContens[2] == 'O') {
            return true;
        } else if (gameFieldContens[0] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[8] && gameFieldContens[0] == 'O') {
            return true;
        } else if (gameFieldContens[2] == gameFieldContens[4] && gameFieldContens[4] == gameFieldContens[6] && gameFieldContens[2] == 'O') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean draw(int countX, int countO) {

        boolean answerDraw = false;

        if (countX == 5 && countO == 4 || countX == 4 && countO == 5 || countX == 9 || countO == 9) {
            answerDraw = true;
        }
        return answerDraw;
    }

    public static boolean impossible(char[] gameFieldContens, int countX, int counO, int countEmpty) {

        boolean answerImpossible = false;

        if (winX(gameFieldContens, countX, counO, countEmpty) == true && winO(gameFieldContens, countX, counO, countEmpty) == true || countX - counO >= 2 || counO - countX >= 2) {
            answerImpossible = true;
        }
        return answerImpossible;
    }

    public static boolean notFinished(int countX, int countO, int countEmpty, boolean winX, boolean winO) {
        boolean answerNotFinished = false;

        if ((winX == false && winO == false) && (((countX-countO)<=1) &&  ((countO-countX)<=1) && countEmpty>0)) {
            answerNotFinished = true;
        }

        return answerNotFinished;
    }

}





