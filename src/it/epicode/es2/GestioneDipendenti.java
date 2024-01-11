package it.epicode.es2;

public class GestioneDipendenti {
    public static Impiegato promuoviOperaio(Operaio operaio) {
        return new Impiegato(operaio.nome, operaio.cognome, operaio.id, 1500);
    }

    public static Quadro promuoviImpiegato(Impiegato impiegato) {
        return new Quadro(impiegato.nome, impiegato.cognome, impiegato.id, 2000);
    }

    public static void main(String[] args) {
        Operaio op1 = new Operaio("Mario", "Rossi", 1, 1200);
        Operaio op2 = new Operaio("Giuseppe", "Verdi", 2, 1200);
        Impiegato imp1 = new Impiegato("Giovanni", "Bianchi", 3, 1500);
        Dirigente dir1 = new Dirigente("Luca", "Neri", 4, 2500);

        System.out.println("Stipendio degli impiegati:");
        System.out.println(op1.toString());
        System.out.println(op2.toString());
        System.out.println(imp1.toString());
        System.out.println(dir1.toString());
        System.out.println();

        System.out.println("Update Stipendi post promozione:");

        // Promozione di un operaio a impiegato
        Impiegato nuovoImpiegato = promuoviOperaio(op1);
        System.out.println(nuovoImpiegato.toString());

        System.out.println(op2.toString());

        // Promozione di un impiegato a quadro
        Quadro nuovoQuadro = promuoviImpiegato(imp1);
        System.out.println(nuovoQuadro.toString());

        System.out.println(dir1.toString());
        System.out.println();
        double sommaStipendi = nuovoImpiegato.calcolaStipendio(5) + op2.calcolaStipendio(5) + nuovoQuadro.calcolaStipendio(5) + dir1.calcolaStipendio(5);
        System.out.println("Somma stipendi post promozione e con 5 ore di straordinario pagate 10 euro l'una: " + sommaStipendi);
    }
}