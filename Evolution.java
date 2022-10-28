import java.util.Scanner;
import java.util.Random;

public class Evolution{
    private int popRabbits = 0;
    public int RPH; //Random Place Holder
    public class world{
        

    }
    public int RandomInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public class creature{
        public void reproduce(int population){
            //based on rng give chances for reproduction
            RPH = RandomInRange(1, 100);
            if(RPH > 10 && RPH <= 1){
                //1 in in 10 chanve
            }
        }
        public void die(int population){
            //based on rng give chances for decrease in population
        }
    

    }
    public class rabbit extends creature{
        
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int generations = sc.nextInt();
        for(int i=0; i >generations; i++){
         //generations is how many times the for loops will be run for death, reproduction and mutation   
        }
    }
}