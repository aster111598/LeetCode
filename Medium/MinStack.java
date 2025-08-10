package Medium;

/*  
題目: 建立一個stack包含push、pop、getTop、getMin等操作
思路: 主要stack和輔助stack紀錄最小值*/

/*
| 操作    | 主棧 stack        | 最小棧 minStack |
| ------- | ---------------- | ------------ |
| push(3) | \[3]             | \[3]         |
| push(5) | \[3, 5]          | \[3]         |
| push(2) | \[3, 5, 2]       | \[3, 2]      |
| push(2) | \[3, 5, 2, 2]    | \[3, 2, 2]   |
| push(4) | \[3, 5, 2, 2, 4] | \[3, 2, 2]   | */

import java.util.ArrayList;

public class MinStack {

    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        // 測試 push
        minStack.push(3);
        minStack.push(5);
        System.out.println("Min: " + minStack.getMin()); // 預期 3

        minStack.push(2);
        minStack.push(2);
        System.out.println("Min: " + minStack.getMin()); // 預期 2

        // 測試 pop
        minStack.pop(); // 移除一個 2
        System.out.println("Min after pop: " + minStack.getMin()); // 預期 2

        minStack.pop(); // 再移除一個 2
        System.out.println("Min after pop: " + minStack.getMin()); // 預期 3

        // 測試 top
        System.out.println("Top: " + minStack.top()); // 預期 5
    }

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    /*
     * 把元素推入主棧stack
     * 如果 minStack 為空，或這個新元素 小於等於 minStack 的頂部值，則把它也推入 minStack。
     * 為什麼是「<=」？
     * 因為可能會有重複的最小值，必須都記錄進去，避免 Pop 時丟失正確的最小值。 by GPT
     */
    public void push(int val) {
        stack.add(val);
        // can not reverse this conditional expressions, or it will out of bound.
        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }
    }

    /*
     * if main stack pop up the smallest value, minStack need pop it too.
     */
    public void pop() {
        if (stack.isEmpty()) {
            // jump out the method.
            return;
        }
        int removed = stack.remove(stack.size() - 1);
        if (removed == minStack.get(minStack.size() - 1)) {
            minStack.remove(minStack.size() - 1);
        }
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
