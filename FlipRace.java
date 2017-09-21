# Lilltle-app pour JAVA
import java.awt.*;

public class FlipRace{
	public static void main(String[] args){
	int i;
	int a=0,b=0;
	int x,y;
	Coin coin1=new Coin(),coin2=new Coin();
	for(i=0;i<50;i++){
		
		  if(coin1.setFace()==0)
			a++;
		  else a=0;
		
		 if(coin2.setFace()==0)
			b++;
		  else b=0;
		
             		  
		  System.out.println("第"+(i+1)+"次");
		  System.out.println("Coin1:"+coin1.toString());
		 
		  System.out.println("正面次数:"+a);
		  System.out.println("Coin2:"+coin2.toString());
		  coin2.toString();
		  System.out.println("正面次数:"+b); 
		  if(a==3||b==3)
			  break;
		  
	}
	if(a==3)
		System.out.println("1 win");
	if(b==3)
		System.out.println("2 win");
	if(i==50)
		System.out.println("non");
  }
		
}
class Coin {	
        private final int HEADS=0;	
        private final int TAILS=1;    
        private int face;
        public Coin()
        {  face=HEADS;
		} 
        public  int setFace() 
        {  
		  face =(int)(1+Math.random()*10);	
		   if(face<6)
			   face=HEADS;
		   else
			   face=TAILS;
			   return face;
		}   
        public  void  getFace() 
        {  
		      
		}    
        public String toString()
        { 
           if(face==0)
               return  "正面";
           else
			  return  "反面";
		}  
}
