import java.util.Scanner ;
public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        int a = 10, b = 3 ;
        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( a % b );
        System.out.println( 10.0 / 3);
        boolean mayorDeEdad = true;
        boolean tieneCarnet = false;
        System.out.println(mayorDeEdad && tieneCarnet);
        System.out.println(mayorDeEdad || tieneCarnet);
        System.out.println(!mayorDeEdad);
        */
        Scanner sc = new Scanner(System.in);
       /*  System.out.print(" ¿Como te llamas? ");
        String nombre = sc.nextLine();
        System.out.print( " ¿Cuantos años tienes? ");
        int edad = sc.nextInt();
        System.out.println( "Hola " + nombre + " . Tienes " + edad + " años. ");
        System.out.print( " ¿Cual es la base? ");
        double base = sc.nextDouble();
        System.out.print( " ¿Cual es la altura? ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println(" El area de tu rectangulo es: " + area);
        */
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3 ;
        System.out.println( "Su promedio es de : " + promedio );
        
        if (promedio >= 90) {
            System.out.print(" EXCELENTE ");
        } else if ( promedio >= 70) {
            System.out.print(" BUENO ");
        } else if ( promedio >= 60) {
            System.out.print( " APROBADO ");
        } else { 
            System.out.print(" REPROBADO ");
        }
        
    }
}
