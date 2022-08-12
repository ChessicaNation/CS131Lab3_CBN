package arraylist;

/**
 * This class represents an array list that
 * can hold any type of object
 * 
 * @author chessicanation
 * Lab 3
 * CS131ON
 *
 */

public class ArrayList<T> 
{
	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	/**
   	 * Empty-argument constructor
   	 */
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    
	}//end empty-argument constructor 

   	/**
   	 * Preferred constructor
   	 * @param length
   	 */
  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
	
  	/**
  	 * This method adds an item to the array list.
  	 * Bounds checks make sure there is space for 
  	 * the next item in the array, otherwise it will
  	 * return false.
  	 * @param item
  	 * @return
  	 */
  	public boolean addItem(T item) 
  	{	
  			if(currentItem<arList.length)
  				{
  					arList[currentItem] = item;
  					currentItem++;
  					return true;
  				}	
  			else
  				return false;
  		
  	}//end addItem
  	
  	/**
  	 * Getter for currentItem
  	 * @return
  	 */
	public int getCurrentItem() 
	{
		return currentItem;
	}//end getCurrentItem

	/**
	 * Setter for currentItem
	 * @param currentItem
	 */
	public void setCurrentItem(int currentItem) 
	{
		this.currentItem = currentItem;
	}//end setCurrentItem

	/**
	 * Getter for ArList
	 * @return
	 */
	public T[] getArList() 
	{
		return arList;
	}//end getArList

	/**
	 * Setter for ArList
	 * @param arList
	 */
	public void setArList(T[] arList) 
	{
		this.arList = arList;
	}//end setArList

	/**
	 * Getter for DEFAULT_SIZE
	 * @return
	 */
	public int getDEFAULT_SIZE() 
	{
		return DEFAULT_SIZE;
	}//end getDEFAULT_SIZE

	@Override
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		
		for(int i=0; i<arList.length; i++)
			str.append(arList[i] + "\n");
		
		return str.toString();		
	}//end toString
  
}//end class
