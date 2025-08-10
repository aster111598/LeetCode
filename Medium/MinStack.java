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
    public static void main(String[] args) {

    }

    public MinStack() {

    }

    /*
     * 把元素推入主棧。
     * 如果 minStack 為空，或這個新元素 小於等於 minStack 的頂部值，則把它也推入 minStack。
     * 為什麼是「小於等於」？
     * 因為可能會有重複的最小值，必須都記錄進去，避免 Pop 時丟失正確的最小值。
     */
    public void push(int val) {

    }

    public void pop() {

    }

    public int top() {

    }

    public int getMin() {

    }
}
