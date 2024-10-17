package data_structures;

import java.util.Stack;

public class App {
  
  public static void main(String[] args){
    
    // Stack = LIFO data structure. Last In First Out
    //         stores objects into a sort of "vertical tower"
    //         push() to add to the top
    
    Stack<String> stack = new Stack<>();
    
    // System.out.println(stack.empty());
    
    stack.push("Minecraft");
    stack.push("Skyrim");
    stack.push("Doom");
    stack.push("Borderlands");
    stack.push("FFVII");
    
    // String myFavGame = stack.pop();
    // System.out.println(stack.peek());
    // System.out.println(stack.search("Fallout76"));
    
    System.out.println(stack);
    // System.out.println(myFavGame);
    
    // for (int i = 0; i < 1000000000; i++){
    //   stack.push("Fallout76");
    // }
    
    // uses of Stacks?
    // 1. undo/remove features in text editors
    // 2. moving back/forward through a browser history
    // 3. backtracking algorithms (maze, file directories)
    // 4. calling functions (call stack)
  }
}
