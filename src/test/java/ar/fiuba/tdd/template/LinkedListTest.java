package ar.fiuba.tdd.template;

import org.junit.Test;
        import org.junit.Before;
        import org.junit.After;
        import junit.framework.Assert;

        import java.lang.Integer;
  //      import main.java.*;


public class LinkedListTest {

    private LinkedList<Integer> lista;
    private Integer element1;
    private Integer element2;
    private Integer element3;
    private Integer element4;
    private Integer element5;


    @Before
    public void setUp() {
        this.element1 = new Integer(425);
        this.element2 = new Integer(234);
        this.element3 = new Integer(542);
        this.element4 = new Integer(123);
        this.element5 = new Integer(325);
        this.lista = new LinkedList<Integer>();
    }


    @After
    public void tearDown() {
        this.lista = new LinkedList<Integer>();
    }


    @Test
    public void testAgregarUnElemento() {
        lista.addEnd(element1);
        Assert.assertEquals(lista.getFirst() , element1);
    }


    @Test
    public void testAgregarVariosElementos() {
        lista.addEnd(element1);
        lista.addEnd(element2);
        lista.addEnd(element3);
        lista.addEnd(element4);
        lista.addEnd(element5);

        Assert.assertEquals(lista.size() , 5);
    }


    @Test
    public void testBorrarUnElemento() {
        lista.addEnd(element1);
        lista.removeFirst();

        Assert.assertEquals(lista.size() , 0);
    }


    @Test
    public void testBorrarVariosElementos() {
        lista.addEnd(element1);
        lista.addEnd(element2);
        lista.addEnd(element3);
        lista.addEnd(element4);
        lista.addEnd(element5);
        lista.removeFirst();

        Assert.assertEquals(lista.size() , 4);
        Assert.assertEquals(lista.getFirst() , element2);

        lista.removeFirst();
        lista.removeFirst();

        Assert.assertEquals(lista.size() , 2);
        Assert.assertEquals(lista.getFirst() , element4);
    }


    @Test
    public void testEstaVacia() {
        Assert.assertEquals(lista.isEmpty() , true);

        lista.addEnd(element1);

        Assert.assertEquals(lista.isEmpty() , false);

        lista.removeFirst();

        Assert.assertEquals(lista.isEmpty() , true);
    }
}
