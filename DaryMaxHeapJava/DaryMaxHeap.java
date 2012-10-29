/*
 * Insert your name and date.
 * Insert description of the class.
 */

public class DaryMaxHeap {

	// insert your instance variables here
	// insert your constants (if any) here
	
	/*
	 * Constructor
	 * 
	 * Initialize instance variables, i.e. create an empty heap
	 * 
	 * @param n Maximum number of children per tree node, i.e. degree of the tree
	 * @throws IllegalArgumentException Parameter n is less than or equal to one
	 */
	public DaryMaxHeap(int n) {
		// insert your code here
	}
	
	/*
	 * Check if the heap is empty
	 * 
	 * @return True if the heap is empty, otherwise false
	 */
	public boolean isEmpty() {
		// replace this with your code
		return false;
	}
	
	/*
	 * Size of the heap
	 * 
	 * @return Number of nodes in the heap
	 */
	public int size() {
		// replace this with your code
		return 0;
	}
	
	/*
	 * Height of the heap, i.e. complete n-ary tree
	 * 
	 * @return Number of edges from root node to farthest leaf node
	 */
	public int height() {
		// replace this with your code
		return 0;
	}
	
	/*
	 * Peek at the max element
	 * 
	 * Retrieves, but does not remove, the max element in the heap
	 * 
	 * @throws RuntimeException Heap is empty
	 */
	public int peek()
	{
		// replace this with your code
		return 0;
	}
	
	/*
	 * Add to the heap
	 * 
	 * Inserts the specified element into this heap.
	 * 
	 * @param e Element to insert
	 */
	public void add (int e) {
		// insert your code here
	}
	
	/*
	 * Peek at the max element
	 * 
	 * Retrieves and removes the max element of the heap.
	 * 
	 * @throws RuntimeException Heap is empty
	 */
	public int poll() {
		// replace this with your code
		return 0;
	}
	
	/*
	 * Make the heap empty
	 */
	public void clear() {
		// insert your code here
	}
	
	/*
	 * Array-based representation of the heap
	 * 
	 * @return An array-based representation in level order (see lecture notes) 
	 * 		   of this max heap.
	 * 		   If the heap is empty then return an array of length zero. 
	 * 		   This method never returns null.
	 */
	public int [] toArray() {
		// replace this with your code
		return null;
	}

	/*
	 * Conversion to d-ary min heap
	 * 
	 * @return An array-based representation in level order of a Min Heap 
	 * 		   containing all the elements in this heap.
	 * 		   If the heap is empty then return an array of length zero. 
	 * 		   This method never returns null.
	 */
	public int [] toMinHeap() {
		// replace this with your code
		return null;
	}
	
	/*
	 * Sort elements in ascending order using the Heap Sort algorithm presented in lecture
	 * 
	 * @param heap An d-ary max heap
	 * @return An array of the elements in heap in ascending sorted order.
	 * 		   If the heap is empty then return an array of length zero. 
	 * 		   This method never returns null.
	  * @throws IllegalArgumentException Parameter heap is null 
	 */
	public static int [] heapsort(DaryMaxHeap heap) {
		// replace this with your code
		return null;
	}
}
