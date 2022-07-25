package one.digital.Basecamp;

public class Quadrilatero {

    public static void area(double lado){

        System.out.println("Área do Quadrado: " + lado + lado);

    }
    public static <lado2> void area(double lado1 , double lado2){


        System.out.println("Área do Retângulo: " +  lado1 + lado2);
    }
    public static void area(double baseMaior, double baseMenor, double Altura){
        System.out.println("Área do trapesio: " + ((baseMaior+baseMenor)*Altura)/2);
    }
}
