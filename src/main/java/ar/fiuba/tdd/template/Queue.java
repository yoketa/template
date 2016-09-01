package ar.fiuba.tdd.template;

interface Queue {
    boolean isEmpty();
    int size();
    void add(Object obj); // add item
    Object top(); // return primary item, throw exception is empty.
    void remove(); // remover primary item, throw exception is empty.
}