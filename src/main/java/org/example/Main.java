package org.example;

import org.example.models.Grocery;
import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pazar Arabası Uygulaması Başlıyor ===");
        System.out.println("\n=== Cep Telefonu Rehberi Başlıyor ===");

        MobilePhone myPhone = new MobilePhone("555-123-4567");

        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        Contact jane = Contact.createContact("Jane", "23571113");

        myPhone.addNewContact(bob);
        myPhone.addNewContact(alice);
        myPhone.addNewContact(tom);
        myPhone.addNewContact(jane);

        myPhone.printContact();

        Contact foundContact = myPhone.queryContact("Alice");
        if (foundContact != null) {
            System.out.println("\nBulunan Kişi: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("\nKişi bulunamadı.");
        }
    }
}