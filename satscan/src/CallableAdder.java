import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public class CallableAdder implements Callable<List<Circles>> {
       double [][] finalGrid ; 
       ArrayList<Coordinates> centres;
       List<Coordinates> address;
       CallableAdder( double[][] finalGrid , ArrayList<Coordinates> centres, List<Coordinates> address)
       {
             this.finalGrid=finalGrid;
             this.centres = centres;             
             this.address = address ; 
       }          
       public List<Circles> call() throws Exception {
              // TODO Auto-generated method stub
//              //System.out.println(Thread.currentThread().getName()+" says : partial Sum for " + operand1 + " and "+ operand2+ " is "  +(operand1+operand2));
              return null;
       }
}