/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.datastructure.util;

/**
 *
 * @author ZERO BYTE
 */
public class Node {
    public int value;
    public Node left,right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
}
