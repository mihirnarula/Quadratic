package quadratic;
import java.util.*;
public class Quadratic {

    String str; 
    String str2;
    int a;
    int b;
    int c;
    
    
    void input(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number of the quadratic eqation: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number of the quadratic eqation: ");
        b = sc.nextInt();
        System.out.print("Enter 3rd number of the quadratic eqation: ");
        c = sc.nextInt();
            
    }
    
    void calc(){
        
        int x1 =(int) (b + Math.sqrt(b*b - 4*a*c)) / (2 * a);
        int x2 = (int)(b - Math.sqrt(b*b - 4*a*c)) / (2 * a);
        
        if(x1 == x2)
            System.out.println("The root is: " + x1);
        else
            System.out.println("The roots are: " + x1 + " and " + x2);
    }
            
    
    public static void main(String[] args) {
        
        Quadratic ob = new Quadratic();
        ob.input();
        ob.calc();
               
    }
    
}
