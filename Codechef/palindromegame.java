/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import static java.lang.System.in;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gaurav
 */
public class PalindromeGame {
    public static String solve( String s1, String s2){
      HashMap<Character,Integer> hm1 = new HashMap<Character, Integer>();
      HashMap<Character,Integer> hm2 = new HashMap<Character, Integer>();
      for(int i = 0; i < s1.length(); i++){
          if(hm1.containsKey(s1.charAt(i))){
              int value1 = hm1.get(s1.charAt(i));
              hm1.put(s1.charAt(i),++value1);
          }
          else hm1.put(s1.charAt(i),1);
      }
      for(int i = 0; i < s2.length(); i++){
          if(hm2.containsKey(s2.charAt(i))){
              int value2 = hm2.get(s2.charAt(i));
              hm2.put(s2.charAt(i),++value2);
          }
          else hm2.put(s2.charAt(i),1);
      }
      
     
    
      
      boolean tt=false;
      for(Map.Entry<Character, Integer> entry : hm2.entrySet()){
          char c = entry.getKey();
          int t = hm2.get(c);
          //System.out.println("here1");
           tt = false;
          if (hm1.containsKey(c)){
             // System.out.println(c);
              tt = true;
              continue;
          }
          else
              break;
              
      }
      
      for(Map.Entry<Character, Integer> entry : hm1.entrySet()){
          char c = entry.getKey();
          int t = hm1.get(c);
         // System.out.println(tt);
          if ((t >= 2 && !(hm2.containsKey(c))) || (!(hm2.containsKey(c)) && tt==true)){
              //System.out.println(c+" "+t);
              return "A";
              
          }
      }
    return "B";
      
  }
    
    
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < num ; i++){
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(solve(s1,s2));
}
    }
   
    
}
    

