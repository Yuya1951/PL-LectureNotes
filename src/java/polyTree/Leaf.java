/**
 * 
 * @author Atsushi Igarashi
 * @version 20170105
 * 
 */
public class Leaf<E> implements Tree<E> {
    // no instance variables

    /**
     * Constructor for objects of class Leaf
     */
    public Leaf() {
        // nothing to initialize
    }
    
    /**
     * A method to compute the size of the tree.
     * 
     * @return      the size of the tree
     */
    public int size() { return 0; }

    /**
     * A method to compute the depth of the tree.
     * 
     * @return      the depth of the tree
     */
    public int depth() { return 0; }

    /**
     * A method to compute the mirror image of the tree
     * 
     * @return      
     */
    public Tree<E> reflect() { return new Leaf<E>(); }

    /**
     * A method to add a new element to the tree
     * 
     * @return      
     */
    public Tree<E> add(E e) {
        return new Branch<E>(new Leaf<E>(), e, new Leaf<E>());
    }

    /**
     * A method to convert to a string
     *
     * @return      the string representation of a tree
     */
    public String toString() {
        return "Lf";
    };
}
