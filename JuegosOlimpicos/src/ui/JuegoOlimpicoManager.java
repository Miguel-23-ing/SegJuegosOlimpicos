package ui;

import model.JuegoOlimpicoController;
import model.Pais;

import java.util.Collections;
import java.util.Scanner;

public class JuegoOlimpicoManager {

    public static Scanner sc = new Scanner(System.in);
    public static JuegoOlimpicoController joc = new JuegoOlimpicoController();

    public static void main(String[] args) {
        JuegoOlimpicoManager jom = new JuegoOlimpicoManager();
        jom.menu();
    }
    public void menu(){
        System.out.println("\nBienvenido al sistema de los Juegos Olimpicos Paris 2024");
        boolean exit = false;

        while(!exit){

            System.out.println("""
                
                Ingrese el número de acuerdo a la opcion que desea elegir
                1. Ingresar un país
                2. Mostrar medallería
                3. Mostrar total de medallas
                4. Mostrar países
                5. Salir
                Selection: \s""");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    registerCountry();
                    break;

                case 2:
                    System.out.println(joc.medalTable());
                    break;

                case 3:
                    System.out.println(joc.totalMedalTable());
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema de los Juegos Olimpicos Paris 2024");
                    exit = true;
                    break;

                default:
                    exit = true;
                    break;
            }

        }

    }
    private void registerCountry() {
        sc.nextLine();
        System.out.println("Escriba el pais, su respectivo tipo de medalla y cantidad con el formato: Nombre::Medalla::Cantidad");
        System.out.println("Ejemplo: Colombia::oro::3");
        String input = sc.nextLine();
        joc.registerCountry(input);
        System.out.println("País registrado");
    }



}