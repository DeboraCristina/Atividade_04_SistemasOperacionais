package view;

import controller.ThreadCalc;

public class Main
{
    public static void main(String[] args)
    {
        int[][] mat = new int[3][5];

        for (int line = 0; line < 3; line++)
        {
            for (int index = 0; index < 5; index++)
                mat[line][index] = (int) (Math.random() * 51);
        }

        for (int[] line : mat)
        {
            ThreadCalc tCalc = new ThreadCalc(line);
            tCalc.start();
        }
    }
}
