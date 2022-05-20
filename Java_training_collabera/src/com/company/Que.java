package com.company;


import java.util.Scanner;

public class Que {
    Node front;
    Node rear;

    int size = 0;

    public void enqueue(String s){
        this.size++;
        if( front == null && rear == null ){
            Node node = new Node(  s );
            this.front = node;
            this.rear = node;
        } else {
            Node node = new Node( s , null , this.rear );
            this.rear.nextNode = node;
            this.rear = node;
        }
    }

    public String dequeue(){
        if (size == 0) {
            return null;
        }
        String vv = this.front.value;

        this.front = this.front.nextNode;

        this.front.prevNode = null;

        return vv;
    }


    public Node getFront(){
        return this.front;
    }

    public Node getRear(){
        return this.rear;
    }

    public int size() {
        return this.size;
    }

    public void iterator(){
        Node last = this.front;
        while ( last != null ){
            System.out.println(last.value);
            last = last.nextNode;
        }
    }


    public void showQueue() {
    }
}

class Node {
    String value;
    Node prevNode;
    Node nextNode;

    public Node( String v){
        this.value = v;
    }

    public Node( String v , Node nxtNode , Node preNode){
        this.value = v;
        this.nextNode = nxtNode;
        this.prevNode = preNode;
    }


  
}
