package main;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Classe que representa un Compte Bancari genèric.
 *
 * @author Usman
 * @version 1.1
 */
public abstract class CompteBancari {
    protected String numCompte;
    protected Date dataObertura;
    protected double saldo;
    protected double tipusInteres;
    protected List<Client> clients;

    public CompteBancari(String numCompte, double saldoInicial, double tipusInteres) {
        this.numCompte = numCompte;
        this.saldo = saldoInicial;
        this.tipusInteres = tipusInteres;
        this.dataObertura = new Date();
        this.clients = new ArrayList<>();
    }

    public void afegirClient(Client client) {
        this.clients.add(client);
    }

    /**
     * Mètode per ingressar una quantitat de diners al compte.
     * Si la quantitat és positiva, s'afegeix al saldo.
     *
     * @param quantitat Quantitat de diners a ingressar.
     */
    public void ingressar(double quantitat) {
        if (quantitat > 0) {
            this.saldo += quantitat;
        }
    }

    /**
     * Mètode per retirar una quantitat de diners del compte.
     * Si la quantitat és positiva i hi ha prou saldo, es resta del saldo actual.
     *
     * @param quantitat Quantitat de diners a retirar.
     */
    public void retirar(double quantitat) {
        if (quantitat > 0 && this.saldo >= quantitat) {
            this.saldo -= quantitat;
        }
    }

    public double getSaldo() { return this.saldo; }
    public String getNumCompte() { return this.numCompte; }
}
