package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class myStack {

    //Stack
    ArrayList<String> entries = new ArrayList<>();

    public myStack(){

    }

    public String peek(){
        return entries.get(this.size()-1);
    }

    public String pop(){
        String ret = entries.get(this.size()-1);
        entries.remove(this.size()-1);
        return ret;
    }

    public void push( String ele ){
        entries.add(ele);
    }

    public int size(){
        return entries.size();
    }


    //Stack Problem to see if the given charcter '(){}[' is valid
    public static boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>(); // Stack object

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i); // getting every character
            if(ch=='(' || ch== '[' || ch=='{'){ // if it is a beginning condition push to stack
                stack1.push(ch);
            }
            // conditions when it should be false
            else if(stack1.isEmpty()==true){
                return false;
            }
            else if(ch==')' && stack1.pop()!='('){
                return false;
            }
            else if(ch==']' && stack1.pop()!='['){
                return false;
            }
            else if(ch=='}' && stack1.pop()!='{'){
                return false;
            }
        }
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        String test = "(){}[";
        System.out.println("Validity: "+isValid(test));
    }


}
