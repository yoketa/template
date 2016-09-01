package ar.fiuba.tdd.template;

public class LinkedList<Object> {

    private Node<Object> nodeFirst;


    public LinkedList() {
        this.nodeFirst = null;
    }


    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public int size() {
        return this.size(0,this.nodeFirst);
    }

    private int size(int size, Node<Object> aNode) { return this.size(size+1, aNode.getNodeNext());}

    public void addEnd(Object data) {
        this.addEnd( new Node<Object>(data) );
    }

    private void addEnd(Node<Object> nodeNew ) { this.addEnd(nodeNew,this.nodeFirst,this.nodeFirst.getNodeNext());}

    private void addEnd(Node<Object>nodeNew, Node<Object> nodePrevious, Node<Object> nodeCurrent) {this.addEnd(nodeNew,nodeCurrent,nodeCurrent.getNodeNext());}

    public void removeFirst() { this.nodeFirst = this.nodeFirst.getNodeNext(); }


    public Object getFirst() { return this.nodeFirst.getData(); }
}