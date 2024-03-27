package conversionmoneda;

import java.util.Scanner;

public class ConversionMoneda {
    
    // Método para la conversión a las 8:00 a.m.
    public static double conversionALas8AM(double cantidad) {
        // No hay ningún cambio en el tipo de cambio a las 8:00 a.m.
        return cantidad;
    }
    
    // Método para la conversión al mediodía con un descuento del 10%
    public static double conversionAlMediodia(double cantidad) {
        // Aplicamos un descuento del 10% al tipo de cambio
        double cantidadConvertida = cantidad * 0.9;
        return cantidadConvertida;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario ingresar la cantidad de dinero en moneda local
        System.out.print("Ingrese la cantidad de dinero en moneda local: ");
        double cantidad = scanner.nextDouble();
        
        // Calcular la cantidad de dinero en moneda local a las 8:00 a.m.
        double cantidadALas8AM = conversionALas8AM(cantidad);
        System.out.println("Cantidad de dinero a las 8:00 a.m.: " + cantidadALas8AM);
        
        // Calcular la cantidad de dinero en moneda local al mediodía
        double cantidadAlMediodia = conversionAlMediodia(cantidad);
        System.out.println("Cantidad de dinero al mediodía: " + cantidadAlMediodia);
        
        scanner.close();
    }
}
