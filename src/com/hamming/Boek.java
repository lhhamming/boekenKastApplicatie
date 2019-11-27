package com.hamming;

import com.sun.org.apache.bcel.internal.generic.ObjectType;

public class Boek {
    private int isbn;
    private String titel;
    private int paginas;
    private Auteur auteur;

    public Boek(int isbn, String titel, int paginas, Auteur auteur){
        this.isbn = isbn;
        this.titel = titel;
        this.paginas = paginas;
        this.auteur = auteur;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public int getAuthorGebat(){
        return this.auteur.getGebat();
    }

    public String getAuthorName(){
        return this.auteur.getNaam();
    }

    public String getTitel(){
        return this.titel;
    }

    public int getIsbn(){
        return this.isbn;
    }

    @Override
    public String toString() {
        return "Titel: " + titel + " " + "paginas: " + paginas + " " +"isbn: " + isbn + " " + "Auteur: " + auteur + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Boek b = (Boek) obj;
        return this.isbn == b.getIsbn() ? true : false;
    }
}
