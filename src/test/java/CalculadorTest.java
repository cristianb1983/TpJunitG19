/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import crb.tpjunitg19.Calculador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInfo;

/**
 *
 * @author crb_p
 */
public class CalculadorTest {
    
    static Calculador cal;
    //Se ejecuta una sola vez antes de todas las pruebas
    @BeforeAll
    public static void beforeClass() {
        cal = new Calculador();
        System.out.println("Bienvenido, iniciando pruebas de Calculador");
    }
    
    @AfterAll
    public static void afterClass() {
        System.out.println("Terminando las pruebas de Calculador");
    }
    
    //Se ejecuta antes de cada test
    @BeforeEach
    public void before(TestInfo testInfo) {
        System.out.println("Ejecutando prueba: " + testInfo.getTestMethod().get().getName());
    }
    
    @AfterEach
    public void after(TestInfo testInfo) {
        System.out.println(testInfo.getTestMethod().get().getName() + " finalizado");
    }
    
    @Test
    public void testSuma() {
        double resultado = cal.suma(2.2, 2.2);
        assertEquals(4.4, resultado, 0.001);
    }
    
    @Test
    public void testResta() {
        double resultado = cal.resta(5.5, 2.2);
        assertEquals(3.3, resultado, 0.001);
    }  
}
