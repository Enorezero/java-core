package org.example;

import java.util.ArrayList;

public class FixedArray<E> {
    private ArrayList<E> items;
    private final int MAX_SIZE = 10;

    public FixedArray() {
        items = new ArrayList<E>();
    }

    public void add(E item) {
        if(items.size() < MAX_SIZE){
            items.add(item);
        }
        else{
            throw new ExceedMaxSizeException("Limit is exceed");
        }
    }

    public void remove(E item){
        if(items.isEmpty()){
            throw new EmptyArrayException("Array is empty");
        }
        items.remove(item);
    }

    public boolean find(E value){
        if(items.isEmpty()){
            throw new EmptyArrayException("Array is empty");
        }
        for(E item : items){
            if(item == items){
                return true;
            }
        }
        return false;
    }




}
