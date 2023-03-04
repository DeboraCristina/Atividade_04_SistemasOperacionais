package controller;

public class ThreadVetor extends Thread
{
    private final int value;
    private final int[] vector;

    public ThreadVetor(int value, int[] vector)
    {
        this.vector = vector;
        this.value = value;
    }

    @Override
    public void run()
    {
        count_for();
    }

    void run_commonFor()
    {
        int sum = 0;
        for (int index = 0; index < vector.length; index++)
            sum += vector[index];
    }

    void run_forEach()
    {
        for (int val: vector)
            val = 0;
    }

    void count_for()
    {
        double initTime;
        double endTime;
        double totalSeconds;

        initTime = System.nanoTime();
        if (value % 2 == 0)
            run_forEach();
        else
            run_commonFor();
        endTime = System.nanoTime();
        totalSeconds = (endTime - initTime) / Math.pow(10, 9);
        System.out.printf("A Thread #%d gastou %.10f segundos para percorrer o vetor.\n", (int) getId(), totalSeconds);
    }
}
