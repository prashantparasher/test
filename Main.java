/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		new Main().addString("*|%\n1*2%3");
	}
	
	void addString(String nbrString){
	    int sum = 0 ;
	   // if (nbrString != null && !nbrString.equals("")){
	    String [] nbrArray = nbrString.split("[;|\n|*|%]+");
	    
	    
	    for(int i=0;i<nbrArray.length;i++){
	        int nbr = Integer.parseInt(nbrArray[i]);
	        if(nbr<1000){
	            sum = sum + Integer.parseInt(nbrArray[i]);
	        }
	        
	    //}
	    }
	    System.out.println(sum);
	}
}
