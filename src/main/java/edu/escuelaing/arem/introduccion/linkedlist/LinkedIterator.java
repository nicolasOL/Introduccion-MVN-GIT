/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Constructor del iterador
 * @author Nicolas Ortega 
 */
public class LinkedIterator<E> implements Iterator<E>{
    private Node<E> node;
    private LinkedList ll;
    /**
     * Clase iterador a ser usada por la linked list
     * Constructor de la lista enlazada
     * @param li
     */
    public LinkedIterator(LinkedList li){
        ll = li;
        node = ll.head;
    }

    /* (non-Javadoc)
     * @see java.util.Iterator#hasNext()
     */
    @Override
    public boolean hasNext() {
        boolean res= false;
        if (node!=null){
            res=true;
        }
        return res;
    }

    /* (non-Javadoc)
     * @see java.util.Iterator#next()
     */
    @Override
    public E next() {
        E value;
            if(!hasNext()){
                throw new NoSuchElementException();
            } else {
                value=node.getValue();
                node=node.getNextNode();
            }
            return value;
    }

 
}
