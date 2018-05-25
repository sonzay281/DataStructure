/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.datastructure;

import com.lfa.datastructure.util.BinaryTree;
import com.lfa.datastructure.util.LinkedList;

/**
 *
 * @author ZERO BYTE
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(12);
        list.addLast(9);
        list.addAfter(12, 15);
        list.addAfter(15, 34);
        list.print();
        System.out.println("************ Binary Tree Part ***********\n");

        BinaryTree tree = new BinaryTree();
        tree.add(20);
        tree.add(22);
        tree.add(19);
        tree.add(25);
        tree.add(7);
        tree.print();

    }

}
