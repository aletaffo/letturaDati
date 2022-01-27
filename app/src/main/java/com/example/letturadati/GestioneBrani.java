package com.example.letturadati;

import java.util.ArrayList;

    public class GestioneBrani {
       ArrayList<Brano> listaBrani;

       public GestioneBrani(){

           listaBrani = new ArrayList<Brano>();

       }
           public void addBrano (String titolo){

               Brano br = new Brano(titolo); //crea un oggetto di tipo brano
               listaBrani.add(br);  //
           }

           public String listaSong(){
           StringBuilder sbSong = new StringBuilder();
           for(Brano brc : listaBrani){
               sbSong.append(brc.getTitolo().toString());
               sbSong.append("\n");
           }

           return sbSong.toString();
           }
    }

