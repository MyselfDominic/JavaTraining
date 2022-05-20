package com.company;
//Threading
public class Test4 {
    static int myNumber = 1;
    public static void main(String[] args) throws InterruptedException {
        PrintOdd printOdd = new PrintOdd();
        PrintEven printEven = new PrintEven();
        printOdd.start();
        printEven.start();

        System.out.println("Im ENDED");
    }

    static class PrintOdd extends Thread {
        public void run() {
            for( int i = 1; i< 20 ; i = i+2){
                System.out.println( i );
                try {
                    sleep( 1000 );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class PrintEven extends Thread {
        public void run() {
            for( int i = 0; i< 20 ; i = i+ 2){
                System.out.println( i );
                try {
                    sleep( 1000 );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }




    }




/// Thread  ==
// Synchronized Thread ==
// non synchronized  Thread ==
// sleep  and wait
// Runnable interface
// ---> Main Odd==> PrintOdd => wait ==> awake ==> PrintEven ==> Print ==> wait ==> awake => odd ==>
// Thread-safe /
//
