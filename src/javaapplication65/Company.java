/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

/**
 *
 * @author David
 */


public class Company {
    private int companyIndex;
    private String companyName;
    private String phoneNumber;
    
    Company (int cIndex, String cName, String cPhone){
        companyIndex = cIndex;
        companyName = cName;
        phoneNumber = cPhone;        
    }

public void printCompany(){
    System.out.println("Company info:");
    System.out.println("Index: " + companyIndex);
    System.out.println("Name: " + getCompanyName());
    System.out.println("Phone: " + phoneNumber);
}

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }
}
