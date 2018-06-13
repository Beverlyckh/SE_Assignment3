/*
 * Beverly Ackah
 * SE Assignment #3
 * 
 */

import java.util.NoSuchElementException;

public class LinkedStackFixed<Item>{
    private int n;          // size of the stack
    private Node first;     // top of stack

    private class Node {
        private Item item;
        private Node next;
    }

    //initializes an empty stack.
    public LinkedStackFixed() {
        first = null;
        n = 0;
    }

    //returns true if this stack is empty; false otherwise
    public boolean isEmpty() {
        return first == null;
    }

    //returns the number of items in the stack.
    public int size() {
        return n;
    }

    //inserts an item to the stack
    public void push(Item item) {
        Node temp = first;
        first = new Node();
        first.item = item;
        first.next = temp;
        n++;
    }
    //removes and returns the top element in the stack
    public Item pop()  {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }


    //returns (but does not remove) the item most recently added to this stack.
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }


}
