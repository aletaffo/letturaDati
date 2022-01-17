package com.example.letturadati;

import java.util.ArrayList;

    public class GestioneBrani {
       ArrayList<Brano> listaBrani;

       public GestioneBrani(){

           listaBrani = new ArrayList<Brano>();

       }
           public void addBrano (String titolo){

               Brano br = new Brano(titolo);
               listaBrani.add(br);
           }

    }

