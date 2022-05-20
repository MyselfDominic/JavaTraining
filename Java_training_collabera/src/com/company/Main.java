package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.*;


import static java.time.temporal.ChronoUnit.DAYS;
import static java.util.Arrays.binarySearch;

public class Main {

    public static <Calender> void main(String[] args) {

        //Find how many days remaining in month
        Month month = Month.APRIL;
        int monthlength = (month.length(false));
        LocalDate today =  LocalDate.now( );
        int currDay = today.getDayOfMonth();
        int leftDay = monthlength - currDay;
        System.out.println(leftDay);

        //Find how many days remaining in month using calander
        Calendar cal = Calendar.getInstance();
        Date d = new Date();
        //String myDate = new SimpleDateFormat("d");


        //Scanner using Que
        Que q = new Que();
        Scanner sc = new Scanner(System.in);
        String s = "temp";
        while(!(s.length()==0)) {
            System.out.print("Enter a string: ");
            s = sc.nextLine();
            if(!(s.length()==0))
                q.enqueue(s);
        }
        q.showQueue();

        //Epoch Time with hashMap

















        int[] numbers = { 1, 2, 3, 4, 5, 6 };


        //Pick first & last element in array
        int firstElement = 0;
        int lastElement = (numbers.length)-1;

        //System.out.println(firstElement);
        //System.out.println(lastElement);




        //Pick small & large number in array
        int smallest = numbers[0];
        int largest = numbers[(numbers.length)-1];

        for (int i=1; i <= (numbers.length)-1; i++){
            if (numbers[i]< smallest){
                smallest = numbers[i];
            }

            if (numbers[i]> largest){
                largest = numbers[i];
            }
        }
        //System.out.println(smallest);
        //System.out.println(largest);



        //sorting elements in array in ascending order (bubble sort)
       for (int i = 0; i < numbers.length; i++ ){
            for(int j = i + 1; j < numbers.length; j++){
                int temp = 0;
                if (numbers[i] > numbers[j]){
                    temp = numbers [i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
           //System.out.println(numbers[i]);
       }

        //Search a specific element (Linear search)
        int toBeFound = 4;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == toBeFound) {
                //System.out.println("Element " + toBeFound + " is present at index: " + i);
                return;
            } else {
               // System.out.println("Element " + toBeFound + " is not present at index:" + i);
            }
        }

        binarySearch(numbers,0,lastElement,toBeFound);

        //ArrayLists
        ArrayList <String> list = new ArrayList<>();

        list.add("Satty");
        list.add("Fatty");
        list.add("Motty");

        for (int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String bq : list){
            System.out.println(bq);
        }

        //Hash
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name" , "Some");
        hashMap.put("address" , "Ind");
        hashMap.put("same" , "Thing");

        hashMap.get("name");

        Set<String> keys = hashMap.keySet();

        Iterator<String> ii = keys.iterator();

        while (ii.hasNext()){
            System.out.println("key:" + ii.next() + "I value:" + hashMap.get(ii.next()));
        }

        for(Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Key:" + key + "I value:" + value);
        }

        //Sets
        Set<String> myset = new HashSet<>();
        myset.add("DSF");





    }

    //binarySearch
    public static boolean binarySearch(int[] numbers, int firstElement, int lastElement, int toBeFound) {
        int mid = (firstElement + lastElement)/2;
        while( firstElement < lastElement ){
            if ( numbers[mid] < toBeFound ){
                firstElement = mid + 1;
            }else if ( numbers[mid] == toBeFound ){
                System.out.println("Element is found at index: " + mid);
                return true;
            }else{
                lastElement = mid;
            }
            mid = (firstElement + lastElement)/2;
        }

            System.out.println("Element is not found!");

        return false;
    }





}










