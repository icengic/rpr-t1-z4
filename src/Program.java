public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("Ilma", "Cengic", 16802);
        Predmet p1 = new Predmet("Razvoj Programskih Rjesenja", 123, 500);
        p1.upisi(s1);
        p1.ispisSpiskaStudenta();
        p1.ispisi(s1);
        p1.ispisSpiskaStudenta();
        s1.ispisStudenta();
    }

}
