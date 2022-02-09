package com.bam;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * Класс отвечающий за буфер. В основе лежит структура данных очередь.
 */
public class Buffer {


    /**
     * Очередь хранящая целые числа Integer. Менять в зависимости от задания
     */
    private Queue<Integer> __buffer = new ArrayDeque<>();


    /**
     * Метод для добавления элемента в очередь
     * @param i
     */
    public synchronized void add(Integer i)
    {

        __buffer.add(i);

        notify();

    }

    /**
     * Метод для получения первого элемента очереди с удалением.
     * @return
     */
    public Integer get() throws InterruptedException {

        if(__buffer.isEmpty ())
        {
            wait();
        }
        return __buffer.poll();
    }

}
