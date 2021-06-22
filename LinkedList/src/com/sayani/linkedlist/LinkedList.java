/**
 * Create a simple Linked List of 56, 30 and 70
 *
 * @author: SAYANI KOLEY
 * @since: 22.06.2021
 */

package com.sayani.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        //Linking the nodes
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        //If linking successful, return successful
        if(myFirstNode.getNext() == mySecondNode && mySecondNode.getNext() == myThirdNode) {
            System.out.println(myFirstNode.getKey() + " -> " + mySecondNode.getKey() + " -> " + myThirdNode.getKey());
            System.out.println("Linked List created successfully!");
        }
        else
            System.out.println("Linked List creation failed!");
    }
}
