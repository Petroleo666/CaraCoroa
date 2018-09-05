import java.util.Random;
 
public class CaraOuCoroa {
    public static void main(String[] args)
    {
        
        Random n = new Random(); 
        int resultado = n.nextInt(2); // o até 1
      
        if (resultado == 1){
            System.out.print("\n\n\tcara\n\n"); //true
        }else{
            System.out.print("\n\n\tcoroa\n\n"); //false
        }
    }
}