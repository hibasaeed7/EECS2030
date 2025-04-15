package Lab7;

import java.util.*;
import java.io.*;
/**
 * This class is a container that holds an unlimited number of 
 * String objects. It is able to remove objects and add objects.
 */

public class Container {
	// No instance variable should be defined for this class. 


	/**
	 * Reads the given file and add it into a list. 
	 * Each element of the list contains one line of the file. 
	 * @param fileName is the name of the file that is read in this method. 
	 */

	public static final List<String> readFile(String fileName)  {
		// add your code here. You may change the return value.
		List<String> lines= new ArrayList<String>();
		Scanner scanner=null;;
		try {
			scanner = new Scanner(new File(fileName));
			while(scanner.hasNextLine())
			{
				lines.add(scanner.nextLine());
			}
			scanner.close();
			return lines;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		} 
		
		
	}
		
	/**
	 * This method adds the <code> obj </code> to the container.
	 * @param obj is the object that is added to the container.
	 */
	
	void add(Object object) {
		// insert your code here
	}

	/**
	 * This method removes the object from the container
	 * @return returns the removed object.
	 */
	Object remove() {
		// insert your code here, you may want to change the return value
		return null;
	}

	/**
	 * @return It returns the number of elements in the container.
	 */
	int getSize() {
		// insert your code here. You may want to change the return value. 
		return 0;
	}

}

/**
 * 
 * This class simulates a Queue, which is a data structure that insert and remove data 
 * by FIFO (first-in, first-out) rule
 *
 */
class Queue extends Container{
	ArrayList<String> queue; 
	
	/**
	 * This is the constructor that initializes the <code> queue </code>
	 * with all the strings in the <code> fileName </code> that is labeled 
	 * by "Queue"
	 * @param fileName is the name of the file that is read.  
	 */
	public Queue(String fileName){
		// insert your code here
		
		// insert your code here
		queue = (ArrayList<String>) Container.readFile(fileName);
		for(int i=0;i<queue.size();i++) {
			String s = queue.get(i);
			if(s.contains("Stack")) {
				queue.remove(i);
				i-=1;
			}
			else if(s.contains("Queue")) {
				queue.remove(i);
				queue.add(i,s.substring(5).trim());
			}
		}
		
	}
	
	/**
	 * This method adds the object into the Queue. 
	 * Please note that the rule of the queue insertion/removal is 
	 * First in, First out. 
	 * @param obj is the object that is added to the queue. 
	 */
	@Override
	public void add(Object obj) {
		// insert your code here
		this.queue.add((String)obj);
	}
	/**
	 * This method removes an object from the Queue. 
	 * Please note that the rule of the queue insertion/removal is 
	 * First in, First out. 
	 */
	@Override
	public Object remove() {
		// insert your code here. You may want to change the return value. 
		if(queue.isEmpty())
			return null;
		return queue.remove(0);		
			
	}
	/**
	 * @return returns the object which is in front of the queue.
	 */
	public Object top() {
		// insert your code here. You may want to change the return value. 
		if(queue.isEmpty())
			return null;
		return queue.get(0);
	}
	
	/**
	 * Returns the number of items in the queue.
	 */
	@Override 
	public int getSize(){
		// insert your code here. You may want to change the return value. 
		return this.queue.size();
	}
}

/**
 * 
 * This class simulates a Stack, which is a data structure that insert and remove data 
 * by FILO (first-in, last-out) rule
 *
 */
class Stack extends Container{
	ArrayList<String> stack; 
	
	/**
	 * This is the constructor that initializes the <code> stack </code>
	 * with all the strings in the <code> fileName </code> that is labeled 
	 * by "Stack"
	 * @param fileName is the name of the file that is read.  
	 * @throws FileNotFoundException 
	 */
	public Stack(String fileName)  {
//		List<String> file= readFile(fileName);
//		this.stack=new ArrayList<String>();
//		stack.addAll(file);
		
		stack = (ArrayList<String>) Container.readFile(fileName);
		for(int i=0;i<stack.size();i++) {
			String s = stack.get(i);
			if(s.contains("Queue")) {
				stack.remove(s);
				i-=1;
			}
			else if(s.contains("Stack")) {
				stack.remove(s);
				stack.add(i,s.substring(5).trim());
			}
		}
			
	}
	/**
	 * This method removes an object from the stack. 
	 * Please note that the rule of the stack insertion/removal is 
	 * First in, Last out. 
	 */

	@Override
	public void add(Object obj) {
		// insert your code here. 
		stack.add((String) obj);
	}
	
	/**
	 * This method removes an object from the stack. 
	 * Please note that the rule of the stack insertion/removal is 
	 * First in, Last out. 
	 */

	@Override
	public Object remove() {
		// insert your code here. You may want to change the return value. 
		if(stack.isEmpty())
			return null;
		return stack.remove(stack.size()-1);
	
	}
	/**
	 * @return returns the object which is on top of the stack.
	 */
	
	public Object top() {
		// insert your code here. You may want to change the return value. 
		if(stack.isEmpty())
			return null;
		 return this.stack.get(stack.size()-1);
	}
	/**
	 * Returns the number of items in the stack.
	 */
	@Override 
	public int getSize() {
		// insert your code here. You may want to change the return value. 
		
		return this.stack.size();
	}
}