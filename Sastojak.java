package domaci4;

public class Sastojak {
    private String sastojak;
    private double cenaPoJedinici;

    public Sastojak(String sastojak, double cenaPoJedinici) {
        this.sastojak = sastojak;
        this.cenaPoJedinici = cenaPoJedinici;
    }

    public Sastojak() {
    }

    public String getSastojak() {
        return sastojak;
    }

    public void setSastojak(String sastojak) {
        this.sastojak = sastojak;
    }

    public double getCenaPoJedinici() {
        return cenaPoJedinici;
    }

    public void setCenaPoJedinici(double cenaPoJedinici) {
        this.cenaPoJedinici = cenaPoJedinici;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append("Sastojak = ").append(sastojak).append('\n');
        sb.append("Cena Po Jedinici = ").append(cenaPoJedinici);
        return sb.toString();
    }
}
