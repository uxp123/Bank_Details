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
public class Papsyfresh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];

        Customer papsy = new Customer();

        papsy.setName("Papsy");
        papsy.setAge(13);
        papsy.setBalance(0);
        papsy.setMobile("0248956234");
        papsy.setGender("Male");
        papsy.setBankName("Cal Bank");
        papsy.setLocation("Independence Avenue Accra");
        papsy.setDigitaladress("GT-49B4849");
        papsy.setAccountnumber("1500002346859");
        papsy.setAddress("Airpot Hills");
        papsy.setDeposits(100);
        papsy.setWitdrawals(0);

        papsy.setDeposits(200);
        papsy.setWitdrawals(50);

        Customer divine = new Customer();

        divine.setName("Divine ");
        divine.setAge(21);
        divine.setBalance(0);
        divine.setMobile("0548956234");
        divine.setGender("Male");
        divine.setBankName("CAL Bank");
        divine.setLocation("OSU Avenue");
        divine.setDigitaladress("GT-AQ564849");
        divine.setAccountnumber("1500002398759");
        divine.setAddress("Golf City Tema");
        divine.setDeposits(100);
        divine.setWitdrawals(0);

        Customer mary = new Customer();

        mary.setName("Mary");
        mary.setAge(20);
        mary.setBalance(0);
        mary.setMobile("057956234");
        mary.setGender("Female");
        mary.setBankName("Cal Bank");
        mary.setLocation("Accra");
        mary.setDigitaladress("GT-AQ564849");
        mary.setAccountnumber("1500009987759");
        mary.setAddress("Tema");
        mary.setDeposits(100);
        mary.setWitdrawals(0);

        customers[0] = papsy;
        customers[1] = divine;
        customers[2] = mary;

        for (int i = 0; i < customers.length; i++) {

            customers[i].displayCustomerDetails(i);

            //System.out.println("Customer ID: " + i);
            //System.out.println("Name: " + customers[i].getName());
            //System.out.println("Age: " + customers[i].getAge());
            //System.out.println("Balance: " + customers[i].getBalance());
            //System.out.println("Mobile: " + customers[i].getMobile());
            //System.out.println("Bank: " + customers[i].getBankName());
            //System.out.println("Adress: " + customers[i].getAddress());
            //System.out.println("AccountNumber: " + customers[i].getAccountnumber());
            //System.out.println("Total Deposits: " + customers[i].getDeposits());
            //System.out.println("Total Withdrawals: " + customers[i].getWitdrawals());
            //System.out.println("==============================================");
        }

    }

    // TODO code application logic here
}
