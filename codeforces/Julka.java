/*
** SPOJ PROBLEM JULKA-julka
** Link: http://www.spoj.com/problems/JULKA/
**
@author Gaurav Anand
**
*/

import java.util.*;                          // for Scanner operations
             
import java.math.BigInteger;                // for BigInteger operations

class Julka{
    
 public static void main (String[] args) {
    /* code */
    
    Scanner sc = new Scanner(System.in);
    int a = 10;
    while(a-- > 0){
        String totApples = sc.next();                       // total apples
        String diffApples = sc.next();                      // difference of apples
        BigInteger total = new BigInteger(totApples);
        BigInteger diff = new BigInteger(diffApples);
        BigInteger rem = total.remainder(new BigInteger("2"));
        total = total.divide(new BigInteger("2"));
        diff = diff.divide(new BigInteger("2"));
        
        if(rem.equals(new BigInteger("0")) )                // when num(apples) is even
          {
              System.out.println(total.add(diff));
              System.out.println(total.subtract(diff));
          }
          else{                                             // when num(apples) is odd
              
              System.out.println(total.add(diff.add(new BigInteger("1"))));
              System.out.println(total.subtract(diff));
          }
      }           // loop ends
   }            // main ends
}            // class ends