import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 *
 * @author MFisher
 */

class Task implements Callable<String> {
    int a ; 
    int b ;
	public Task(int a1,int b1) {
		this.a=a1;
		this.b = b1;
	}
	public String call() throws Exception {
        int val = a + b;
		String res = "  " + val + "  ";
        return res;
    }
}




public class Threads_03_02 {

    /**
     * @param args the command line arguments
     */
	
	public static List<Integer> processInputs(int len)
	        throws InterruptedException, ExecutionException {

	    Integer threads = Runtime.getRuntime().availableProcessors();
	    ExecutorService service = Executors.newFixedThreadPool(threads);

	    List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
	    for (int i = 0 ; i < len ; i++) {
	        Callable<Integer> callable = new Callable<Integer>() {
	            public Integer call() throws Exception {
	                Integer output = 1;
	                output *= 100 ; 
	                // process your input here and compute the output
	                return output;
	            }
	        };
	        futures.add(service.submit(callable));
	    }

	    service.shutdown();

	    List<Integer> outputs = new ArrayList<Integer>();
	    for (Future<Integer> future : futures) {
	        outputs.add(future.get());
	    }
	    return outputs;
	}
    /*public static void main(String[] args) throws InterruptedException, ExecutionException {
    	//System.out.println(Runtime.getRuntime().availableProcessors());//creating a pool of 5 threads  
    	List<Integer> output = processInputs(100);
    	for(Integer i : output){
    		System.out.println(i);
    	}
    	/*
         ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new WorkerThread("I'm thread " + i);  
            //calling execute method of ExecutorService
            executor.execute(worker);  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {  
        	//System.out.println("hagefu");
        }  
  
        System.out.println("Finished all threads");  
  	*/
    }
    
    

    
    