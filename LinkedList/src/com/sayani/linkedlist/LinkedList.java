/**
 * Ability to create Linked List by adding 30 and 56 to 70
 * Node with data 70 is First Created
 * Next 30 is added to 70
 * Finally 56 is added to 30
 * LinkedList Sequence: 56->30->70
 *
 * @author: SAYANI KOLEY
 * @since: 22.06.2021
 */

package com.sayani.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        LinkedListOperations operations = new LinkedListOperations();
        INode head;

        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);

        head = operations.addNode(myFirstNode);
        operations.displayNode(head);
        head = operations.addNode(mySecondNode);
        operations.displayNode(head);
        head = operations.addNode(myThirdNode);
        operations.displayNode(head);
    }
}
