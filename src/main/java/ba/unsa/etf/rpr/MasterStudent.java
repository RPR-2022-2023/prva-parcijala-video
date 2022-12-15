package ba.unsa.etf.rpr;

public class MasterStudent extends Student implements Comparable<MasterStudent>{
    private int godinaDiplomiranja;


    public MasterStudent(String ime, String prezime, int indeks, int godinaStudija) {
        super(ime, prezime, indeks, godinaStudija);
    }

    public MasterStudent(String ime, String prezime, int indeks, int godinaStudija, int godinaDiplomiranja) {
        super(ime, prezime, indeks, godinaStudija);
        this.godinaDiplomiranja = godinaDiplomiranja;
    }

    public int getGodinaDiplomiranja() {
        return godinaDiplomiranja;
    }

    public void setGodinaDiplomiranja(int godinaDiplomiranja) {
        this.godinaDiplomiranja = godinaDiplomiranja;
    }

    public MasterStudent() {
    }

    @Override
    public void ispisi() {

        System.out.println("Metoda ispisi iz MasterStudent klase");
    }

    @Override
    public String toString() {
        return super.toString() + "MasterStudent{" +
                "godinaDiplomiranja=" + godinaDiplomiranja +
                '}';
    }

    @Override
    public int compareTo(MasterStudent o) {
       if( this.getIndeks()==o.getIndeks()) return 0;
        if(this.getIndeks()<o.getIndeks()) return -1;
        return 1;
    }
}
