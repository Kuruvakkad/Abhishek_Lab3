package com.gl.parenthesis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedBrackets {
	static boolean BracketsBalanced(String str)
    {
        
        Deque<Character> stack
            = new ArrayDeque<Character>();
  
        
        for (int i = 0; i < str.length(); i++) 
        {
            char x = str.charAt(i);
  
            if (x == '(' || x == '[' || x == '{') 
            {
                stack.push(x);
                continue;
            }
  
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
  
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
  
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
  
        
        return (stack.isEmpty());
    }
  

	public static void main(String[] args) {
		System.out.println("enter a parenthesis string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		  
        // Function call
        if (BracketsBalanced(str))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered String has not Balanced Brackets");

	}

}
