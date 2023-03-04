package view;

import controller.ThreadFrog;

public class Main
{
    public static void main(String[] args)
    {
        int length = 5;
        int maxJump = 5;
        int maxDistance = 20;

        for (int i = 0; i < length; i++)
        {
            ThreadFrog frog = new ThreadFrog(maxJump, maxDistance);
            frog.start();
        }
    }
}
