package com.codedifferently.collections.forMapTest;

import com.codedifferently.collections.Interface.Map;
import com.codedifferently.collections.concreteClass.HashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
    HashMap<String, String> testMeals;


    @Before
    public void setup(){
    //  String[] keys = {"breakfast", "lunch", "dinner"};
    //  String[] values ={"waffles", "sandwich", "pasta"};
       testMeals =new HashMap<>();
      // String key = "breakfast";
      // int index = hash(key); --> returns 0
      // values[index] = "waffles";

    }

    @Test
    public void testPut(){
    String actual = testMeals.put("breakfast", "waffles");
    Assert.assertEquals("waffles", actual);

    }

    @Test
    public void testGet(){
        testMeals.put("breakfast","waffles");
        String actual = testMeals.get("breakfast");
        Assert.assertEquals("waffles", actual);
    }

    @Test
    public void testSize() {
        testMeals.put("breakfast","waffles");
        int expected = 1;
        int actual = testMeals.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsKey(){
        testMeals.put("breakfast", "waffles");
        Assert.assertTrue(testMeals.containsKey("breakfast"));
    }

    @Test
    public void testRemove(){
        testMeals.put("breakfast", "waffles");
        testMeals.remove("breakfast");
        Assert.assertNull(testMeals.get("breakfast"));
    }

    @Test
    public void testGetIndex(){
        testMeals.put("breakfast", "waffles");
        int expected = testMeals.getIndex("breakfast");
        int actual = testMeals.getIndex("breakfast");
        Assert.assertEquals(expected, actual);

    }
}
