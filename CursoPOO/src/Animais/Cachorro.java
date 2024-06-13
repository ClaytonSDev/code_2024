package Animais;

public class Cachorro extends Animal {

    //atributos
    static int numeroDeCachorros;

    private String nome;

    private String cor;

    private int altura;

    private double peso;

    private int tamanhoDoRabo;

    private String estadoDoEspirito;

    // construtores
    public Cachorro(){}

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDoEspirito = estadoDoEspirito;

        numeroDeCachorros ++;
    }

    //encapsulamento abaixo
    //metodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDoEspirito() {
        return estadoDoEspirito;
    }

    public void comer(){}

    public void soar(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        switch (acao){
            case "carinho": this.estadoDoEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDoEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDoEspirito = "triste"; break;
            default: this.estadoDoEspirito = "neutro"; break;
        }
        return this.estadoDoEspirito;

//        if (acao.equals("carinho")) {
//            this.estadoDoEspirito = "feliz";
//        }else if (acao.equals("Vai Dormir!")){
//            this.estadoDoEspirito = "Bravo";
//        }else if (acao.equals("Pisar na patinha")){
//            this.estadoDoEspirito = "Triste";
//        }else{
//            this.estadoDoEspirito = "Neutro";
//        }
//        return estadoDoEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
