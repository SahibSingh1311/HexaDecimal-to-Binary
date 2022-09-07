import java.util.*;

public class HexaToBin{
public static void main(String[] args){
	String s1 = "A9";
	
	toBinary(s1);
}
static int toDeci(String inp){
	int j=0;	//power 
	int out=0;
	for(int i=inp.length()-1;i>=0;i--){					//Reverse traversing of String so as to obtain characters from end.
	  		if(inp.charAt(i)>='0' && inp.charAt(i)<='9'){		//If character is between 0 & 9
				out += (inp.charAt(i)-48)*(Math.pow(16,j));  	//'-48' bcs its the ASCII code of 0
										//increment of power
			}
			else if(inp.charAt(i)>='A'&&inp.charAt(i)<='F'){	//If character is between 'A' & 'F'
				out += (inp.charAt(i)-55)*(Math.pow(16,j)); 	//'-55' bcs ASCII code of 'A' is 65 so to obtain 10 we will subtract it with 55
										//increment of power
			}
			else{
				System.out.println("Incorrect HexaDecimal Number"); //If incorrect HexaDecimal Number is passed	
				return 0;					// Return 0
			}
			j++;
	}
	System.out.println("Decimal Conversion is: "+out);
	return out;
}
static void toBinary(String inp){
	int dec = toDeci(inp);
	int[] binaryNo= new int[35];
	int id=0; 
		
	while(dec>0){
	binaryNo[id++] = dec%2;
	dec /=2;
	}
	for(int i=id-1;i>=0;i--)			//setting i=id-1 bcs its the index at which the last binary number is stored.
		System.out.print(binaryNo[i]);		//Reverse Printing of Array.
}

}
