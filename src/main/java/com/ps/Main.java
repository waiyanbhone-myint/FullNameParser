package com.ps;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String [] nameParts = new String[3];

    public static void main(String[] args) {

        System.out.println("Welcome to Full Name Parser");

        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();

        nameSplitter(fullName);
        displayResult();

    }

    //-------------------Helping Method--------------------//
    public static void nameSplitter(String fullName){

        String trimFullName = fullName.trim();
        String cleanFullName = trimFullName.replaceAll("\\s+", " ");
        nameParts = cleanFullName.split(" ");
    }

    public static void  displayResult(){

        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (nameParts.length<3){
            System.out.println("firstName = "+ nameParts[0]);
            System.out.println("middleName = (none)");
            System.out.println("lastName = " + nameParts[1]);
        }
        else{
            System.out.println("firstName = " + nameParts[0]);
            System.out.println("middleName = " + nameParts[1]);
            System.out.println("lastName = " + nameParts[2]);
        }

    }
}