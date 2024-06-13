package Animais;

public class Passaro extends Animal{

    static int numeroDePassaros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDoEspirito;

    public Passaro(String nome, String cor, int altura, double peso, String estadoDoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDoEspirito = estadoDoEspirito;

        numeroDePassaros ++;
    }

    void comer(){}

    void dormir(){}

    void soar(){
        System.out.println("PIU PIU!!");
    }
}
