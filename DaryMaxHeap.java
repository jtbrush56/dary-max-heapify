import java.util.*;
/*
 * Insert your name and date.
 * Insert description of the class.
 */

public class DaryMaxHeap {

	// insert your instance variables here
	// insert your constants (if any) here

	public Integer heapSize;
	private ArrayList<T> array;
	private int childLimit;
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
		heapSize = array.size() - 1;
		childLimit = n;
	}

	/*
	 * Check if the heap is empty
	 * 
	 * @return True if the heap is empty, otherwise false
	 */
	public boolean isEmpty() {
		// replace this with your code
		return (heapSize == 0);
	}

	/*
	 * Size of the heap
	 * 
	 * @return Number of nodes in the heap
	 */
	public int size() {
		// replace this with your code
		return heapSize;
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
		return array.get(0);
	}

	/*
	 * Add to the heap
	 * 
	 * Inserts the specified element into this heap.
	 * 
	 * @param e Element to insert
	 */
	public void add (int e) {
		heapSize = array.size() - 1;
		heapSize++;
		array.add(null);
		IncreaseKey(key);
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
		if (heapSize < 0) throw new Exception("Heap underflow");
		T max = array.get(0);
		array.set(0, array.get(heapSize));
		heapSize--;
		MaxHeapify(0);
		return max;
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
		return array;
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
		HeapSize = heap.size() - 1;
		for (int i = heap.size() - 1; i > 0; i--)
		{
			Swap(0, i);
			HeapSize--;
			MaxHeapify(0);
		}
		for (int i = heap.size() - 1; i > 0; i--)
		{
			Swap(0, i);
			HeapSize--;
			MaxHeapify(0);
		}
		return heap;
	}
	//Private Methods

	private void HeapifyArray()
	{
		heapSize = array.size() - 1;
		for(int i = heapSize / 2; i > -1; i--)
		{
			MaxHeapify(i);
		}
	}
	private void MaxHeapify(int index)
	{
		int largest = index;
		int[] ChildNodes = ChildrenNodes(index);

		for(int x : ChildNodes)
		{
			if ( x <= heapSize && (array.get(x).compareTo(array.get(largest)) > 0))
			{
				largest = x;
			}
		}

		if (largest != index)
		{
			Swap(index, largest);
			MaxHeapify(largest);
		}
	}
	private int ParentIndex(int nodeIndex)
	{
		return (nodeIndex + childLimit - 3) / childLimit;
	}

	private int[] ChildrenNodes(int nodeIndex)
	{
		int[] temp = new int[childLimit];
		for (int i = 0; i < childLimit; i++)
		{
			temp[i] = (childLimit * nodeIndex) + 1 + i;
		}
		return temp;
	}
	private void IncreaseKey(T key) throws Exception
	{
		int i = heapSize;
		
		if( key.compareTo(array.get(i)) < 0)
		{
			throw new Exception("New key is smaller than current key");
		}
		
		array.set(i, key);
		
		while ( i >= 0 && array.get(ParentIndex(i)).compareTo(array.get(i)) < 0)
		{
			Swap(i, ParentIndex(i));
			i = ParentIndex(i);
		}
	}
	private void Swap(int to, int from)
	{
		T temp = array.get(to);
		array.set(to, array.get(from));
		array.set(from, temp);
	}
}
