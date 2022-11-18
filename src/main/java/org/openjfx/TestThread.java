package org.openjfx;

public class TestThread extends Thread{
    public void run(){
        System.out.println("The thread is now running...");
    }
    public static void main(String[] args){
        TestThread obj = new TestThread();
        obj.start();
    }
}
