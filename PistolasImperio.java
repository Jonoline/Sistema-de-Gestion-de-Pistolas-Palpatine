import java.util.InputMismatchException;
import java.util.Scanner;

public class PistolasImperio {
    private static final int MAX_PISTOLAS = 100;
    private static String[][] pistolas = new String[MAX_PISTOLAS][2]; // [ID, NombreSoldado]
    private static int totalPistolas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

        scanner.close();
        System.out.println("Terminado ");
    }

    /**
     * Ejecuta el menú principal del programa y gestiona la interacción con el usuario.
     */
    public static void menu() {
        // TODO: Implementar el código para gestionar la interacción con el usuario.
        mostrarOpciones();
        int opcion = obtenerOpcion(scanner);
        ejecutarOpcion(opcion);
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
              while (opcion != 5) {
                switch (opcion) {
                    case 1:
                        agregarPistola();
                        break;
                    case 2:
                        System.out.println("b");
                        break;
                    case 3:
                        System.out.println("c");
                        break;
                    case 4:
                        listarPistolas();
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                menu();
                opcion = obtenerOpcion(scanner);
            }
            System.out.println("Saliendo del programa...");
        }

    /**
     * Agrega una nueva pistola al inventario, registrando su ID y el nombre del soldado.
     */
    private static void agregarPistola() {
        // TODO: Implementar la lógica para agregar una pistola al inventario.
        System.out.println("Ingrese el ID de su pistola" );
        String IDPISTOLA = scanner.nextLine();
        System.out.println("Ingrese el nombre del soldado ");
        String nombre = scanner.nextLine();

        pistolas[totalPistolas][0]= IDPISTOLA;
        pistolas[totalPistolas][1]= nombre;
        totalPistolas++;
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
        for (int i = 0; i < totalPistolas; i++) { // Recorre filas
            for (int j = 0; j < pistolas[i].length; j++) { // Recorre columnas
                System.out.print(pistolas[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }
        }
    }




