package domaci4;

public class SastojakRecepta extends Sastojak {

    private double kolicinaSastojkaPoJedinici;

    public SastojakRecepta(String sastojak, double cenaPoJedinici, double kolicinaSastojkaPoJedinici) {
        super(sastojak, cenaPoJedinici);
        this.kolicinaSastojkaPoJedinici = kolicinaSastojkaPoJedinici;
    }

    public SastojakRecepta(double kolicinaSastojkaPoJedinici) {
        this.kolicinaSastojkaPoJedinici = kolicinaSastojkaPoJedinici;
    }

    public SastojakRecepta() {
        super();
        this.kolicinaSastojkaPoJedinici = 0;
    }

    public double getKolicinaSastojkaPoJedinici() {
        return kolicinaSastojkaPoJedinici;
    }

    public void setKolicinaSastojkaPoJedinici(double kolicinaSastojkaPoJedinici) {
        this.kolicinaSastojkaPoJedinici = kolicinaSastojkaPoJedinici;
    }

    public double ukupnaCena(double cenaPoJedinici, double kolicinaSastojkaPoJedinici) {
        double ukupnaCena = getCenaPoJedinici() * getKolicinaSastojkaPoJedinici();
        return ukupnaCena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sastojak Recepta: \n");
        sb.append(super.toString()).append('\n');
        sb.append("Ukupna cena je ").append(ukupnaCena(getCenaPoJedinici(), getKolicinaSastojkaPoJedinici())).append(" dinara");
        return sb.toString();
    }
}