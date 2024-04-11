package org.example;
//I wasnt sure how to use single linked lists, so i ended up using some help for this assignment to understand
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
//The point of the node class gives us two data values for each part of the list being the node, which is the int data and next marking the incoming node

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }
    //constuctor for the linkedlist for initialization

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            //Adds each node to the list then goes to the next
        }
    }

    public int sum() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
        //Counts up the sum as the list continues to run
    }
}
