/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author INT303
 */
public class StackUsingLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String y = new String("ABCD");
        Object x = y;

        List st = new LinkedList();
        LinkedList<Integer> stack = new LinkedList();
        for (int i = 0; i < 10; i++) {
            stack.push(new Integer(i));
        }
        System.out.println("Top -> " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("" + stack.pop() * 10);
        }
    }
}
