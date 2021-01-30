/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion.linkedlist;

/**
 * Clase nodo a ser usada por la linked list
 * @author Nicolas Ortega
 * @param <E>
 */
public class Node<E> {
    private final E value;
    private Node<E> nextNode;
    private Node<E> priorNode;

    
    /**
     * Constructor
     * @param value
     */
    public Node(E value){
        this.value = value;
        nextNode = null;
        priorNode = null;
    }

    
    /**
     * Acomoda el siguiente nodo
     * @return
     */
    public E getValue() {
        return value;
    }

    
    /**
     * Devuelve el siguiente nodo
     * @return
     */
    public E nextValue(){
        E res;
        if (nextNode!=null){
            res = nextNode.value;
        }else{
            res=null;
        }
        return res;
    }

    
    /**
     * Devuelve el siguiente nodo
     * @return
     */
    public Node<E> getNextNode(){
        return nextNode;
    }

    
    /**
     * Devuelve el nodo prioritario
     * @return
     */
    public Node<E> getPriorNode(){
        return priorNode;
    }

    
    /**
     * Acomoda el siguiente nodo
     * @param node
     */
    public void setNextNode(Node<E> node){
        nextNode = node;
    }

    
    /**
     * Selecciona el nodo prioritario
     * @param node
     */
    public void setPriorNode(Node<E> node){
        priorNode = node;
    }
}
