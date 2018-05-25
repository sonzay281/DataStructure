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
public class LinkedList {

    private LinkNode head;

    public void addFirst(int value) {
        if (head == null) {
            head = new LinkNode(value, null);
        }
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
        } else {
            LinkNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new LinkNode(value, null);
        }
    }

    public void addAfter(int afterValue, int value) {
        LinkNode node = head;
        while (node != null) {
            if (node.value == afterValue) {
                node.next = new LinkNode(value, node.next);
            }
            node = node.next;
        }
    }

    public void print() {
        LinkNode node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
