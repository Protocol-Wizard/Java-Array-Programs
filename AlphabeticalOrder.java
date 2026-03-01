import java.util.Scanner;
public class AlphabeticalOrder{ 
    public static void main(String[] args){ 
	int count; 
	String temp;
	Scanner c = new Scanner(System.in);
	System.out.print("Enter the number of strings you want to enter: "); 
	count = c.nextInt(); 
	String str[] = new String[count];
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the strings one by one:- "); 
	for(int i=0;i<count;i++){
	    str[i] = s.nextLine(); 
            }
	for(int i=0;i<count;i++){ 
            for(int j=i+1;j<count;j++){
                if(str[i].compareTo(str[j])>0){ 
	            temp = str[i];
	            str[i] = str[j];
	            str[j] = temp;
	            } 
	        } 
	    }
	for(int i=0;i<=count-1;i++){
	    System.out.print(str[i] + " ");
	}
    }
}