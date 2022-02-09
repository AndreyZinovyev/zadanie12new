package com.bam;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        // Создаем буфер
        Buffer _buffer = new Buffer();

        //Создаем потоки и передаем ссылку на буфер в их конструктор.
        MyThread1 _myThread1 = new MyThread1(_buffer);
        MyThread2 _myThread2 = new MyThread2(_buffer);

        _myThread1.start();
        _myThread2.start();
        Thread.sleep(10000);
        _myThread1.interrupt();
        _myThread2.interrupt();

    }
}
