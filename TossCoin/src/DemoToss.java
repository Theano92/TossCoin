
public class DemoToss {
	final static int NUMOFTOSS = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		long coin ;
		int headToss = 0;
		int tailToss = 0;
	    Toss t1 = new Toss();
	    
	    for(int i = 0; i<NUMOFTOSS; i++) {
	    	coin = Math.round(Math.random())  ;
	    	
	    	if(coin == 0) {
	    		 headToss = t1.headToss();
	    	}
	    	
	    	else {
	    		 tailToss =  t1.tailToss();
	    	}
	    	
	    }
	    System.out.println("Number of heads:"+headToss + " Number of tails:"+tailToss);
		

	}

}
