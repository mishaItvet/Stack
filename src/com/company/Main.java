package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //add top
        stack.push("Messi");
        stack.push("Ronaldo");
        stack.push("Ronaldinho");
        stack.push("Zidane");
        stack.push("Pele");

        System.out.println(stack);

        //delete top
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search("Kaka"));

    }
}
