/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.pruebas;

import ico.fes.TiposDeCamisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YO
 */
public class PruebasUnitarias {
    
    public TiposDeCamisa objeto;

    public PruebasUnitarias(){
}
       
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       objeto = new TiposDeCamisa(1,190);
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void probarCuantas(){
      double esperado= 902.5;
        assertEquals(esperado, objeto.descuento(5), esperado);
    }
 
}
