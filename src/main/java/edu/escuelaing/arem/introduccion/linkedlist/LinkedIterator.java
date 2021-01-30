/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Nicolas Ortega 
 */
public class LinkedIterator<E> implements Iterator<E>{
    private Node<E> node;
    private LinkedList ll;
    public LinkedIterator(LinkedList li){
        ll = li;
        node = ll.head;
    }

    @Override
    public boolean hasNext() {
        boolean res= false;
        if (node!=null){
            res=true;
        }
        return res;
    }

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
