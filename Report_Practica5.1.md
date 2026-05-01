# Informe de la Pràctica 5.1: Disseny Orientat a Objectes

Aquest document recull els resultats de l'activitat per poder-ho exportar a PDF (a VS Code, pots utilitzar una extensió com "Markdown PDF" o imprimir-ho a PDF directament).

## 1. Diagrama de Classes UML (Apartat 3.1 i 3.2)
S'ha creat l'arxiu `CompteBancari.drawio` que pots obrir amb l'extensió de **Draw.io** per a VS Code. 
Conté els següents elements seguint l'enunciat:

- **Atributs:**
  - `- numCompte: String`
  - `- saldo: double`
  - `- titular: String`
- **Mètodes:**
  - `+ CompteBancari()`
  - `+ CompteBancari(numCompte: String, titular: String)`
  - `+ ingressar(quantitat: double): void`
  - `+ retirar(quantitat: double): void`
  - `+ getSaldo(): double`
  - `+ getNumCompte(): String`
  - `+ getTitular(): String`

## 2. Implementació de la Classe CompteBancari (Apartat 3.3)
El codi de la classe, amb encapsulament i tots els mètodes demanats:

```java
package main;

/**
 * Classe que representa un Compte Bancari de la vida real.
 * Aquesta classe permet gestionar els ingressos i retirades de diners d'un compte.
 *
 * @author Usman
 * @version 1.0
 */
public class CompteBancari {
    private String numCompte;
    private double saldo;
    private String titular;

    public CompteBancari() {
        this.numCompte = "";
        this.titular = "";
        this.saldo = 0.0;
    }

    public CompteBancari(String numCompte, String titular) {
        this.numCompte = numCompte;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void ingressar(double quantitat) {
        if (quantitat > 0) {
            this.saldo += quantitat;
        }
    }

    public void retirar(double quantitat) {
        if (quantitat > 0 && this.saldo >= quantitat) {
            this.saldo -= quantitat;
        }
    }

    public double getSaldo() { return this.saldo; }
    public String getNumCompte() { return this.numCompte; }
    public String getTitular() { return this.titular; }
}
```

## 3. Classe Main de Proves

```java
package main;

public class Main {
    public static void main(String[] args) {
        CompteBancari compte1 = new CompteBancari("ES987654321", "Usman");
        compte1.ingressar(200.50);
        compte1.retirar(50.50);
    }
}
```

## 4. Documentació Javadoc (Apartat 3.4 i 3.5)
S'ha generat automàticament la documentació utilitzant l'eina de Javadoc de Java i es troba a la carpeta `docs`.
S'han utilitzat correctament les etiquetes `@param`, `@return`, `@author` i `@version` per documentar tota la capçalera de la classe i dels seus respectius mètodes com exigeix l'enunciat.

Pots obrir l'arxiu `docs/index.html` per navegar a través de tota la documentació generada de la teva pràctica.
