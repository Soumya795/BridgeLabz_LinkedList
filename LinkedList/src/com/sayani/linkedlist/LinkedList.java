/**
 * Ability to delete the first element in the LinkedList of sequence 56->30->70
 * Write pop method. Note there is new head
 * Final Sequence: 30->70
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

        operations.addNodeInBeginnig(myFirstNode);
        operations.addNodeAtEnd(myThirdNode);
        operations.addNodeInMiddle(mySecondNode);

        operations.displayNode();

        operations.deleteNodeFromBeginning();
        operations.displayNode();

    }
}
