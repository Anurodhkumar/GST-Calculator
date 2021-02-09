import java.util.Scanner; 
public class Main
{
    static void printOutputs(String string[]) {
        System.out.println("\nYou have entered: ");
        float totalValue = 0;
        float salestax = 0;
	    for(String str: string)   
	    {  
	        System.out.println(str.replace("at",":"));
	        String[] price = str.split("at ",2);
            float val=Float.parseFloat(price[1]);
            totalValue = totalValue + val;
	        if (!(str.contains("book") || str.contains("pills") || str.contains("chocolates"))){
	    	    if(str.contains("imported")){
	    	       salestax +=  0.05 * val;
	    	       salestax +=  0.1 * val;
	    	    }
	    	    else{
	    	       salestax +=  0.1 * val;
	    	    }
	    	}
	    } 
	    System.out.println("Sales Taxes: "+salestax);
	    System.out.println("Total: "+totalValue);
	    
    }
    
    static void takeInputs() {
    Scanner sc = new Scanner(System.in);  
	    System.out.print("Please enter the number of strings you want to enter: ");            
	    String[] string = new String [sc.nextInt()];      
	    sc.nextLine();   
	    for (int i = 0; i < string.length; i++)   
	    {  
	    	string[i] = sc.nextLine(); 
	    }  
	    Main myOutput = new Main();    
	    myOutput.printOutputs(string);
    }
	public static void main(String[] args) {
		takeInputs();
    }
}
