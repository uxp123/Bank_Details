/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papsyfresh;

/**
 *
 * @author philipfynn
 */
public class Customer extends Bank{

    private String name;
    private int age;
    private String address;
    private String mobile;
    private String gender;
    private String accountnumber;
    private double balance;
    private double deposits;
    private double withdrawals;

  public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

   
    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return (this.deposits - this.withdrawals);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = this.deposits + deposits;
    }

    public double getWitdrawals() {
        return withdrawals;
    }

    public void setWitdrawals(double witdrawals) {
        this.withdrawals = this.withdrawals + witdrawals;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    
    }
    
    public String getGender(){
        return this.gender;
    
    }
    
    public void displayCustomerDetails(int customerid){
        System.out.println("Customer ID: " + customerid);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Balance: " + this.balance);
        System.out.println("Mobile: " + this.mobile);
        System.out.println("Bank: " + getBankName());
        System.out.println("Adress: " + this.address);
        System.out.println("AccountNumber: " + this.accountnumber);
        System.out.println("Total Deposits: " + this.deposits);
        System.out.println("Total Withdrawals: " + this.withdrawals);
        System.out.println("==============================================");
    }
    
   

}
