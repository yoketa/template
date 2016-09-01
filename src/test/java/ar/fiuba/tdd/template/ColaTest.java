package ar.fiuba.tdd.template;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import junit.framework.Assert;

import java.lang.Integer;
//import main.java.*;


public class ColaTest {

    private Cola cola;
    private Integer element1;
    private Integer element2;
    private Integer element3;
    private Integer element4;
    private Integer element5;


    @Before
    public void setUp() {
        this.element1 = new Integer(111);
        this.element2 = new Integer(222);
        this.element3 = new Integer(333);
        this.element4 = new Integer(444);
        this.element5 = new Integer(555);
        this.cola = new Cola();
    }


    @After
    public void tearDown() {
        this.cola = new Cola();
    }


    @Test
    public void testAgregarUnElemento() {
        cola.add(element1);
        Assert.assertEquals(cola.top() , element1);
    }


    @Test
    public void testAgregarVariosElementos() {
        cola.add(element1);
        cola.add(element2);
        cola.add(element3);
        cola.add(element4);
        cola.add(element5);

        Assert.assertEquals(cola.size() , 5);
    }


    @Test
    public void testBorrarUnElemento() {
        cola.add(element1);
        cola.remove();

        Assert.assertEquals(cola.size() , 0);
    }


    @Test
    public void testBorrarVariosElementos() {
        cola.add(element1);
        cola.add(element2);
        cola.add(element3);
        cola.add(element4);
        cola.add(element5);
        cola.remove();

        Assert.assertEquals(cola.size() , 4);
        Assert.assertEquals(cola.top() , element2);

        cola.remove();
        cola.remove();

        Assert.assertEquals(cola.size() , 2);
        Assert.assertEquals(cola.top() , element4);
    }


    @Test
    public void testEstaVacia() {
        Assert.assertEquals(cola.isEmpty() , true);

        cola.add(element1);

        Assert.assertEquals(cola.isEmpty() , false);

        cola.remove();

        Assert.assertEquals(cola.isEmpty() , true);
    }
}