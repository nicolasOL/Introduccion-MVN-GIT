/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion.linkedlist;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Nicolas Ortega
 * @param <E>
 */
public class LinkedList<E> implements Collection<E>{
    Node<E> head;
    
    @Override
    public int size() {
        Node<E> current = head;
        int size = 0;
        while(current!= null){
            size++;
            current=current.getNextNode();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean res= false;
        if (head==null){
            res=true;
        }
        return res;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> res;
        res = new LinkedIterator(this);
        return res;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(E e) {
        Node<E> last = getLast();
        if(last == null){
            head = new Node<>(e);
        } else {
            Node<E> newnode =new Node<>(e);
            newnode.setPriorNode(last);
            last.setNextNode(newnode);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> current = head;
        boolean done=false;
        if(head !=null && o.equals(head.getValue())) {
            head = head.getNextNode();
        }
        while(current!=null && !done){
            if(o.equals(current.getValue())){
                putNodes(current.getPriorNode(), current.getNextNode());
                done=true;
            }
            current=current.getNextNode();
        }
        return done;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        c.forEach(e -> {
            add(e);
        });
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Node<E> getLast() {
        Node<E> last = head;
        while(last!= null && last.getNextNode()!=null){
            last = last.getNextNode();
        }
        return last;
    }

    private void putNodes(Node<E> priorNode, Node<E> nextNode) {
        if(nextNode!=null){
            nextNode.setPriorNode(priorNode);
        }
        if(priorNode!=null){
            priorNode.setNextNode(nextNode);
        }
    }
    
}
