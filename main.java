import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArbolBST arbol = new ArbolBST();

        int opcion;

        do {

            System.out.println("===========================================");
            System.out.println("  GanaderosCasanare S.A.S. – Inventario BST");
            System.out.println("===========================================");
            System.out.println("  1. Insertar un nuevo animal");
            System.out.println("  2. Modificar datos de un animal existente");
            System.out.println("  3. Consultar datos de un animal (por código)");
            System.out.println("  4. Listar inventario completo (recorrido inorden)");
            System.out.println("  5. Salir");
            System.out.println("-------------------------------------------");
            System.out.print("  Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese código: ");
                    int codigo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Ingrese raza: ");
                    String raza = sc.nextLine();

                    System.out.print("Ingrese peso: ");
                    double peso = sc.nextDouble();

                    System.out.print("Ingrese edad: ");
                    int edad = sc.nextInt();

                    arbol.insertar(
                            codigo,
                            raza,
                            peso,
                            edad
                    );

                    System.out.println(
                            "Animal insertado correctamente."
                    );

                    break;

                case 2:

                    System.out.print(
                            "Ingrese código del animal: "
                    );

                    int codMod = sc.nextInt();

                    System.out.print("Nuevo peso: ");
                    double nuevoPeso = sc.nextDouble();

                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();

                    boolean modificado =
                            arbol.modificar(
                                    codMod,
                                    nuevoPeso,
                                    nuevaEdad
                            );

                    if (modificado) {

                        System.out.println(
                                "Datos modificados correctamente."
                        );

                    } else {

                        System.out.println(
                                "Animal no encontrado."
                        );
                    }

                    break;

                case 3:

                    System.out.print(
                            "Ingrese código a consultar: "
                    );

                    int codBuscar = sc.nextInt();

                    NodoAnimal animal =
                            arbol.buscar(codBuscar);

                    if (animal != null) {

                        System.out.println(
                                "Código: " +
                                animal.getCodigo()
                        );

                        System.out.println(
                                "Raza: " +
                                animal.getRaza()
                        );

                        System.out.println(
                                "Peso: " +
                                animal.getPeso()
                        );

                        System.out.println(
                                "Edad: " +
                                animal.getEdad()
                        );

                    } else {

                        System.out.println(
                                "Animal no encontrado."
                        );
                    }

                    break;

                case 4:

                    System.out.println(
                            "=== INVENTARIO COMPLETO ==="
                    );

                    arbol.recorrerInorden();

                    break;

                case 5:

                    System.out.println(
                            "Programa finalizado."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción inválida."
                    );
            }

        } while (opcion != 5);

        sc.close();
    }
}
