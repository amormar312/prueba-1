import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la temperatura:");
        float temp=sc.nextFloat();
        System.out.print("Escribe si quieres pasarlo a grados fahrenheit o kelvin:");
        sc.nextLine();
        char a = sc.nextLine().toUpperCase().charAt(0);
        System.out.println(a=='K'? temp+273.15 : temp*9/5+32);
    }
}
