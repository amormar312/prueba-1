import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int np, na, pp;
        System.out.print("¿Cuantas pizzas han pedido?: ");
        np=sc.nextInt();
        System.out.print("¿Cuantos amigos son?: ");
        na=sc.nextInt();
        System.out.print("¿Cuantas porciones hacen?: ");
        pp=sc.nextInt();

        System.out.println(np*pp/na);
        System.out.println(np*pp%na);
    }
}
