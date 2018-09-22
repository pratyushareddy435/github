class Dice1

{

int x,y,z;

Dice1(int a,int b,int c)

 {
 
  this.x = a;
 
  this.y = b;
  this.z=c;
  
 }

 int sum()

 {

 int s=x+y+z;

 return s;

 }
 
}
 
public class Dice

 {
  
public static void main(String[] args)
  
 {
  
 int p=0;
 
  int c=0;
  
 while(p!=7)
 
  {
 
   int r = (int)(Math.random() * ( 5 + 1 )) + 1;
    
int r1 = (int)(Math.random() * ( 5 + 1 )) + 1;
int r2 = (int)(Math.random() * ( 5 + 1 )) + 1;
   
 System.out.println("task successel in tmes"+r+" and "+r1+" " +r2);
    
Dice1 d=new Dice1(r,r1,r2);
  
  p=d.sum();

    c++;
    
}
 
   System.out.println("task successel in tmes"+c);
   
 }
  
  }