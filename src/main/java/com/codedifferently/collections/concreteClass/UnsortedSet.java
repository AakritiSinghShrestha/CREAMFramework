package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.Set;

public class UnsortedSet implements Set
{
      public Object[] container = new Object[20];
         private int count = 0 ;

    public int search(Object element)
    {
        for (int i = 0; i < container.length; i++) 
        {
            if (container[i] == element) 
            {
                return i;    
            }    
        }
            return -1;
    }
    @Override
    public boolean add(Object N) {
        //check if element exist in array 
        if (search(N) == -1 || count == 0) 
        {
            container[count] = N;
            count++;   
            return true; 
        }
        //if it doesn't then add it and increment size 
        //else return false 
        return false;
    }

    @Override
    public int size() {
        return count-1;
    }

    @Override
    public void remove(Object element) {
        // TODO Auto-generated method stub

        //find the index 
        int elementsIndex = search(element);
        //overwrite the index with the next index 
        for (int i = elementsIndex; i < size(); i++) 
        {
            // set the container at that particular index to the next element
            // the next index equal to the element after that. 
            container[i] = container[i + 1];
              //repeat untill all elements are moved over
        }
        //correct the size
        
      
        
    }

    @Override
    public boolean contains(Object N) {
        //search through the container
        for (int i = 0; i < count; i++) 
        {
            //if found return true 
            if (search(N)!= -1) 
            {
                return true;    
            }
        //else return false
        } 
        
        return false;
    }

    @Override
    public void clear() {
        //go through set untill all items are null 
        for (int i = 0; i < container.length; i++)
        {
            container[i]= null;
        }
        //reset the size
        count =0;
    }
        
}
