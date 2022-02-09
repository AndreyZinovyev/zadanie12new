package com.bam;

import java.util.Random;

public class MyThread1 extends Thread{

    private final Buffer __buffer;

    public MyThread1(Buffer buffer)
    {
        __buffer = buffer;
    }


    /**
     * Главный метод потока. Запускается при вызове start
     */
    @Override
    public void run() {

        try {

            method();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     *Бесконечно генерирует рандомные числа и добавляет их в буфер.
     */
    private void method() throws InterruptedException {


        int i=1;
        boolean del=true;

        while (!isInterrupted())
        {
            for(int j=2;j<i;j++)
            {
                if(i%j ==0 )
                {
                    del = false;
                    break;
                }
            }
            if(del)
            {
                __buffer.add(i);
            }
            i++;
            del = true;

        }


    }
}
