package crb.tpjunitg19;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5Suite.java to edit this template
 */


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 *
 * @author crb_p
 */
@Suite
@SelectClasses({
    DivisionTest.class,
    CalculadorTest.class,
    CalculadoraParametrizadaTest.class
})

public class MiSweetSuite{
    
}
