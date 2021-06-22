/**
 * Ability to create Linked List by appending 30 and 70 to 56
 * Node with data 56 is First Created
 * Next Append 30 to 56
 * Finally Append 70 to 30
 * LinkedList Sequence: 56->30->70
 *
 * @author: SAYANI KOLEY
 * @since: 22.06.2021
 */

package com.sayani.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        LinkedListOperations operations = new LinkedListOperations();

        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        operations.addNode(myFirstNode);
        operations.addNode(mySecondNode);
        operations.addNode(myThirdNode);

        operations.displayNode();
    }
}
