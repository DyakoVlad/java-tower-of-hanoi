import java.util.Stack;


public class HanoyTowers {
    public static void main(String[] args) {
        Stack <Integer> stack1 = new Stack<>();
        Stack <Integer> stack2 = new Stack<>();
        Stack <Integer> stack3 = new Stack<>();
        int n = 12;
        for(int i = 1; i < n+1; i++) {
            stack1.push(n+1-i);
        }

        while((!stack1.empty()) || (!stack2.empty())){
            if(n % 2 == 0){
                if (stack1.empty()){stack1.push(n+1);}
                if (stack2.empty()){stack2.push(n+1);}
                if (stack3.empty()){stack3.push(n+1);}
                if(stack1.peek() < stack2.peek()){
                    if (stack2.peek() == n+1){
                        stack2.pop();
                    }
                    stack2.push(stack1.peek());
                    stack1.pop();
                }
                else{
                    if (stack1.peek() == n+1){
                        stack1.pop();
                    }
                    stack1.push(stack2.peek());
                    stack2.pop();
                }
                if(stack1.peek() < stack3.peek()){
                    if (stack3.peek() == n+1){
                        stack3.pop();
                    }
                    stack3.push(stack1.peek());
                    stack1.pop();
                }
                else{
                    if (stack1.peek() == n+1){
                        stack1.pop();
                    }
                    stack1.push(stack3.peek());
                    stack3.pop();
                }
                if(stack3.empty() || (stack2.peek() < stack3.peek())){
                    stack3.push(stack2.peek());
                    stack2.pop();
                }
                else{
                    stack2.push(stack3.peek());
                    stack3.pop();
                }
            }
            else{
                if (stack1.empty()){stack1.push(n+1);}
                if (stack3.empty()){stack3.push(n+1);}
                if(stack1.peek() < stack3.peek()){
                    if (stack3.peek() == n+1){
                        stack3.pop();
                    }
                    stack3.push(stack1.peek());
                    stack1.pop();
                }
                else{
                    if (stack1.peek() == n+1){
                        stack1.pop();
                    }
                    stack1.push(stack3.peek());
                    stack3.pop();
                }
                if (stack1.empty() & !stack2.empty()){stack1.push(n+1);}
                if (stack2.empty() & !stack1.empty()){stack2.push(n+1);}
                if ((stack1.empty()) || (stack2.empty())){
                    break;
                }
                if(stack1.peek() < stack2.peek()){
                    if (stack2.peek() == n+1){
                        stack2.pop();
                    }
                    stack2.push(stack1.peek());
                    stack1.pop();
                }
                else{
                    if (stack1.peek() == n+1){
                        stack1.pop();
                    }
                    stack1.push(stack2.peek());
                    stack2.pop();
                }
                if (stack2.empty()){stack2.push(n+1);}
                if (stack3.empty()){stack3.push(n+1);}
                if(stack3.empty() || (stack2.peek() < stack3.peek())){
                    if (stack2.peek() == n+1){
                        stack2.pop();
                    }
                    stack3.push(stack2.peek());
                    stack2.pop();
                }
                else{
                    if (stack3.peek() == n+1){
                        stack3.pop();
                    }
                    stack2.push(stack3.peek());
                    stack3.pop();
                }
            }
        }
        System.out.println("Tower 1: " + stack1);
        System.out.println("Tower 2: " + stack2);
        System.out.println("Tower 3: " + stack3);
    }
}
