import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Programador programador1 = new Programador();

        /* Input */
        System.out.println("Escriba el nombre del programador :");
        String lineaNombre = sc.nextLine(); // Todo: revisar lectura de ints como chars.
        programador1.nombre = lineaNombre;

        System.out.println("¿En qué lenguaje programa? :");
        programador1.lenguaje = sc.nextLine();

        /* Output */
        System.out.println(programador1);
    }
}