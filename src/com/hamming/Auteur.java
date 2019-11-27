package com.hamming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Auteur {
    private String Naam;
    private int Gebat;

    public Auteur(String Naam, int Gebat){
        this.Naam = Naam;
        this.Gebat = Gebat;
    }

    public String getNaam(){
        return this.Naam;
    }

    public int getGebat(){
        return this.Gebat;
    }

    @Override
    public String toString() {
        return Naam;
    }
}
