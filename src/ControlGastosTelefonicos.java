import java.util.Scanner;

public class ControlGastosTelefonicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE CONTROL DE GASTOS TELEFÓNICOS ===");
            System.out.println("1. Crear una cabina telefónica");
            System.out.println("2. Registrar una llamada en una cabina");
            System.out.println("3. Mostrar información de una cabina");
            System.out.println("4. Mostrar consolidado general");
            System.out.println("5. Reiniciar una cabina");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el ID de la nueva cabina: ");

                    int idCabina = scanner.nextInt();
                    empresa.agregarCabina(idCabina);
                    System.out.println("Cabina creada exitosamente.");
                }

                case 2 -> {
                    System.out.print("Ingrese el ID de la cabina: ");
                    int idLlamada = scanner.nextInt();
                    scanner.nextLine();

                    CabinaTelefonica cabina = empresa.obtenerCabina(idLlamada);
                    if (cabina != null) {
                        System.out.print("Ingrese el tipo de llamada (local, larga distancia, celular): ");
                        String tipoLlamada = scanner.nextLine().toLowerCase();
                        cabina.registrarLlamadaPorTipo(tipoLlamada);
                    } else {
                        System.out.println("Cabina no encontrada.");
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese el ID de la cabina: ");

                    int idInfo = scanner.nextInt();
                    CabinaTelefonica cabinaInfo = empresa.obtenerCabina(idInfo);
                    if (cabinaInfo != null) {
                        cabinaInfo.obtenerInfo();
                    } else {
                        System.out.println("Cabina no encontrada.");
                    }
                }

                case 4 -> {
                    empresa.obtenerConsolidado();
                }


                case 5 -> {
                    System.out.print("Ingrese el ID de la cabina a reiniciar: ");

                    int idReiniciar = scanner.nextInt();
                    CabinaTelefonica cabinaReiniciar = empresa.obtenerCabina(idReiniciar);
                    if (cabinaReiniciar != null) {
                        cabinaReiniciar.reiniciar();
                    } else {
                        System.out.println("Cabina no encontrada.");
                    }
                }

                case 6 -> {
                    System.out.println("Saliendo del sistema...");

                }

                default -> {
                    System.out.println("Opción no válida, intente de nuevo.");
                }
            }
        } while (opcion != 6);

        scanner.close();
    }
}
