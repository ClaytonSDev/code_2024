import Animais.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Amora", "Creme", 25, 5.5, 5);

        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Juju", "Preta e Branca", 25, 5.5, 5);

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());


//
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
//
//        System.out.println("-----------------");
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());


    }












//        Cachorro cachorro1 = new Cachorro();
//        Cachorro cachorro2 = new Cachorro("Amora", "Creme", 25, 5.5, 5 );
//
//        System.out.println(cachorro2.getNome());
//        System.out.println(cachorro2.getPeso());
//
//        cachorro1.setNome("Amora");
//        cachorro1.setCor("Creme");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);
//
//
//       //cachorro1.latir();
//        //System.out.println("O cachorro pegou uma " + cachorro1.pegar());
//
//        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
//        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
//        System.out.println("O cachorro está " + cachorro1.interagir("nada!"));
//    }


}