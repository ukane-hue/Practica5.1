package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciant Proves de CompteBancari ---");
        
        // Utilitzant constructor buit
        CompteBancari compte0 = new CompteBancari();
        System.out.println("\n[Prova Constructor per defecte]");
        System.out.println("Titular: '" + compte0.getTitular() + "' | NumCompte: '" + compte0.getNumCompte() + "' | Saldo: " + compte0.getSaldo() + "€");
        
        // Utilitzant constructor amb paràmetres
        CompteBancari compte1 = new CompteBancari("ES987654321", "Usman");
        System.out.println("\n[Prova Constructor amb paràmetres]");
        System.out.println("Titular: " + compte1.getTitular() + " | NumCompte: " + compte1.getNumCompte());
        System.out.println("Saldo inicial: " + compte1.getSaldo() + "€");
        
        // Ingressar
        System.out.println("\n[Prova Ingressar]");
        compte1.ingressar(200.50);
        System.out.println("S'han ingressat 200.50€. Nou saldo: " + compte1.getSaldo() + "€");
        
        compte1.ingressar(-50.0); // No hauria de fer res
        System.out.println("S'ha intentat ingressar -50.0€ (invàlid). Nou saldo: " + compte1.getSaldo() + "€");
        
        // Retirar
        System.out.println("\n[Prova Retirar]");
        compte1.retirar(50.50);
        System.out.println("S'han retirat 50.50€. Nou saldo: " + compte1.getSaldo() + "€");
        
        // Intent de retirar sense saldo
        System.out.println("\n[Prova Retirar sense saldo suficient]");
        compte1.retirar(500.0);
        System.out.println("S'ha intentat retirar 500.0€. Nou saldo: " + compte1.getSaldo() + "€");

        System.out.println("\n--- Finalització de les Proves ---");
    }
}
