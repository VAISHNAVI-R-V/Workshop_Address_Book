package com.bridgelabz;

/**
 * @purpose: Implementation On Address Book Program.
 *
 * @author: VAISHNAVI R. VSHWAKARMA.
 * @date: 11-Oct.-2021.
 */
public class AddressBook {
    //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program..!!");

        Contact contact = new Contact();
        contact.setFirstName("VAISHNAVI");
        contact.setLastName("Vishwakarma");
        contact.setCity("Bidar");
        contact.setPin("585401");
        contact.setMobileNo("932222208");
        contact.setState("KARNATAKA");
    }

}
