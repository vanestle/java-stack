public class TugasStack {
    
    final int maxData = 10;
    int top;
    String [] stack = new String [maxData];
    
    public TugasStack(){
        top = 0;
    }
    
    public void push (String data){
        
        if (top==maxData) {
            System.out.println("Stack is full");
        }
        else{
            top++;
            stack [maxData - top] = data;
        }
        
    }
    
    public boolean empty(){
       return top==0; 
    }
    
    public String pop(){
        String data = null;
        if (!empty()) {
           for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                data = stack[i];
                stack[i] = null;
                break;
            }  
        }
        top--;
        return data; 
        }
        else{
            return "Stack is empty";
        }
    }
    
    public void infoStack(){
        for (int i = 0; i < stack.length; i++) {
            System.out.println(stack[i]);    
        }
    }
}
