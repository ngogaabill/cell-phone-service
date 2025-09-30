package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //Get Info from the user
        System.out.print("What is the serial number?");
        int serialNumber = Integer.parseInt(scnr.nextLine());
        System.out.print("What model is the phone?");
        String phoneModel = scnr.nextLine();
        System.out.print("Who is the carrier?");
        String carrier = scnr.nextLine();
        System.out.print("What is the phone number?");
        String phoneNumber = scnr.nextLine();
        System.out.print("Who is the owner of the phone?");
        String phoneOwner = scnr.nextLine();
        CellPhone cellPhone1 = new CellPhone(serialNumber, phoneModel, carrier, phoneNumber, phoneOwner); //Take the parameters to the Cellphone class
        CellPhone cellPhone2 = new CellPhone(1000000, "Iphone 17", "Spectrum", "207-207-2007", "kingJames"); //Overload the second cellPhone with this fixed Info
        //Make cell 1 call cell 2
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1);
        //Display both Phone Info
        display(cellPhone1);
        display(cellPhone2);

    }

    public static void display(CellPhone phone) {
        System.out.println("The Owner is ,  " + phone.getOwner());
        System.out.println("Serial number is: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());

    }

}
