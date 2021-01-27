package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.Map;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.hash;


public class HashMap<K,V>  implements Map<K,V> {
 Node<K,V>[] table = new Node[100];
 int count = 0;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        for(int i=0; i<table.length; i++){
            if(table[i]!=null && table[i].key.equals(key)){
            return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(K key) {
        int index =hash(key);
        index = (20) & index;
        return table[index].value;
    }



    @Override
    public V remove(K key) {
       V value = get(key);
       put(key, null);
       count--;
       return value;

    }

    public int getIndex(K key){
        int index = hash(key);
        return index;

}
    @Override
    public V put(K key, V value) {
        Node<K,V> newNode = new Node<>(key,value);
        int index =hash(key);
        index = (20) & index;
        table[index] = newNode;
        count++;
        return value;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {

    }


    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>>16);
    }



    static class Node<K,V>{
        final K key;
        V value;
        Node<K, V> next;
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }


}
