import junit.framework.TestCase;


public class DaryMaxHeapTest extends TestCase {
	
	/*
	 * Test constructor with invalid input
	 */
	public void testConstructorInvalidInput() {
		boolean pass = false;
		DaryMaxHeap heap = null;
		try {
			heap = new DaryMaxHeap(-1);
		}
		catch (IllegalArgumentException e) {
			pass = true;
		}
		assertTrue(pass);
		
		pass = false;
		try {
			heap = new DaryMaxHeap(0);
		}
		catch (IllegalArgumentException e) {
			pass = true;
		}
		assertTrue(pass);
		
		pass = false;
		try {
			heap = new DaryMaxHeap(1);
		}
		catch (IllegalArgumentException e) {
			pass = true;
		}
		assertTrue(pass);

		pass = false;
		try {
			DaryMaxHeap.heapsort(null);
		}
		catch (IllegalArgumentException e) {
			pass = true;
		}
		assertTrue(pass);
	}

	/*
	 * Test constructor with valid input and empty empty
	 */
	public void testConstructorValidInput() {
		boolean pass = false;
		DaryMaxHeap heap = null;
		try {
			// a 2-ary heap (binary tree)
			heap = new DaryMaxHeap(2);
			pass = true;
		}
		catch (IllegalArgumentException e) {
			// do nothing
		}
		assertTrue(pass);
		assertNotNull(heap);
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		assertEquals(0, heap.height());
		
		pass = false;
		try {
			heap.peek();
		}
		catch (RuntimeException e) {
			pass = true;
		}
		assertTrue(pass);
		
		pass = false;
		try {
			heap.poll();
		}
		catch (RuntimeException e) {
			pass = true;
		}
		assertTrue(pass);
		
		int [] arr = heap.toArray();
		assertNotNull(arr);
		assertEquals(0, arr.length);
		
		arr = heap.toMinHeap();
		assertNotNull(arr);
		assertEquals(0, arr.length);
		
		arr = DaryMaxHeap.heapsort(heap);
		assertNotNull(arr);
		assertEquals(0, arr.length);
	}
	
	/*
	 * Test a heap with one element
	 */
	public void testOneElement() {
		// a 2-ary heap (binary tree)
		DaryMaxHeap heap = new DaryMaxHeap(2);
		heap.add(16);
		assertFalse(heap.isEmpty());
		assertEquals(1, heap.size());
		assertEquals(0, heap.height());
		
		boolean pass = false;
		int value = 0;
		try {
			value = heap.peek();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(16, value);
		assertFalse(heap.isEmpty());
		assertEquals(1, heap.size());
		assertEquals(0, heap.height());
		
		int [] arr = heap.toArray();
		assertNotNull(arr);
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);
		
		arr = heap.toMinHeap();
		assertNotNull(arr);
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);
		
