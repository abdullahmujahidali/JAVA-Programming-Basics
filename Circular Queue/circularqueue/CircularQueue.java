
package circularqueue;
import java.util.ArrayList;

public class CircularQueue {
ArrayList<Integer> queue = new ArrayList<Integer>();
	int size = 0;
        int head = -1; // pointing at null
        int tail = -1;  // pointing at null
    public CircularQueue(int k) {
        // using a ADT arrayList 
    	queue = new ArrayList<Integer>(k); 
        this.size = k;
    }
    // Insert an element into the circular queue. Return true if the operation is successful. 
    public boolean enQueue(int value) {
    	if (isFull()) {
            System.out.print(value);
            System.out.println(" CANNOT BE INSERTED QUEUE IS FULL");
    		return false;
    	}else if (isEmpty()) {
    		queue.add(value);
    		this.head = 0;
    		this.tail = 0;
    		return true;
    	}else {
	    	this.tail = (tail +=1) % size;
	    	if (this.tail < this.head) {
	    		queue.set(this.tail, value);
	    		return true;
	    	}
	    	queue.add(this.tail,value);
	    	return true;
    	}
    }
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
    	if (isEmpty()) {
              System.out.println("QUEUE IS EMPTY");
    		return false;
    	}else if (queue.get(this.head) == queue.get(this.tail)) {
    		if (this.head == this.tail) {
    		this.head = -1;
    		this.tail = -1;
    		queue.removeAll(queue);
    		return true;
    		}else {
    			this.head = (head +=1) % size;
        		return true;
    		}
    	}
    	else {
  	    this.head = (head +=1) % size;
    		return true;
    	}
    }
   // Get the front item from the queue. 
    public int Front() {
        if (this.head == -1) {
        	return -1;
        }
    	return queue.get(this.head);
    }
   /** Get the last item from the queue. */
    public int Rear() {
        if (this.tail == -1) {
        	return -1;
        }
    	return queue.get(this.tail);
    }
   // Checks whether the circular queue is empty or not. 
	public boolean isEmpty() {
		if(this.tail == -1 && this.head == -1) {

			return true;
		}else {
			return false;
		}
	}
        
 public boolean isFull() {
	        if (this.head - this.tail == 1) { 
	        	return true;
	        }else if (this.head == 0 && this.tail == (size-1)) {
	        	return true;
	        }else {
	        	return false;
	        }
	   }
 public void display(){
        System.out.println("Elements: ");
         while(!isEmpty()){
             
           System.out.println(Front());
           
           deQueue();
        }
    
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    CircularQueue q = new CircularQueue(5); // declared a 5 size circular queue
    // inserting values
    q.enQueue(230);       
    q.enQueue(40);
    q.enQueue(145);
    q.enQueue(20);
    q.enQueue(448);
    
    q.enQueue(555);
    
    // deleting values 
    q.deQueue();
    q.deQueue();
    
    // adding values to circular queue to utilize empty area's
    q.enQueue(70);
    q.enQueue(74);

    System.out.print("QUEUE FRONT: ");
    System.out.println(q.Front());
    
    System.out.print("QUEUE END: ");
    System.out.println(q.Rear());
    //printing data
    q.display();
    }
    
    
}
