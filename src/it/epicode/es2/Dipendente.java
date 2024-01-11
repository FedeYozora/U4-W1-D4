package it.epicode.es2;

public abstract class Dipendente {
    protected String nome;
    protected String cognome;
    protected int id;
    protected double stipendio;

    public Dipendente(String nome, String cognome, int id, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
        this.stipendio = stipendio;
    }
    public double calcolaStipendio(int oreStraordinario) {
        return stipendio + (oreStraordinario * 10);
    }

    public String toString() {
        return "Dipendente " + cognome + " " + nome + ", ID " + id + ", stipendio " + stipendio;
    }
}