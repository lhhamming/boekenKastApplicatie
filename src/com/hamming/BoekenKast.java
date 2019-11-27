package com.hamming;

import java.util.ArrayList;

public class BoekenKast {

    private int maxCapacity;

    private ArrayList<Boek> Boeken = new ArrayList<>();

    public BoekenKast(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public void addBoek(int isbn, String boekNaam, int paginas, Auteur auteur) {
        if(Boeken.size() >= maxCapacity){
            System.out.println("The maximum amount of books has ben added!");
        }
        else{
            Boek b = new Boek(isbn,boekNaam,paginas,auteur);
            Boeken.add(b);
        }
    }

    public boolean addBoek(Boek b){
        if(b != null){
            Boeken.add(b);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return Boeken.toString();
    }

    public void removeBoek(String titel) {
        Boek toRemove = new Boek(123,"test",0,null);
        for (Boek b : Boeken){
            if(b.getTitel().equals(titel)){
                toRemove = b;
            }
        }
        Boeken.remove(toRemove);
    }

    public int getBooks() {
        return Boeken.size();
    }

    public int getPages() {
        if(Boeken.size() > 0){
            int pages = 0;
            for (Boek b : Boeken){
                pages += b.getPaginas();
            }
            return pages;
        }else {
            return 0;
        }
    }

    public String getOldestAuther(){
        int Oldestage = 20291127;
        String OldestAuthor = "";
        for (Boek b : Boeken){
            if(b.getAuthorGebat() < Oldestage){
                OldestAuthor = b.getAuthorName();
                Oldestage = b.getAuthorGebat();
            }
        }
        return OldestAuthor;
    }

    public String getDoubleBooks(){
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> comparedISBN = new ArrayList<>();
        int tempIndex = 0;
        boolean hasBeenCompared = false;
        for (Boek b : Boeken){
            for (int i = 0; i < Boeken.size(); i++) {
                if(i != tempIndex){
                    for(int d = 0; d < comparedISBN.size(); i++){
                        if(comparedISBN.get(i).equals(b)){
                            hasBeenCompared = true;
                        }
                    }
                    if(!hasBeenCompared){
                        if(b.equals(Boeken.get(i))){
                            sb.append(b);
                        }
                    }
                }
                hasBeenCompared = false;
            }
        }
        return sb.toString();
    }

    public Boek moveBook(int isbn) {
        for (Boek b : Boeken){
            if(b.getIsbn() == isbn){
                return b;
            }
        }
        return null;
    }
}
