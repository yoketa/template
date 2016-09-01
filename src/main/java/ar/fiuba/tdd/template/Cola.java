package ar.fiuba.tdd.template;

public class Cola implements Queue {

    private LinkedList<Object> list;


    public Cola() {
        this.list = new LinkedList<Object>();
    }


    public boolean isEmpty() {
        return this.list.isEmpty();
    }


    public int size() {
        return this.list.size();
    }


    public void add(Object item) {
        this.list.addEnd(item);
    }


    public Object top() { return this.list.getFirst();}


    public void remove() {this.list.removeFirst();
    }

}
