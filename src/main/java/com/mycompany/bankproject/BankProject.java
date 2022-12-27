package com.mycompany.bankproject;

import java.util.Random;
public class BankProject {

    public static void main(String[] args) {
        Random generate = new Random();
        BankClass bc = new BankClass();
        bc.setModelId(generate.nextInt(1000));
        bc.functionality();
        bc.status();
        
    }
}
