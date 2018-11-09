public class Predmet {
    Student[] studenti;
    public String nazivPredmeta;
    public int sifraPredmeta, maxBrojStudenata;
    public Predmet ( String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata ) {
        studenti = new Student[1];
        this.nazivPredmeta = nazivPredmeta; this.sifraPredmeta = sifraPredmeta; this.maxBrojStudenata = maxBrojStudenata;
    }
    void upisi (Student s) {
        studenti[ studenti.length - 1 ] = s;
    }
    void ispisi (Student s) {
        for ( int i = 0; i < studenti.length; i++) {
            if ( studenti[i] == s && i != ( studenti.length - 1 ) ) {
                for( int j = i; j < studenti.length - 1; j++) {
                    studenti[j] = studenti[j + 1];
                }
                studenti[studenti.length - 1] = null; break;
            }
            else if( studenti[i] == s && i == ( studenti.length - 1 ) ) {
                studenti[i] = null;
                break;
            }
        }
    }
    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public Student[] getStudenti() {
        return studenti;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }
    public void ispisSpiskaStudenta () {
        for ( int i = 0; i < studenti.length; i++ ){
            int j = i + 1;
            if( studenti[i] == null ) continue;
            System.out.println( j + ". " + studenti[i].prezime + " " + studenti[i].ime + " (" + studenti[i].brojIndeksa + ")" );
        }
    }
}
