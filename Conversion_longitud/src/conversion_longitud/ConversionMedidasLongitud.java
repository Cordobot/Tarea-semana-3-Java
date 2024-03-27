package conversion_longitud;
import java.util.Scanner;

public class ConversionMedidasLongitud {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario ingresar la longitud en metros
        System.out.print("Ingrese la longitud en metros: ");
        double metros = scanner.nextDouble();
        
        // Convertir metros a pies
        double pies = metros * 3.28084;
        
        // Convertir metros a pulgadas
        double pulgadas = metros * 39.3701;
        
        // Convertir metros a centímetros
        double centimetros = metros * 100;
        
        // Mostrar los resultados
        System.out.println("La longitud en pies es: " + pies);
        System.out.println("La longitud en pulgadas es: " + pulgadas);
        System.out.println("La longitud en centímetros es: " + centimetros);
        
        scanner.close();
    }
}
