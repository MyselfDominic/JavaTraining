package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test6 {

    public static void main(String[] args){

        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        StringExcersise.possibleStrings(2, alphabet,"");
    }
}

class StringExcersise {

    public static ArrayList possibleStrings(int maxLength, char[] alphabet, String curr) {
        ArrayList<String> arr = new ArrayList<String>();
////could not write code to get number of combinations per character///
        if(curr.length() == maxLength) {
            if (curr.charAt(0)!= curr.charAt(1)){
                arr.add(curr);
                System.out.println(arr);
            }

        } else {
            for(int i = 0; i < alphabet.length; i++) {
                String oldCurr = curr;
                curr += alphabet[i];
                possibleStrings(maxLength,alphabet,curr);
                curr = oldCurr;
            }

            for (int i = 0; i < arr.toArray().length; i++){
                
            }

        }
        return arr;
    }



}
