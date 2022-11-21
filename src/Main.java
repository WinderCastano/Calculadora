import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        byte repetir=0;
            Scanner sn = new Scanner(System.in);
        do {
            try{
            System.out.println("Digite el primer numero");
            int num1 = sn.nextInt();
            System.out.println("Digite el segundo numero");
            int num2 = sn.nextInt();
            System.out.println("Inserte 1 para suma");
            System.out.println("Inserte 2 para resta");
            System.out.println("Inserte 3 para multiplicacion");
            System.out.println("Inserte 4 para division");
                byte operacion = sn.nextByte();
                double resultado = 0;
                if (operacion == 1) {
                    resultado = num1 + num2;
                    System.out.println("La suma es: " + resultado);
                } else if (operacion == 2) {
                    resultado = num1 - num2;
                    System.out.println("La resta es: " + resultado);
                } else if (operacion == 3) {
                    resultado = num1 * num2;
                    System.out.println("La multiplicación es: " + resultado);
                } else if (operacion == 4) {
                    try {
                        resultado = num1 / num2;
                        System.out.println("La divisón es: " + resultado);
                    }catch (Exception e) {System.out.println("La divisón es imposible ");}
                } else {
                    System.out.println("Numero incorrecto");
                }} catch (Exception e) {System.out.println("Numero incorrecto");}
            System.out.println("Repetir proceso ¿0 o 1?");
             repetir = sn.nextByte();
        }
       while(repetir==1);{
          System.out.println("Proceso terminado");
            }
}
}
