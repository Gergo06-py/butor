package butorgyar;

public class Butor {
    public static int lapok;
    private Butorlap[] butorlapok;

    public Butor() {
        lapok = 0;
        this.butorlapok = new Butorlap[100];
    }

    public void lapHozzaad(Butorlap butorlap) {
        if (lapok < 100)
            butorlapok[lapok++] = butorlap;
    }

    public double arSzamol() {
        double teljesAr = 0;

        for (int i = 0; i < lapok; i++) {
            teljesAr += butorlapok[i].arSzamol();
        }

        return teljesAr;
    }

    @Override
    public String toString() {
        return "Butorlapok: " + lapok + ", ar " + arSzamol() + " Ft";
    }
}
