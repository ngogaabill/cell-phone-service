package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //CellPhone("");
/*What is the serial number? 2597153
What model is the phone? iPhone 15 Pro Max
Who is the carrier? Verizon
What is the phone number? 888-555-1234
Who is the owner of the phone? Sandra*/
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
        CellPhone myphone = new CellPhone(serialNumber, phoneModel, carrier, phoneNumber, phoneOwner);

        System.out.println("Hey,  " + myphone.getOwner());
        System.out.println("Your Serial number is: "+ myphone.getSerialNumber());
        System.out.println("Your Phone Model: " + myphone.getModel());
        System.out.println("Your Carrier: " + myphone.getCarrier());
        System.out.println("Your Phone Number: " + myphone.getPhoneNumber());



    }

}
