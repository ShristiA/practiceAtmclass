package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<AtmClass> accountList = new ArrayList<>();
    static AtmClass account;
    static int userAccount;
    static int userPin;
    static double userAmount;
    static double total;

    public static void main(String[] args) {



        accountList.add(new AtmClass(111,"Shristi",1111,500.25));
        accountList.add(new AtmClass(222,"Sujita",2222,5000.25));
        accountList.add(new AtmClass(333,"Pradhan",3333,5.25));
        accountList.add(new AtmClass(444,"Amatya",4444,50.25));

        int trial =0;
        do {
            System.out.println("enter your account no");
            userAccount = sc.nextInt();
            System.out.println("enter your pin no");
            userPin = sc.nextInt();
            trial++;
            if(trial>=3){
                System.out.println("you have exceeded the trials");
            }
        }while((checkAccount(userAccount, userPin )== false) && (trial<3));


        if(checkAccount(userAccount,userPin) == true) {
        business();
        }



    }

    public static boolean checkAccount(int userAccount, int userPin){
        for (AtmClass acc : accountList) {
            if (userAccount == acc.getAccountNum() && userPin == acc.getPin()) {
                account = acc;
                return true;
            }
        } // end for

        return false;
    }

    public static void business(){
        System.out.println("would like to make deposit, withdrawal or check balance?");
        String userResponse = sc.next();

        if(userResponse .equalsIgnoreCase("deposit")){
            System.out.println("enter the amount");
            userAmount = sc.nextDouble();
            total = userAmount + account.getBalance();
        }
        if(userResponse .equalsIgnoreCase("withdrawal")){
            System.out.println("Enter the amount");
            userAmount = sc.nextDouble();
            if(userAmount> account.getBalance()){
                System.out.println("your are out of your balance");
            }if(userAmount <account.getBalance()){
                total = account.getBalance()-userAmount;
            }
        }
        if(userResponse.equalsIgnoreCase("checking balance")){
            total = account.getBalance();
        }

        System.out.println("Name =================" + account.getUserName());
        System.out.println(("Account Number ======" + account.getAccountNum()));
        System.out.println("Deposit/Withdrawal====" + userAmount);
        System.out.println("Beginning Balance=====" + account.getBalance());
        System.out.println("total=================" + total);
    }
}
