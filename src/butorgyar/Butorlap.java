package butorgyar;

public class Butorlap {
    private double hosszusag, szelesseg;
    private boolean isTartolap;
    private final int tartolapAr = 5000, hatlapAr = 500;

    public Butorlap(double hosszusagCm, double szelessegCm, boolean isTartolap) {
        this.hosszusag = hosszusagCm / 100;
        this.szelesseg = szelessegCm / 100;
        this.isTartolap = isTartolap;
    }

    public double arSzamol() {
        return hosszusag * szelesseg * (isTartolap? tartolapAr: hatlapAr);
    }
}
