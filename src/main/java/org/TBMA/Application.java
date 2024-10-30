package org.TBMA;

import java.util.Scanner;

public class Application {
    public static void application() {
        Book[] repoBooks1 = {new Book("A123", "Effective Java", "Joshua Bloch")};
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"1.Ver todos los libros ", "2. Añadir libro", "3. Eliminar libro", "4. Cambiar repositorio", "5. Salir"};


        byte option = 0;

        while (option != 5) {
            for (String item : menu) {
                System.out.println(item);
            }
            System.out.println("\nSeleccione una opción:");

            String input = scanner.nextLine();

            try {
                option = Byte.parseByte(input);
            } catch (Exception ex) {
                System.out.println("Esto no es un número");
                continue;
            }

            if (option < 1 || option > 5) {
                System.out.println("Número fuera de rango");
                continue;
            }

            System.out.println("\nHa elegido: " + menu[option - 1]);
            if (option == 1) {
                Book.printList(repoBooks1);
            }
        }

    }
}