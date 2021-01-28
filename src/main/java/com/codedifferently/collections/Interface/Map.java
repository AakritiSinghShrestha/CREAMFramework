package com.codedifferently.collections.Interface;

public interface Map<K,V> {
    public V get(K key);
    public V put(K key, V value);
    public int size();
    public boolean containsKey(K Key);
    public boolean containsValue(V Value);
    public boolean isEmpty();
    public V remove(K key);
    public void clear();

}
