import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 3 numero");
        double a, b, c, rb, rc;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        rb=Math.pow((2+a*b)/4,(c+2));
        rc= (-b +Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        System.out.println(a*b+c*((3-a)/2*b) + " Resultado a");
        System.out.println(rb + " Resultado b");
        System.out.println(rc + " Resultado c");
    }
}
