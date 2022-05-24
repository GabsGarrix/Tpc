package com.ronaldogabriela;

import java.util.ArrayList;
import java.util.List;

public class nameStack {
    private List<String> stack;
    private int count;
    nameStack(){
        this.stack = new ArrayList<String>();
    }

    public void push(String name){
      this.stack.add(name);
      count++;

    }
    public String pop(){
        return this.stack.remove(count);



    }
    public String size(){
        return String.valueOf(stack.size()) ;
    }
    public boolean isEmpty(){
        return stack.isEmpty();


    }
    public String push() {
        String current = null;
        for (int i = 0; i < stack.size(); i++) {
            current = stack.get(i);

        }
        return current;
    }

}
