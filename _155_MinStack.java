/*
155. Min Stack
        Easy

        Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

        Implement the MinStack class:

            MinStack() initializes the stack object.
            void push(val) pushes the element val onto the stack.
            void pop() removes the element on the top of the stack.
            int top() gets the top element of the stack.
            int getMin() retrieves the minimum element in the stack.



        Example 1:

        Input
        ["MinStack","push","push","push","getMin","pop","top","getMin"]
        [[],[-2],[0],[-3],[],[],[],[]]

        Output
        [null,null,null,null,-3,null,0,-2]

        Explanation
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2



        Constraints:

            -231 <= val <= 231 - 1
            Methods pop, top and getMin operations will always be called on non-empty stacks.
            At most 3 * 104 calls will be made to push, pop, top, and getMin.


*/

class _155_MinStack {

    /** initialize your data structure here. */
    int[] stack;
    int index = -1;
    
    public MinStack() {
        stack = new int[10000];
    }
    
    public void push(int val) {
        index++;
        stack[index] = val;
    }
    
    public void pop() {
        if(index < 0) {
            System.out.println("stack underfloww");
        } else {
            index--;
        }        
    }
    
    public int top() {
        if(index < 0) {
            System.out.println("stack underfloww");
            return 0;
        } else {
            return stack[index];
        }
    }
    
    public int getMin() {
        int minElement = stack[0];
        for(int i=0; i<=index; i++) {
            if(stack[i] < minElement)
                minElement = stack[i];
        }
        return minElement;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */