package com.mycompany.bankproject;

import java.util.ArrayList;
import java.util.Scanner;

public class BankClass {
    Scanner sc = new Scanner(System.in);
    
    
    private int modelId;
    private String modelName;
    private int modelPassword;
    private double modelMoneyAccount;
    
    public void status(){
        System.out.println("--------------------------");
        System.out.println("Seu ID é: "+this.modelId);
        System.out.println("Seu NOME é: "+this.modelName);
        System.out.println("Sua SENHA é: "+this.modelPassword);
        System.out.println("Você tem disponível: R$"+this.modelMoneyAccount);
        System.out.println("--------------------------");
    }
    
    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelPassword(int modelPassword) {
        this.modelPassword = modelPassword;
    }

    public void setModelMoneyAccount(double modelMoneyAccount) {
        this.modelMoneyAccount = modelMoneyAccount;
    }

    public int getModelId() {
        return modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelPassword() {
        return modelPassword;
    }

    public double getModelMoneyAccount() {
        return modelMoneyAccount;
    }
    
    public void functionality(){
        
        boolean global = true;
        double mn;
        String name;
        int password;
        double subtraction;
        
        System.out.println("Digite seu nome: ");
        name = sc.nextLine();
        this.setModelName(name);
        
        System.out.println("Digite sua senha: ");
        password = sc.nextInt();
        this.setModelPassword(password);
        
        while(global == true){
            int op;
            System.out.println("1: Para realizar um depósito\n"+
                               "2: Para realizar um saque\n"+
                               "3: Para sair");
            op = sc.nextInt();
            
            switch (op){
                
                case 1:  
                    System.out.println("Digite a quantidade que deseja depositar: ");
                    mn = sc.nextDouble();
                                                            
                    this.setModelMoneyAccount(mn);
                    status();
                    break;
                
                
                  
                case 2 : 
                    if(this.getModelMoneyAccount() >= 2){
                         
                        System.out.println("Digite a quantia que deseja sacar: ");
                        mn = sc.nextDouble();
                                                                      
                        if(mn > this.getModelMoneyAccount()){
                            System.out.println("SALDO INSUFICIENTE 1");
                            System.out.println("--------------------------");
                            status();
                            break;
                        }
                        
                        subtraction = this.getModelMoneyAccount() - mn;
                        this.setModelMoneyAccount(subtraction);
                        System.out.println("Saque de R$"+mn+" realizado com sucesso");
                        
                    }else if(this.getModelMoneyAccount() == 0){
                        System.out.println("SALDO INSUFICIENTE 2");
                        System.out.println("--------------------------");
                    }
                    
                    
                    status();
                    break;
                  
                case 3 :
                    global = false;
                    break;
            }
        }
    }
    
    
    
}
