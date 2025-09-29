package com.example;
import java.util.Scanner;

public class TipCalculator {

    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { 
        //You must use these variable in your calculations
        double tipAmount = cost * percent / 100.0;
        double totalWithTip = cost + tipAmount;

        double costPerPersonBeforeTip = cost / people;
        double tipPerPerson = tipAmount / people;
        double totalPerPerson = totalWithTip / people;

        tipAmount = Math.round(tipAmount * 100.0) / 100.0;
        totalWithTip = Math.round(totalWithTip * 100.0) / 100.0;
        costPerPersonBeforeTip = Math.round(costPerPersonBeforeTip * 100.0) / 100.0;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
        cost = Math.round(cost * 100.0) / 100.0;

        String result = "-------------------------------\n" +
                "Total bill before tip: $" + cost + "\n" +
                "Total percentage: " + percent + "%\n" +
                "Total tip: $" + tipAmount + "\n" +
                "Total Bill with tip: $" + totalWithTip + "\n" +
                "Per person cost before tip: $" + costPerPersonBeforeTip + "\n" +
                "Tip per person: $" + tipPerPerson + "\n" +
                "Total cost per person: $" + totalPerPerson + "\n" +
                "-------------------------------\n";

        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people are there?");
        int people = scan.nextInt();

        System.out.println("How much tip do you want to add?");
        int percent = scan.nextInt();

        System.out.println("How much was the food?");
        double cost = scan.nextDouble();

        String output = calculateTip(people, percent, cost);
        System.out.println(output);

        scan.close();
    }

    public static String extraCredit(int people, int percent, double cost) {
      String result = "Extra credit not implemented";
        boolean condition = true;
        return result;
    }
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

      //  while (condition) {
            //enter your code here 
        //    System.out.println("placeholder");
          //  condition = false;
    
        {

 //       return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     //public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
     //   int people=10; 
   //     int percent=8;
       // double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        //System.out.println(extraCredit(people, percent, cost));
    }


