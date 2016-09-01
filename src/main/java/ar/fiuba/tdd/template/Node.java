package ar.fiuba.tdd.template;

public class Node<Object> {

    private Object data;

    private Node<Object> nodeNext = null;


    public Node(Object element) {
        this.data = element;
    }


    public void modifyData(Object element) {
        this.data = element;
    }


    public Object getData() {return this.data;}


    public void ModifyNodeNext(Node<Object> node) {
        this.nodeNext = node;
    }


    public Node<Object> getNodeNext() {
        return this.nodeNext;
    }


    public boolean isNextEmpty() {
        return (this.nodeNext != null);
    }

}
