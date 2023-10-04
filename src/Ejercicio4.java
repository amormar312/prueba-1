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
        medio = a==mayor? b==menor? c : b : b==mayor? a==menor? c : a : a==menor? b==menor? c : b : a;

        System.out.println("valor maximo: " + mayor + " valor minimo: " + menor + " valor intermedio: " + medio);
    }
}
