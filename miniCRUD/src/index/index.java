/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package index;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Msi
 */
public class index {
private static ArrayList<String> dnis = new ArrayList<>();
    private static ArrayList<String> nombres = new ArrayList<>();
    private static ArrayList<Integer> edades = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    // Validar que no se repita el DNI
    private static boolean existeDNI(String dni) {
        return dnis.contains(dni);
    }

    // Agregar persona
    public static void agregar() {
        String continuar;
        do {
            System.out.print("Ingrese DNI: ");
            String dni = sc.nextLine();

            if (existeDNI(dni)) {
                System.out.println(">> ERROR: El DNI ya existe.");
            } else {
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese edad: ");
                int edad = Integer.parseInt(sc.nextLine());

                dnis.add(dni);
                nombres.add(nombre);
                edades.add(edad);

                System.out.println(">> Persona agregada con éxito.");
            }

            System.out.print("¿Desea agregar otra persona? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
    }

    // Eliminar persona
    public static void eliminar() {
        String continuar;
        do {
            listar();
            System.out.print("Ingrese número de persona a eliminar: ");
            int pos = Integer.parseInt(sc.nextLine()) - 1;

            if (pos >= 0 && pos < nombres.size()) {
                dnis.remove(pos);
                nombres.remove(pos);
                edades.remove(pos);
                System.out.println(">> Registro eliminado correctamente.");
            } else {
                System.out.println(">> Posición inválida.");
            }

            System.out.print("¿Desea eliminar otra persona? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
    }

    // Editar persona
    public static void editar() {
        String continuar;
        do {
            listar();
            System.out.print("Ingrese número de persona a editar: ");
            int pos = Integer.parseInt(sc.nextLine()) - 1;

            if (pos >= 0 && pos < nombres.size()) {
                System.out.println("DNI actual: " + dnis.get(pos));
                System.out.print("Nuevo DNI: ");
                String nuevoDni = sc.nextLine();

                if (!nuevoDni.equals(dnis.get(pos)) && existeDNI(nuevoDni)) {
                    System.out.println(">> ERROR: El DNI ya existe.");
                } else {
                    dnis.set(pos, nuevoDni);

                    System.out.println("Nombre actual: " + nombres.get(pos));
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();

                    System.out.println("Edad actual: " + edades.get(pos));
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = Integer.parseInt(sc.nextLine());

                    nombres.set(pos, nuevoNombre);
                    edades.set(pos, nuevaEdad);

                    System.out.println(">> Registro actualizado correctamente.");
                }
            } else {
                System.out.println(">> Posición inválida.");
            }

            System.out.print("¿Desea editar otra persona? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
    }

    // Listar con columnas alineadas
    public static void listar() {
        System.out.println("\nListado de Personas");
        System.out.printf("%-5s %-10s %-20s %-5s\n", "Nro", "DNI", "Nombre", "Edad");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("%-5d %-10s %-20s %-5d\n", (i + 1), dnis.get(i), nombres.get(i), edades.get(i));
        }
        System.out.println();
    }

    // Buscar con comodines
    public static void buscar() {
        System.out.print("Ingrese criterio de búsqueda (use * como comodín): ");
        String criterio = sc.nextLine().toLowerCase();

        String regex = criterio.replace("*", ".*"); // convertir comodín en regex

        System.out.println("\nResultados de búsqueda:");
        boolean encontrado = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).toLowerCase().matches(regex)) {
                System.out.printf("%-10s %-20s %-5d\n", dnis.get(i), nombres.get(i), edades.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println(">> No se encontraron coincidencias.");
        }
    }

    // Menú principal
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Editar");
            System.out.println("4. Listar");
            System.out.println("5. Buscar");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> agregar();
                case 2 -> eliminar();
                case 3 -> editar();
                case 4 -> listar();
                case 5 -> buscar();
                case 6 -> System.out.println("Gracias por usar el programa.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    } 
}
