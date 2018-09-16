/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author subeg
 */
public class Stack {

    private List<String> list = new ArrayList<String>();
    private int pointer =  -1;
    private int size=pointer;
   

    public void push(String item) {
        list.add(item);
        pointer++;
        size++;
    }

    public String pop() {

        if (pointer > -1) {
            String item = list.remove(pointer);
            pointer--;
            size--;
            return item;
        } else {
            return "n";
        }

    }
}
