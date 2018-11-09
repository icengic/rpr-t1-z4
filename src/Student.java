public class Student {
    String ime, prezime;
    int brojIndeksa;
    public Student (String ime, String prezime, int brI) {
        this.ime = ime; this.prezime = prezime; brojIndeksa = brI;
    }
    public String getIme () {
        return ime;
    }
    public String getPrezime () {
        return prezime;
    }
    public int getBrojIndeksa () {
        return brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void ispisStudenta () {
        System.out.println( prezime + " " + ime + " (" + brojIndeksa + ")" );
    }
}
