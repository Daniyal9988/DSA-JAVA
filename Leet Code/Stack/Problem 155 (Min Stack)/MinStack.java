import java.util.EmptyStackException;

 class MinStack {
    private List<int[]> st;
    private int min;

    public MinStack() {
        st = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        min = Math.min(min,val);
        st.add(new int []{val,min});
    }
    
    public void pop() {
        if(!st.isEmpty())
        {
            st.remove(st.size()-1);
            min = st.isEmpty() ? Integer.MAX_VALUE : st.get(st.size()-1)[1];
        }
    }
    
    public int top() {
        if(!st.isEmpty())
        {
            return st.get(st.size()-1)[0];
        }
        throw new EmptyStackException ();
    }
    
    public int getMin() {
         if (!st.isEmpty()) {
            return min; 
        }
        throw new EmptyStackException();
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