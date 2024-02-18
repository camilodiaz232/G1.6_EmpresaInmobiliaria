import java.util.Scanner;

public class Main {

    public static void main (String []args){
        //Creacion de variables
        double distanciaA = 0;
        double distanciaB = 0;
        double distanciaC = 0;

        //Creacion objeto de lectura de los valores
        Scanner lectura = new Scanner(System.in);

        //Captura de los valores de la distancia A
        System.out.println("Ingrese la distancia a: ");
        distanciaA = Double.parseDouble(lectura.next());

        //Captura de los valores de la distancia B
        System.out.println("Ingrese la disancia b: ");
        distanciaB = Double.parseDouble(lectura.next());

        //Captura de los valores de la distancia C
        System.out.println("Ingrese la distancia c: ");
        distanciaC = Double.parseDouble(lectura.next());

        //Presentar los resultados
        System.out.println("El perimetro del terreno es: "+calcularPerimetro(distanciaA, distanciaB, distanciaC));
        System.out.println("El area del terreno es: "+calcularAreaTerreno(distanciaA, distanciaB, distanciaC));



    }

    // Funcion para calcular area del rectangulo
    public static double calcularAreaRectangulo (double b, double c){
        return b*c;
    }

    //Funcion para calcular hipotenisa
    public static double calcularHipotenusa (double a, double b, double c){
        return Math.sqrt((Math.pow(a-c,2))+(Math.pow(b,2)));
    }

    //funcion para calcular area del triangulo
    public static double calcularAreaTriangulo (double a, double b, double c ){
        return ((a-c)*b)/2;
    }

    //funcion para calcular el perimetro del terreno
    public static double calcularPerimetro (double a, double b, double c){
        return a+b+c+calcularHipotenusa(a,b,c);
    }

    //Funcion para calcular el area del terreno
    public static double calcularAreaTerreno (double a, double b, double c){
        return calcularAreaRectangulo(b,c)+calcularAreaTriangulo(a,b,c);
    }


}
