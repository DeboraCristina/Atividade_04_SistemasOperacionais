package view;

import controller.ThreadVetor;

public class Main
{
    public static void main(String[] args)
    {
        int[] vector = new int[1000];
        int length = vector.length;

        for (int i = 0; i < length; i++)
            vector[i] = (int) ((Math.random() * 100) + 1);

        ThreadVetor common_for = new ThreadVetor(1, vector);
        ThreadVetor foreach = new ThreadVetor(2, vector);

        common_for.start();
        foreach.start();
    }
}
