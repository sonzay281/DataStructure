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
public class BinaryTree {

    private Node root;

    private Node addRecursive(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }
        if (node.value > value) {
            node.left = addRecursive(value, node.left);
            System.out.println("Left detected " + node.value + " of " + value);
        } else {
            node.right = addRecursive(value, node.right);
            System.out.println("Right detected " + node.value + " of " + value);
        }

        return node;
    }

    public void add(int value) {
        root = addRecursive(value, root);
    }

    private void traverseOrder(Node node) {

        if (node != null) {
            traverseOrder(node.left);
            System.out.println(node.value);
            traverseOrder(node.right);
        }
    }

    public void print() {
        traverseOrder(root);

    }
}
