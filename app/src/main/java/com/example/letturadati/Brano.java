    package com.example.letturadati;

    import java.util.Date;

    public class Brano {

        private String titolo;
        private String autore;
        private String genere;
        private int durata;
        private String urlVideo;
        private Date dataLancio;

            public Brano(String titolo, String autore, String genere, int durata){
                this.titolo = titolo;
                this.autore = autore;
                this.genere = genere;
                this.durata = durata;
            }

            public Brano(String titolo){
              this.titolo = titolo;
             }
//Titolo
        public String getTitolo() {
            return titolo;
        }
        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }
//Autore
        public String getAutore() {
            return autore;
        }
        public void setAutore(String autore) {
            this.autore = autore;
        }
//Genere
        public String getGenere() {
            return genere;
        }
        public void setGenere(String genere) {
            this.genere = genere;
        }
//Durata
        public int getDurata() {
            return durata;
        }
        public void setDurata(int durata) {
            this.durata = durata;
        }

}
