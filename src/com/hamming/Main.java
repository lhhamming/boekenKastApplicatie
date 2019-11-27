package com.hamming;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        BoekenKast b = new BoekenKast(5);
        Auteur Luuk = new Auteur("Luuk Hamming",20000907);
        Auteur Berit = new Auteur("Berit Basters",20010911);
        b.addBoek(1,"Kippenvel",327,Luuk);
        b.addBoek(2,"Kuppenvel 2",207,Berit);
        b.addBoek(2,"Kuppenvel 2",207,Berit);
        b.addBoek(3,"Trippenvel 3",290,Luuk);
        System.out.println(b);
        b.removeBoek("Kippenvel");
        System.out.println(b);
        System.out.println("The amount of books in the library are: " + b.getBooks());
        System.out.println("The amount of pages from every book combined is: " + b.getPages());
        System.out.println("The oldest Auther in the library is: " + b.getOldestAuther());
        System.out.println("Book that comes more than once: " + b.getDoubleBooks());
    }
}
