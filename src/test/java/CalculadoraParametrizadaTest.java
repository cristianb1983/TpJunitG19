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
public class CalculadoraParametrizadaTest {
    
    static Calculador cal;
    //Se ejecuta una sola vez antes de todas las pruebas
    @BeforeAll
    public static void beforeClass() {
        cal = new Calculador();
        System.out.println("Bienvenido, iniciando pruebas parametrizadas");
    }
    
    @AfterAll
    public static void afterClass() {
        System.out.println("Terminando las pruebas parametrizadas");
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
}