		arr = DaryMaxHeap.heapsort(heap);
		assertNotNull(arr);
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);
		
		pass = false;
		try {
			value = heap.poll();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(16, value);
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		assertEquals(0, heap.height());
		
		// a 3-ary heap (tertiary tree)
		heap = new DaryMaxHeap(3);
		heap.add(16);
		assertFalse(heap.isEmpty());
		assertEquals(1, heap.size());
		assertEquals(0, heap.height());
		
		pass = false;
		try {
			value = heap.peek();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(16, value);
		assertFalse(heap.isEmpty());
		assertEquals(1, heap.size());
		assertEquals(0, heap.height());
		
		arr = heap.toArray();
		assertNotNull(arr);
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);
		
		arr = heap.toMinHeap();
		assertNotNull(arr);
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);
		
		arr = DaryMaxHeap.heapsort(heap);
		assertNotNull(arr);
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);
		
		pass = false;
		try {
			value = heap.poll();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(16, value);
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		assertEquals(0, heap.height());
		
		arr = heap.toArray();
		assertNotNull(arr);
		assertEquals(0, arr.length);
		
		arr = heap.toMinHeap();
		assertNotNull(arr);
		assertEquals(0, arr.length);
		
		arr = DaryMaxHeap.heapsort(heap);
		assertNotNull(arr);
		assertEquals(0, arr.length);
	}
	
	/*
	 * Test a heap with two elements
	 */
	public void testTwoElements() {
		// a 3-ary heap (tertiary tree)
		DaryMaxHeap heap = new DaryMaxHeap(3);
		heap.add(16);
		heap.add(32);
		assertFalse(heap.isEmpty());
		assertEquals(2, heap.size());
		assertEquals(1, heap.height());
		
		boolean pass = false;
		int value = 0;
		try {
			value = heap.peek();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(32, value);
		assertFalse(heap.isEmpty());
		assertEquals(2, heap.size());
		assertEquals(1, heap.height());
		
		int [] arr = heap.toArray();
		assertNotNull(arr);
		assertEquals(2, arr.length);
		assertEquals(32, arr[0]);
		assertEquals(16, arr[1]);
		
		arr = heap.toMinHeap();
		assertNotNull(arr);
		assertEquals(2, arr.length);
		assertEquals(16, arr[0]);
		assertEquals(32, arr[1]);
		
		arr = DaryMaxHeap.heapsort(heap);
		assertNotNull(arr);
		assertEquals(2, arr.length);
		assertEquals(16, arr[0]);
		assertEquals(32, arr[1]);
		
		pass = false;
		try {
			value = heap.poll();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(32, value);
		assertFalse(heap.isEmpty());
		assertEquals(1, heap.size());
		assertEquals(0, heap.height());
		
		arr = heap.toArray();
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);

		// a 4-ary heap
		heap = new DaryMaxHeap(4);
		heap.add(16);
		heap.add(32);
		assertFalse(heap.isEmpty());
		assertEquals(2, heap.size());
		assertEquals(1, heap.height());
		
		pass = false;
		try {
			value = heap.peek();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(32, value);
		assertFalse(heap.isEmpty());
		assertEquals(2, heap.size());
		assertEquals(1, heap.height());
		
		arr = heap.toArray();
		assertNotNull(arr);
		assertEquals(2, arr.length);
		assertEquals(32, arr[0]);
		assertEquals(16, arr[1]);
		
		arr = heap.toMinHeap();
		assertNotNull(arr);
		assertEquals(2, arr.length);
		assertEquals(16, arr[0]);
		assertEquals(32, arr[1]);
		
		arr = DaryMaxHeap.heapsort(heap);
		assertNotNull(arr);
		assertEquals(2, arr.length);
		assertEquals(16, arr[0]);
		assertEquals(32, arr[1]);
		
		pass = false;
		try {
			value = heap.poll();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(32, value);
		assertFalse(heap.isEmpty());
		assertEquals(1, heap.size());
		assertEquals(0, heap.height());
		
		arr = heap.toArray();
		assertEquals(1, arr.length);
		assertEquals(16, arr[0]);
	}
	
	public void testClear()
	{
		// A 4-ary heap
		DaryMaxHeap heap = new DaryMaxHeap(4);
		heap.add(43);
		heap.add(1);
		heap.add(67);
		heap.add(87);
		heap.add(3);
		heap.add(2);
		assertFalse(heap.isEmpty());
		assertEquals(6, heap.size());
		assertEquals(2, heap.height());
		
		boolean pass = false;
		int value = 0;
		try {
			value = heap.peek();
			pass = true;
		}
		catch (RuntimeException e) {
			// do nothing
		}
		assertTrue(pass);
		assertEquals(87, value);
		assertFalse(heap.isEmpty());
		assertEquals(6, heap.size());
		assertEquals(2, heap.height());
		
		int [] arr = heap.toArray();
		assertNotNull(arr);
		assertEquals(6, arr.length);
		assertTrue(arr[0] >= arr[1]);
		assertTrue(arr[0] >= arr[2]);
		assertTrue(arr[0] >= arr[3]);
		assertTrue(arr[0] >= arr[4]);
		assertTrue(arr[1] >= arr[5]);
		
		arr = heap.toMinHeap();
		assertNotNull(arr);
		assertEquals(6, arr.length);
		assertTrue(arr[0] <= arr[1]);
		assertTrue(arr[0] <= arr[2]);
		assertTrue(arr[0] <= arr[3]);
		assertTrue(arr[0] <= arr[4]);
		assertTrue(arr[1] <= arr[5]);
		
		arr = DaryMaxHeap.heapsort(heap);
		assertNotNull(arr);
		assertEquals(6, arr.length);
		assertEquals(1, arr[0]);
		assertEquals(2, arr[1]);
		assertEquals(3, arr[2]);
		assertEquals(43, arr[3]);
		assertEquals(67, arr[4]);
		assertEquals(87, arr[5]);

		heap.clear();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		assertEquals(0, heap.height());
	}
	
	/* 
	 * I highly suggest that you write your own tests using mine above as a guide
	 * to thoroughly test your code. The grader will apply his tests against
	 * your code.
	 */
}
