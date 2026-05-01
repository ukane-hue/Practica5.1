package main;

public class CompteTermini extends CompteBancari {
    private int mesosOberta;

    public CompteTermini(String numCompte, double saldoInicial, double tipusInteres, int mesosOberta) {
        super(numCompte, saldoInicial, tipusInteres);
        this.mesosOberta = mesosOberta;
    }

    public int getMesosOberta() {
        return this.mesosOberta;
    }
}
