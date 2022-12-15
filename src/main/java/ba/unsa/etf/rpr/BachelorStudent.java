package ba.unsa.etf.rpr;

public class BachelorStudent extends Student{
    public BachelorStudent(String ime, String prezime, int indeks, int godinaStudija) {
        super(ime, prezime, indeks, godinaStudija);
    }

    public BachelorStudent() {
    }

    @Override
    public void ispisi() {
        System.out.println("Metoda ispisi iz BachelorStudent klase");
    }

}
