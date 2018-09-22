class Dice

{

int x,y;

Dice(int a,int b)

 {
 
  this.x = a;
 
  this.y = b;
  
 }

 int sum()

 {

 int s=x+y;

 return s;

 }
 
}
 
public class Dice1

 {
  
public static void main(String[] args)
  
 {
  
 int p=0;
 
  int c=0;
  
 while(p!=7)
 
  {
 
   int r = (int)(Math.random() * ( 5 + 1 )) + 1;
    
int r1 = (int)(Math.random() * ( 5 + 1 )) + 1;
   
 System.out.println("task successel in tmes"+r+" and "+r1);
    
Dice d=new Dice(r,r1);
  
  p=d.sum();

    c++;
    
}
 
   System.out.println("task successel in tmes"+c);
   
 }
  
  }
    
    
    
    
     
    
     
 
  
