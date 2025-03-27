import java.util.InputMismatchException;
import java.util.Scanner;

public class PistolasImperio {
    private static final int MAX_PISTOLAS = 100;
    private static String[][] pistolas = new String[MAX_PISTOLAS][2]; // [ID, NombreSoldado]
    private static int totalPistolas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            menu();
            opcion = obtenerOpcion(scanner);
            ejecutarOpcion(opcion);
        } while (opcion != 5);

        scanner.close();
        System.out.println("Terminado ");
    }

    /**
     * Ejecuta el menú principal del programa y gestiona la interacción con el usuario.
     */
    public static void menu() {
        // TODO: Implementar el código para gestionar la interacción con el usuario.
        mostrarOpciones();
    }

    /**
     * Muestra el menú principal con las opciones disponibles.
     */
    private static void mostrarOpciones() {
        // TODO: Implementar el código para mostrar las opciones del menú en pantalla.
        System.out.println("\n MENU ");
        System.out.println("Bienvenido al arsenal imperial ");
        System.out.println("1. Agregar pistolas al armamento ");
        System.out.println("2. Eliminar pistolas extraviadas del armamento ");
        System.out.println("3. Mostrar pistolas del armamento ");
        System.out.println("4. Buscar pistolas del arsenal ");
        System.out.println("5. Salir ");
        System.out.print("Seleccione una opción: ");

    }

    /**
     * Obtiene y valida la opción ingresada por el usuario.
     * @return La opción seleccionada.
     */
    private static int obtenerOpcion(Scanner scanner) {
        // TODO: Implementar la lectura y validación de la opción ingresada.
        int opcion = 0;
        boolean valido = false;

        while (!valido) {
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
                    valido = true;
                } else {
                    System.out.println("Opción inválida ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, Debe ingresar un número válido ");
                scanner.nextLine();
            }
        }
        return opcion;
    }

    /**
     * Ejecuta la acción correspondiente según la opción seleccionada.
     * @param opcion Opción ingresada por el usuario.
     */
    private static void ejecutarOpcion(int opcion) {
        // TODO: Implementar la lógica para ejecutar la opción seleccionada.
        System.out.println("hola");
    }

    /**
     * Agrega una nueva pistola al inventario, registrando su ID y el nombre del soldado.
     */
    private static void agregarPistola() {
        // TODO: Implementar la lógica para agregar una pistola al inventario.
    }

    /**
     * Elimina una pistola del inventario según su ID.
     */
    private static void eliminarPistola() {
        // TODO: Implementar la lógica para eliminar una pistola del inventario.
    }

    /**
     * Reorganiza el inventario después de eliminar una pistola, evitando espacios vacíos.
     * @param indice Índice de la pistola eliminada.
     */
    private static void reordenarInventario(int indice) {
        // TODO: Implementar la lógica para reorganizar el inventario después de una eliminación.
    }

    /**
     * Muestra en pantalla todas las pistolas registradas en el inventario.
     */
    private static void listarPistolas() {
        // TODO: Implementar la lógica para listar todas las pistolas registradas.
    }
}

