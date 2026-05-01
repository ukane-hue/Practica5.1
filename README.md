# Pràctica 5.1: Disseny Orientat a Objectes - Compte Bancari

## Què fa el projecte
Aquest projecte és una pràctica de Disseny Orientat a Objectes amb Java. L'objectiu és modelitzar una entitat de la vida real, en aquest cas un **Compte Bancari**, respectant els principis de l'encapsulament i la visibilitat. L'aplicació permet:
- Crear comptes bancaris amb el nom del titular i el número de compte.
- Realitzar ingressos de diners al saldo del compte.
- Retirar diners (si hi ha prou saldo).
- Consultar l'estat actual del compte (saldo, titular, número).

El codi està estructurat amb la seva respectiva classe de domini (`CompteBancari`) i una classe per executar les proves (`Main`).

## Com instal·lar-lo
No requereix cap instal·lació complexa, simplement cal tenir instal·lat el **Java Development Kit (JDK)** a la màquina.
1. Clona el repositori:
   ```bash
   git clone https://github.com/ukane-hue/Practica5.1.git
   ```
2. Accedeix a la carpeta del projecte:
   ```bash
   cd Practica5.1
   ```

## Com executar-lo
Per compilar i executar el programa, navega fins al directori on hi ha el codi font i utilitza el compilador de Java (`javac`):
```bash
cd src
javac main/CompteBancari.java main/Main.java
java main.Main
```

## Exemples d'ús
En executar la classe principal s'obté la següent interacció automàtica per consola comprovant la lògica de l'aplicació:

```text
--- Iniciant Proves de CompteBancari ---

[Prova Constructor per defecte]
Titular: '' | NumCompte: '' | Saldo: 0.0€

[Prova Constructor amb paràmetres]
Titular: Usman | NumCompte: ES987654321
Saldo inicial: 0.0€

[Prova Ingressar]
S'han ingressat 200.50€. Nou saldo: 200.50€
S'ha intentat ingressar -50.0€ (invàlid). Nou saldo: 200.50€

[Prova Retirar]
S'han retirat 50.50€. Nou saldo: 150.0€

[Prova Retirar sense saldo suficient]
S'ha intentat retirar 500.0€. Nou saldo: 150.0€

--- Finalització de les Proves ---
```

## Dependències
El projecte no utilitza cap llibreria externa, únicament fa ús de Java Core Standard Library (`java.lang`).

## Autor
Desenvolupat per **Usman**.