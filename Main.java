package com.company;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Buku> Buku = new ArrayList<Buku>();

        Buku.add(new Buku("0101","Azab Kubur","2019","Gober",300000,1));
        Buku.add(new Buku("0202","Laskar Pelangi","2008","Andrea Hirata",180000,2));
        Buku.add(new Buku("0302","Gie","2005","Riri",115000,3));

        Buku.get(0).setjudulbuku("Azab Kubur");
        Buku.get(0).settahunterbit("2019");
        Buku.get(0).setPrice(300000);
        Buku.get(0).setRating(1);

        for (Buku buku:Buku){
            buku.searchisbn("0101");
        }

        Buku.remove(0);

        for (Buku buku:Buku){
            System.out.println(buku);

        }
    }
}
