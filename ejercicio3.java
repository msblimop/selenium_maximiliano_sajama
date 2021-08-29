import java.util.Scanner;

public class ejercicio3 {
    static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Ejercicio 1
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("El doble es: " + calcularDoble(num));

    }

    public static int calcularDoble(int num){
        return num * 2;
    }
}
