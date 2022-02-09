package com.bam;

import java.util.Random;

public class MyThread2 extends Thread{

    private final Buffer __buffer;

    public MyThread2(Buffer buffer)
    {
        __buffer = buffer;
    }


    @Override
    public void run() {

        try {

            method();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void method() throws InterruptedException {


        while (!isInterrupted())
        {
            System.out.println(__buffer.get());
        }



    }
}
