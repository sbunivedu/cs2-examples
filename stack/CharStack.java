// Implements a stack using an array.

public class CharStack{
  private final static int MAX_SIZE = 100;
  private char[] s;  // The array holding the stack.
  protected int top; // The location of the top element.

  public CharStack (){
    // POS: top == -1; empty stack
    // TAS: Initialize an empty stack.
    //      Create the array that will hold the
    //      stack and initialize top to -1.
      s = new char [MAX_SIZE];
      top = -1;
  }

  public void push (char element){
  // PRE: top < (MAX_SIZE - 1) && !full
  // POS: top <exit> == top <entry>+1 &&
  //      s[top<entry>+1] contains element
  // TAS: Increment top, then put element at top.
    top++;
    s[top] = element;
  }

  public char pop(){
  // PRE: top > -1
  // POS:
  // TAS: return element at top, then decrement top
    char result = s[top];
    return result;
  }

  public boolean isEmpty(){
    return true;
  }

  public int size(){
    return 0;
  }
}