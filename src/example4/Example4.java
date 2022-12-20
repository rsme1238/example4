
package example4;

import java.util.Scanner;


public class Example4 {

   
    public static void main(String[] args) {
       
           Scanner input = new Scanner(System.in);
        
            System.out.println("luften eleman sayisini giriniz ");
            
            int N =input.nextInt();
            
            int [] a=new int[N];
            int [] b=new int [N];
            int [] c= new int [N];
            
            int x=0;
            int y=0;
            
            for (int i=0; i <N; i++) {
                
                System.out.println("A dizsinin "+ (i+1)+ "inci elman");
                a[i] = input.nextInt();
            
            
            }
            
            for (int i=0; i<N; i++){
                
                if (a[i]!=0){
                    
                    
                    
                    if (a[i]>0){
                    
                        x+=1;
                        
                        b[x]=a[i];
                        
                        System.out.println("B dizisi" +b[x]);
                        
                    }
                    
                    else{
                   
                    
                        y+=1;
                        c[y]=a[i];
                        System.out.println("C dizisi" + c[y]);
                    }
                }
            }
    }
    
}
