import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int[][] matriz = null; // Declarar la matriz fuera del loop
        while (!salir) {
            System.out.println("1. Crear matriz MxN");
            System.out.println("2. Validar filas y columnas");
            System.out.println("3. Llenar matriz");
            System.out.println("4. Mostrar fila");
            System.out.println("5. Matriz CERO");
            System.out.println("6. Salir");
            try {

                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa el numero de filas: ");
                        int filas = sn.nextInt();
                        System.out.println("Ingresa el numero de columnas");
                        int columnas = sn.nextInt();
                        matriz = CrearMatriz(filas, columnas); // Actualizar la matriz creada
                        break;
                    case 2:
                        System.out.println("Opcion 2");
                        break;
                    case 3:
                        System.out.println("Opcion 3");
                        break;
                    case 4:
                        System.out.println("Opcion 4");
                        break;
                    case 5:
                        System.out.println("Opcion 5");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Las opciones son entre el 1 y 6");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero");
                sn.next(); // Limpiar el buffer del scanner
            }
        }
        System.out.println("Fin del menu");
    }
    public static int[][] CrearMatriz(int filas, int columnas) {
        int[][] x = new int[filas][columnas];
        return x;
    }//a
}
