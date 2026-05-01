package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciant Proves de Gestió Bancària ---");
        
        Client client1 = new Client();
        client1.nom = "Usman";
        client1.dni = "12345678X";

        CompteCorrent compteCorrent = new CompteCorrent("ES987654321", 0.0, 1.5);
        compteCorrent.afegirClient(client1);

        System.out.println("\n[Prova Compte Corrent]");
        System.out.println("NumCompte: " + compteCorrent.getNumCompte());
        System.out.println("Saldo inicial: " + compteCorrent.getSaldo() + "€");
        
        compteCorrent.ingressar(200.50);
        System.out.println("S'han ingressat 200.50€. Nou saldo: " + compteCorrent.getSaldo() + "€");
        
        compteCorrent.retirar(50.50);
        System.out.println("S'han retirat 50.50€. Nou saldo: " + compteCorrent.getSaldo() + "€");
        
        System.out.println("\n--- Finalització de les Proves ---");
    }
}
