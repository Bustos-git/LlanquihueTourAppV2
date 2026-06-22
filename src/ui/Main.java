package ui;

import model.Tour;
import data.GestorDatos;
import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> listaTour = gestor.leerTours("resources/tours.txt");




        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. Buscar por nombre");
        System.out.println("\n2. Buscar por precio");
        System.out.println("\n3. Buscar por tipo");
        System.out.println("\n4. Mostrar todos los Tours");

        int opcion = sc.nextInt();
        sc.nextLine();

       switch (opcion) {

           case 1:
                System.out.println("Nombre: ");
                String nombre = sc.nextLine();

                for (Tour t : listaTour) {
                    if (t.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(t);
                    }
                }

                break;

            case 2:
                System.out.println("Precio minimo: ");
                int precio = sc.nextInt();

                for (Tour t : listaTour) {
                    if (t.getPrecio() >= precio) {
                        System.out.println(t);
                    }
                }
                break;

            case 3:
                System.out.println("Tipo: "); //Ruta Gastronomica, Paseo Lacustre, Excursion cultural, Personalizado
                String tipo = sc.nextLine();

                for (Tour t : listaTour) {
                    if (t.getTipo().getTipo().equalsIgnoreCase(tipo)) {
                        System.out.println(t);
                    }
                }
                break;

           case 4:
               for (Tour t : listaTour) {
                   System.out.println(t);
               }
               break;

        }













    }
}