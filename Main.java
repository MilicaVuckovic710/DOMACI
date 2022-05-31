package domaci4;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Sastojak jaje = new Sastojak("jaje", 12);
        Sastojak mleko = new Sastojak("mleko", 0.15);
        Sastojak brasno = new Sastojak("brasno", 0.075);

        SastojakRecepta sr1 = new SastojakRecepta(jaje.getSastojak(), jaje.getCenaPoJedinici(), 10);
        SastojakRecepta sr2 = new SastojakRecepta(brasno.getSastojak(), brasno.getCenaPoJedinici(), 300);
        SastojakRecepta sr3 = new SastojakRecepta(mleko.getSastojak(), mleko.getCenaPoJedinici(), 250);

        ArrayList<SastojakRecepta> sastojci1 = new ArrayList<SastojakRecepta>();
        sastojci1.add(0, sr1);
        sastojci1.add(1, sr2);
        sastojci1.add(2, sr3);

        Recept r1 = new Recept("Palacinke", 1,sastojci1);

        System.out.println(jaje);
        System.out.println(sr1);
        System.out.println("------------------------------");
        System.out.println(sr2);
        System.out.println("------------------------------");
        System.out.println(sr3);
        System.out.println("------------------------------");
        System.out.println(r1);
        System.out.println("------------------------------");
        System.out.println(r1);
    }
}
