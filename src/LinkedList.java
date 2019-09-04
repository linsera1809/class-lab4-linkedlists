/**
 * This class creates the LinkedList class that utilizes the Node data
 * structure that will be tested against. The purpose of this class is
 * to create a linked list of generic node types that will pass given
 * acceptance tests.
 *
 *
 * @author rlinse
 * @VCS https://github.com/linsera1809/class-lab4-linkedlists.git
 * @date 4SEP2019
 *
 */

class LinkedList<E> {

    private Node<E> head;


    /**
     * Implement the constructor
     * Constructor which takes the starting value for the first node, called the "head".
     * @param startingValue Value to initialize the linked list with.
     */
    public LinkedList(E startingValue) {
        head = new Node<>(startingValue);
    }

    /**
     * Convenience method to return the head node.
     * @return The first node of the linked list.
     */
    public Node<E> getHead() {
        return head;
    }

     /**
     * Implement this method.
     * Add a value to the end of the linked list.
     * This method should create a new node with the value
     * and traverse the nodes in the linked list using the "next" property of the nodes starting with the head node.
     * Once a null next link is encountered add a new node and link it to the current last node (Node.setNext()).
     * @param value The value to be appended as a node at the end of the linked list.
     */
     public void addValue(E value) {
         Node<E> currentNode = head; //cast to Integer
         while (currentNode.getNext() != null) {
             currentNode = currentNode.getNext();
            }
         Node<E> newNode = new Node<E>(value);
         currentNode.setNext(newNode);
        }

    /**
     * TODO Implement this method.
     * Add the given element, value, to the list at the given index.
     * After this operation is complete, get(index) will return value.
     * After this operation, all elements that had an index
     * greater than index (as determined by get()) will have their index increased by one.
     * This operation is only valid for 0 <= index <= size().
     * @param index The index at which to add value.
     * @param value The value to be added.
     * @throws IndexOutOfBoundsException when index is less than zero or greater than size.
     */
    public void add(int index, E value) {

    }

    /**
     * TODO Implement this method.
     * Determine if the LinkedList is empty or not.
     * @return true if this LinkedList has no items. (This is the same as the size equal to zero.)
     * false if the size is greater than zero.
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * TODO Implement this method.
     * Return the size (number of items) in this LinkedList.
     * @return the number of items in the list.
     */
    public int size() {
        return -1;
    }

    /**
     * TODO Implement this method.
     * Return the element of the list at the given index.
     * This operation is only valid for 0 <= index < size().
     * This operation does not modify the list.
     * @param index The index at which to retrieve an element.
     * @return The element of the list at the given index.
     * @throws IndexOutOfBoundsException when index is less than zero or greater than or equal to size.
     */
    public E get(int index) {
        return null;
    }

    /**
     * TODO Implement this method.
     * Remove and return the first element (element number zero) from the list.
     * This operation is only valid for non-empty (size() > 0) lists.
     * @return The removed element.
     * @throws IndexOutOfBoundsException When the list is empty.
     */
    public E remove() {
        return null;
    }

    /**
     * TODO Implement this method.
     * Remove and return the element with the given index from the list.
     * This operation is only valid for 0 <= index < size().
     * After this operation, all elements that had an index
     * greater than index (as determined by get()) will have their index reduced by one.
     * @param index The index to remove an element from.
     * @return The removed element.
     * @throws IndexOutOfBoundsException when removing from index less than zero or greater than or equal to size.
     */
    public E remove(int index) {
        return null;
    }
}
