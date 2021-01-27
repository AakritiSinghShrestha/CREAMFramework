package com.codedifferently.collections.SetTest;

import com.codedifferently.collections.concreteClass.UnsortedSet;

import org.junit.Assert;
import org.junit.Test;

public class SetTests 
{
    @Test
    public void addTest()
    {
        //Given
        Object N = 5;
        UnsortedSet set = new UnsortedSet();
        //When 
        set.add(N);
        Object expected = 5;
        Object actual= set.container[0];
        //Then
        Assert.assertEquals(expected, actual);
    } 
    @Test
    public void addTest2()
    {
         //Given
         Object N = 5;
         Object M = 10;
         UnsortedSet set = new UnsortedSet();
         //When 
         set.add(N);
         set.add(M);
         Object expected = 10;
         Object actual= set.container[1];
         //Then
         Assert.assertEquals(expected, actual);
    }


    @Test
    public void sizeTest()
    {
        //given 
        Object N = 5; 
        UnsortedSet set = new UnsortedSet();
        set.add(N);
        set.add(N);
        //when 
        Integer actual = set.size();
        Integer expected = 2;
        //then
        Assert.assertEquals(expected, actual);
    }   
    @Test
    public void removeTest()
    {
        //Given
        Object N =5;
        Object M = 10;
        UnsortedSet set = new UnsortedSet();
        set.add(N);
        set.add(M);
        //When 
        set.remove(M);
        Integer expected = 1;
        Integer actual = set.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void containsTest()
    {
        //Given
        Object N = 15;
        Object M = 10;
        UnsortedSet set = new UnsortedSet();
        set.add(N); 
         //When
        Boolean actual = false;
        Boolean expected = set.contains(M);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void cointainsTest2()
    {
        //Given
        Object N = 15; 
        UnsortedSet set = new UnsortedSet();
        set.add(N);
        //When 
        Boolean actual = set.contains(N);
        Boolean expected = true;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void clearTest()
    {
        //Given
        Object N = 5;
        Object M = 10;
        Object O = 15; 
        Object P = 20; 
        Object Q = 25;
        UnsortedSet set  = new UnsortedSet();
        set.add(N);
        set.add(M);
        set.add(O);
        set.add(P);
        set.add(Q);
        //When 
        set.clear();
        Object expected = 0 ; 
        Object actual = set.size() + 1;
        //Then
        Assert.assertEquals(expected, actual);

    }
}
