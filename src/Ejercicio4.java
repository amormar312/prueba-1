import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");
        int a, b, c, mayor, menor, medio;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        mayor = a>b? Math.max(a,c) : Math.max(b, c);
        menor = a<b? Math.min(a,c) : Math.min(b, c);

    }
}
