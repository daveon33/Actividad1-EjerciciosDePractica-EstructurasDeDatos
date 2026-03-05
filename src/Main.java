import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Se definen los 3 arreglos con 7 espacios cada uno
        int[] primerArreglo = new int[7];
        int[] segundoArreglo = new int[7];
        int[] tercerArreglo = new int[7];

        // Se define scanner para tomar datos por consola
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor ingrese uno por uno los 7 valores del primer arreglo, " +
                "solo números serán válidos: ");
        for(int i = 0; i < 7; i++) {
            System.out.println("Dígito " + (i + 1) + ": ");
            primerArreglo[i] = scanner.nextInt();
        }





    }
}
