package com.Bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {

    private List<AddressbookData> addressBookDetailsList;


    public AddressBookService(List<AddressbookData>addressBookDetailsList){
        this.addressBookDetailsList = addressBookDetailsList;
    }


    public static void main(String[] args) {
         List<AddressbookData> addressBookDetailsList = new ArrayList<>();
        AddressBookService addressBookService = new AddressBookService(addressBookDetailsList);
        Scanner consoleInputReader = new Scanner(System.in);
        addressBookService.readAddressBookData(consoleInputReader);
        addressBookService.writeAddressBookData();

    }
    private void writeAddressBookData(){
        System.out.println("\nWriting Addressbook  data to console\n "+addressBookDetailsList );

    }

    private void readAddressBookData(Scanner consoleInputReader) {
        System.out.println("Enter First Name : ");
        String FIRST_NAME = consoleInputReader.next();
        System.out.println("Enter Last Name : ");
        String LAST_NAME = consoleInputReader.next();
        System.out.println("Enter Email id : ");
        String EMAIL_ID = consoleInputReader.next();
        System.out.println("Enter Mobile Number : ");
        long MOBILE_NUMBER = consoleInputReader.nextLong();
        System.out.println("Enter Address : ");
        String ADDRESS = consoleInputReader.next();
        addressBookDetailsList.add(new AddressbookData(FIRST_NAME,LAST_NAME,EMAIL_ID,MOBILE_NUMBER,ADDRESS));

    }
}



