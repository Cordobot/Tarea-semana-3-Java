package programa_de_conteo_siglos;
import java.util.Scanner;

public class SigloAnho {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anho = scanner.nextInt();
        

        int siglo = siglo(anho);
        int primeranho = primer_anho(siglo);
        
        //este metodo imprime en pantalla la variable anho y el texto indicando el año y al siglo al que pertenece junto con el primer año del siglo tambien hace la concatenacion de caracteres y variables
        System.out.println("El año " + anho + " pertenece al siglo " + siglo);
        System.out.println("El primer año del siglo " + siglo + " es " + primeranho);
        
        scanner.close();
    }

    //esta funcion siglo divide la variable anho entre 100 ya que a eso equivale un siglo en años
    public static int siglo(int anho) {
        return (anho % 100 == 0) ? anho / 100 : anho / 100 + 1;
}
    
    public static int primer_anho(int siglo) {

        return (siglo == 1) ? 1 : (siglo - 1) * 100 + 1;
  }
}