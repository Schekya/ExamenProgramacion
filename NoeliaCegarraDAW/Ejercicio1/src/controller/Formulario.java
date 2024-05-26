package controller;

import utils.LongitudDNINoValidaException;
import utils.UltimoDigitoNoLetraException;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        String nombre = null;
        String apellidos = null;
        String dni = null;

        do {
            System.out.println("1. Rellenar nombre.");
            System.out.println("2. Rellenar apellidos.");
            System.out.println("3. Rellenar DNI.");
            System.out.println("4. Finalizar.");
            System.out.printf("Opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Nombre: ");
                    nombre = input.next();
                    break;

                case 2:
                    System.out.printf("Apellido: ");
                    apellidos = input.next();
                    break;
                case 3:
                    System.out.printf("DNI: ");
                    dni = input.next();
                    try {
                        validarDni(dni);
                        break;
                    } catch (LongitudDNINoValidaException e) {
                        System.out.println("La longitud del DNI no es correcta");
                    } catch (UltimoDigitoNoLetraException e) {
                        System.out.println("El DNI no es válido");
                    }
                    dni = null; //En caso de que se introduzca un dni erróneo, que no permita salir del formulario.
                    break;
            }





        } while (opcion != 4 || !validarFormulario(nombre, apellidos, dni));
        System.out.println("Datos introducidos:");
        System.out.println("Nombre :" + nombre);
        System.out.println("Apellidos :" + apellidos);
        System.out.println("DNI: " + dni);
    }

    public static boolean validarFormulario(String nombre, String apellidos, String dni) {
        if (nombre == null || apellidos == null || dni == null) {
            System.out.println("Debe rellenar todos los campos del formulario");
            return false;
        } return true;
    }

    public static boolean validarDni(String dni) throws LongitudDNINoValidaException, UltimoDigitoNoLetraException {
        if (dni.length() != 9) {
            throw new LongitudDNINoValidaException();
        }
        if (!Character.isLetter(dni.charAt(dni.length()-1))) {
            throw new UltimoDigitoNoLetraException();
        } return true;
    }
}
