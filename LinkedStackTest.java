/*
 * Beverly Ackah
 * SE Assignment #3
 * 
 */

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;



public class LinkedStackTest {

	LinkedStack ls ;


	    @BeforeEach
	    public void setUp(){
	        ls = new LinkedStack();
	    }



	    @Test
	    void isEmptyTest() {
	        assertTrue(ls.isEmpty());
	    }

	    @Test
	    void sizeTest(){

	        for(int i=0; i<5; i++){
	            ls.push(i);
	        }
	        assertEquals(5, ls.size());
	    }

	    @Test
	    void pushTest() {
	    	assertTrue(ls.isEmpty());
	        for (int i = 0; i < 10; i++) {
	            ls.push(i);
	        }

	        assertEquals(10, ls.size());
	    }
	    
	    @Test
	    void popTest(){
	       
	    	 for (int i = 0; i < 5; i++) {
	             ls.push(i);
	         }
	    	 	ls.pop();	        
	        assertEquals(4,ls.size());
	
	    }

	    @Test
	    void popEmpty() {
	        assertThrows(NoSuchElementException.class, () -> ls.pop(), "NoSuchElementException not thrown");
	    }

	    @Test
	    void peekEmpty(){
	            assertThrows(NoSuchElementException.class, () -> ls.peek(), "NoSuchElementException not thrown");

	    }

	    @Test
	    void peekTest(){
	        for (int i = 0; i < 5; i++) {
	            ls.push(i);
	        }
	        assertEquals(4, ls.peek());
	    }

	    @Test
	    void pushObjects() {
	    	LinkedStack newList = new LinkedStack();
	        long totalTime;
	        long startTime = System.currentTimeMillis();
	        for (int i = 0; i < 10000; i++) {
	            newList.push(i);
	        }
	        long endTime = System.currentTimeMillis();
	        totalTime = endTime - startTime;
	        assertTrue(totalTime <= 5);
	    }

}
