package controller;

public class ThreadFrog extends Thread
{
    private final int maxJump;
    private final int maxDistance;

    public ThreadFrog(int maxJump, int maxDistance)
    {
        this.maxJump = maxJump;
        this.maxDistance = maxDistance;
    }

    @Override
    public void run() {
        int travelledDistance = 0;
        int jump;
        while (travelledDistance < maxDistance)
        {
            jump = jump();
            travelledDistance += jump;
            System.out.printf("Sapo #%d pulou %d metros e percorreu %d metros.\n", getId(), jump, travelledDistance);
        }
        System.out.println("Sapo #"+getId()+" chegou ao final.");
    }

    private int jump()
    {
        return (int) ((Math.random() * maxJump + 1));
    }
}
