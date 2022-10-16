import java.util.Random;
public class ex2 {
    public static void main(String[] args) {
        int[]arr = new int[5]; 
        Random rnd=new Random();
        for(int i=0; i<arr.length;i++){
            arr[i]=rnd.nextInt();
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
    
  
  
}
