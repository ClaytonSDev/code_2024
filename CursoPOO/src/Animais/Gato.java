package Animais;

public class Gato extends Animal{

    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDoEspirito;

    public Gato(String nome, String cor, int altura, double peso, String estadoDoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDoEspirito = estadoDoEspirito;

        numeroDeGatos ++;
    }

    void comer(){}

    void dormir(){}

    void soar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
