/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion.linkedlist;

/**
 *
 * @author Nicolas Ortega
 * @param <E>
 */
public class Node<E> {
    private final E value;
    private Node<E> nextNode;
    private Node<E> priorNode;

    
    public Node(E value){
        this.value = value;
        nextNode = null;
        priorNode = null;
    }

    
    public E getValue() {
        return value;
    }

    
    public E nextValue(){
        E res;
        if (nextNode!=null){
            res = nextNode.value;
        }else{
            res=null;
        }
        return res;
    }

    
    public Node<E> getNextNode(){
        return nextNode;
    }

    
    public Node<E> getPriorNode(){
        return priorNode;
    }

    
    public void setNextNode(Node<E> node){
        nextNode = node;
    }

    
    public void setPriorNode(Node<E> node){
        priorNode = node;
    }
}
