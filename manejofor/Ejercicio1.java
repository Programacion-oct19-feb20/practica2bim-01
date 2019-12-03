/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejofor;

/**
 *
 * @author reroes
 */
public class Ejercicio1 {

    public static void main(String args[]) {
        double monto; // Monto depositado al final de cada año
        double principal = 1000.0; // monto inicial antes de los intereses
        double tasa = 0.05; // tasa de interés
        // muestra los encabezados
        System.out.printf("%s\t\t%s\n", "Año", "Monto");
        // calcula el monto en deposito para cada uno de diez años
        for (int anio = 1; anio <= 10; anio++) {
            // calcula el nuevo monto para el año especificado
            monto = principal * Math.pow(1.0 + tasa, anio);
            // muestra el año y el monto
            System.out.printf("%d\t\t%.2f\n", anio, monto);
        } // fin de for

    } // fin de la clase ContadorFor

}
