package domaci4;

import java.util.ArrayList;

public class Recept extends SastojakRecepta {
    private String imeRecepta;
    private int tezinaRecepta;
    private ArrayList<SastojakRecepta> sastojci;

    public Recept(String sastojak, double cenaPoJedinici, double kolicinaSastojkaPoJedinici, String imeRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojci) {
        super(sastojak, cenaPoJedinici, kolicinaSastojkaPoJedinici);
        this.imeRecepta = imeRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.sastojci = sastojci;
    }
    public Recept(String imeRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojci){
        this.imeRecepta = imeRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.sastojci = sastojci;
    }


    public Recept(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }

    public String getImeRecepta() {
        return imeRecepta;
    }


    public void setImeRecepta(String imeRecepta) {
        this.imeRecepta = imeRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append("ImeRecepta = ").append(imeRecepta).append('\n');
        if(tezinaRecepta==1)
        sb.append("Tezina Recepta = pocetni ").append(tezinaRecepta).append('\n');
        if(tezinaRecepta==2)
            sb.append("Tezina Recepta = lak ").append(tezinaRecepta).append('\n');
        if(tezinaRecepta==3)
            sb.append("Tezina Recepta = srednji ").append(tezinaRecepta).append('\n');
        if(tezinaRecepta==4)
            sb.append("Tezina Recepta = tezak ").append(tezinaRecepta).append('\n');
        if(tezinaRecepta==5)
            sb.append("Tezina Recepta = majstorski ").append(tezinaRecepta).append('\n');
        sb.append("Sastojci = ").append(sastojci).append("\n");
        return sb.toString();
    }
}