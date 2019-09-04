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
     * TODO Implement the constructor
     * Constructor which takes the starting value for the first node, called the "head".
     * @param startingValue Value to initialize the linked list with.
     */
    public LinkedList(Integer startingValue) {
        head = new Node<>((E) startingValue); //casting to Generic to override Integer
    }

    /**
     * TODO Implement this method.
     * Add the given element, value, to the end of the list.
     * @param value The value to be added.
     */
    public void add(E value) {

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
