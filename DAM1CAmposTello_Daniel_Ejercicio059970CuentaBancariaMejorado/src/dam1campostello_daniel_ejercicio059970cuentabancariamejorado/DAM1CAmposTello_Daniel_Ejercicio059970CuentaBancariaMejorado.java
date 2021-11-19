/*
 Ejercicio 05-99-70CuentaBancaria. Run. Completo.
MEJORAMOS EL EJERCICIO CUENTAS BANCARIAS
 */
package dam1campostello_daniel_ejercicio059970cuentabancariamejorado;

import java.util.Scanner;

public class DAM1CAmposTello_Daniel_Ejercicio059970CuentaBancariaMejorado {

    public static void main(String[] args) {

        Scanner recoge = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("Pepe", 333222111, 5, 0);

        int opciones = 0;

        do
        {
            System.out.print("¿Que operacion desea realizar? ");
            
            System.out.println("\n1 - mostrar informacion de cuenta" + "\n2 - Ingresar dinero" + "\n3 - Retirar dinero" + "\n4 - Salir");
            
            opciones = recoge.nextInt();

            if (opciones <= 4)
            {

                switch (opciones)
                {
                    case 1: //mostramos datos de la cuenta
                        System.out.println("Datos de la cuenta bancaria: ");
                        System.out.println(cuenta1.toString());
                        break;

                    case 2://ingresamos dinero
                        System.out.print("¿Cuanto dinero desea ingresar? ");

                        int valorIngreso = recoge.nextInt();

                        cuenta1.ingreso(valorIngreso);

                        System.out.println("El saldo actual: " + cuenta1.getSaldo() + "€");
                        break;

                    case 3://retiramos el dinero
                        System.out.print("¿Cuanto dinero desea retirar? ");

                        int valorRetirar = recoge.nextInt();

                        cuenta1.retirar(valorRetirar);

                        System.out.println("El saldo actual: " + cuenta1.getSaldo() + "€");

                        break;
                    
                    case 4://cerramos programa
                        
                        System.out.println("Saliendo del programa.");
                        
                        break;
                }
            } else{
                System.out.print(opciones  + "-" + " No es un valor valido. \n");
            }

        } while (opciones != 4);

    }

}
