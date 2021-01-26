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
        Object actual= set.container;
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
        //When 
        //Then
    }
    @Test
    public void containsTest()
    {
        //Given 
        //When
        //Then

    }
    @Test
    public void clearTest()
    {
        //Given
        //When 
        //Then
    }
}
