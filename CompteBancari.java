package main;

/**
 * Classe que representa un Compte Bancari de la vida real.
 * Aquesta classe permet gestionar els ingressos i retirades de diners d'un compte.
 *
 * @author Usman
 * @version 1.0
 */
public class CompteBancari {
    /**
     * Número de compte bancari.
     */
    private String numCompte;

    /**
     * Saldo actual del compte.
     */
    private double saldo;

    /**
     * Nom del titular del compte.
     */
    private String titular;

    /**
     * Constructor per defecte. Inicialitza el compte amb valors per defecte.
     */
    public CompteBancari() {
        this.numCompte = "";
        this.titular = "";
        this.saldo = 0.0;
    }

    /**
     * Constructor amb paràmetres per inicialitzar el compte amb un número de compte i un titular.
     * El saldo inicialitza a 0.0.
     *
     * @param numCompte Número del compte bancari.
     * @param titular Nom del titular del compte.
     */
    public CompteBancari(String numCompte, String titular) {
        this.numCompte = numCompte;
        this.titular = titular;
        this.saldo = 0.0;
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

    /**
     * Mètode per obtenir el saldo actual del compte.
     *
     * @return El saldo actual.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Mètode per obtenir el número de compte bancari.
     *
     * @return El número de compte.
     */
    public String getNumCompte() {
        return this.numCompte;
    }

    /**
     * Mètode per obtenir el nom del titular del compte.
     *
     * @return El nom del titular.
     */
    public String getTitular() {
        return this.titular;
    }
}
