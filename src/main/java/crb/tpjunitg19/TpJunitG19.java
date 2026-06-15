/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package crb.tpjunitg19;

import java.util.Scanner;

/**
 *
 * @author crb_p
 */
public class TpJunitG19 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Calculador calc = new Calculador();
        
        System.out.println("=== BIENVENIDO A LA CALCULADORA ===");
        System.out.print("Ingrese el primer número: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double n2 = scanner.nextDouble();
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + calc.suma(n1, n2));
        System.out.println("Resta: " + calc.resta(n1, n2));
        
        int int1 = (int) n1;
        int int2 = (int) n2;
        
        System.out.println("Multiplicación : " + calc.multiplicar(int1, int2));
        
        try {
            System.out.println("División: " + calc.dividir(int1, int2));
        } catch (ArithmeticException e) {
            System.out.println("División: Error -> " + e.getMessage());
        }
        
        System.out.println("==================================");
        scanner.close();
    }
    }

