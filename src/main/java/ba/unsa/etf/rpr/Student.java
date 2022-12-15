package ba.unsa.etf.rpr;

import java.util.Objects;

public abstract class Student {
    private String ime, prezime;
    private int indeks, godinaStudija;

    public Student(String ime, String prezime, int indeks, int godinaStudija) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
        this.godinaStudija = godinaStudija;
    }

    public Student() {

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void ispisi(){
        System.out.println("Metoda ispisi iz bazne klase");
    }

    @Override
    public boolean equals(Object o) {
      //  return indeks == ((Student) o).indeks;

     return  this.ime.equals(((Student) o).ime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, indeks, godinaStudija);
    }

    @Override
    public String toString() {
        return ""+indeks;
    }
}
