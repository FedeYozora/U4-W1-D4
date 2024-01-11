package it.epicode.es1;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1, Dipendente.Dipartimento.PRODUZIONE);
        dipendente1.stampaDatiDipendente();
        dipendente1.promuovi();
        System.out.println("Nuovo livello: " + dipendente1.getLivello());
        System.out.println();
        Dipendente dipendente2 = new Dipendente(2, 1500, 50, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.VENDITE);
        dipendente2.stampaDatiDipendente();
        dipendente2.promuovi();
        System.out.println("Nuovo livello: " + dipendente2.getLivello());
        System.out.println();
        double pagaMensile1 = Dipendente.calcolaPaga(dipendente1);
        System.out.println("Paga mensile dipendente 1: " + pagaMensile1);

        double pagaMensile2 = Dipendente.calcolaPaga(dipendente2, 10);
        System.out.println("Paga mensile dipendente 2 con 10 ore di straordinario: " + pagaMensile2);
    }
}