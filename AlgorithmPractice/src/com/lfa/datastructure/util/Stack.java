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
public class Stack {

    private int[] datas = new int[100];
    private int top = 0;

    public boolean push(int n) {
        if (top < datas.length) {
            datas[top] = n;
            top++;
            return true;
        }
        return false;
    }

    public int pop() {
        if (top < 0) {
            top = 0;
        }
        int value = datas[--top];
        return value;
    }

    public int[] all() {
        return datas;
    }
}
