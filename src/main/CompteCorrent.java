package main;

import java.util.ArrayList;
import java.util.List;

public class CompteCorrent extends CompteBancari {
    private List<TargetaCredit> targetes;
    private List<FonsInversio> fonsInversio;
    private List<CarteraValors> carteresValors;

    public CompteCorrent(String numCompte, double saldoInicial, double tipusInteres) {
        super(numCompte, saldoInicial, tipusInteres);
        this.targetes = new ArrayList<>();
        this.fonsInversio = new ArrayList<>();
        this.carteresValors = new ArrayList<>();
    }

    public void afegirTargeta(TargetaCredit targeta) {
        this.targetes.add(targeta);
    }
}
