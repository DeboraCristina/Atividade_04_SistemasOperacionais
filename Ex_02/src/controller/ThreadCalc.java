package controller;

public class ThreadCalc extends Thread
{
    private final int[] vector;

    public ThreadCalc (int[] vector)
    {
        this.vector = vector;
    }

    @Override
    public void run()
    {
        int sum = sumVector();

        System.out.println("Thread "+getId()+" --> "+sum+".");
    }

    private int sumVector()
    {
        int result = 0;

        for (int value : vector)
            result += value;
        return result;
    }
}
