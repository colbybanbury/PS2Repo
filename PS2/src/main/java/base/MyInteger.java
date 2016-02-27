package base;

public class MyInteger {
	private int iValue;
	MyInteger(int val){
		iValue = val;
		
	}
	
	public void set(int iVal){
		iValue = iVal;
	}
	
	public int get(){
		return(iValue);
	}
	
	public boolean isEven(){
		int val = iValue;
		if (val%2==0){
			return(true);
		}
		else{
			return(false);
		}
	}
	
	public boolean isOdd(){
		int val = iValue;
		if (val%2!=0){
			return(true);
		}
		else{
			return(false);
		}
	}
	
	public boolean isPrime(){
		int val = iValue;
		boolean check = true;
		
		if(val==1){
			check=true;
		}
		
		for(int i = 1; i< val; i++){
			if (((val%i)==0) & (i!=1)){
				check=false;
				break;
			}
		}
		return(check);
	}
	
	public boolean isEven(int Val){
		int val = Val;
		if (val%2==0){
			return(true);
		}
		else{
			return(false);
		}
	}
	public boolean isOdd(int Val){
		int val = Val;
		if (val%2!=0){
			return(true);
		}
		else{
			return(false);
		}
	}
	public boolean isPrime(int Val){
		int val = Val;
		boolean check = true;
		
		if(val==1){
			check=true;
		}
		
		for(int i = 1; i< val; i++){
			if (((val%i)==0) & (i!=1)){
				check=false;
				break;
			}
		}
		return(check);
	}
	
	public boolean isEven(MyInteger myint){
		int val = myint.get();
		if (val%2==0){
			return(true);
		}
		else{
			return(false);
		}
	}
	public boolean isOdd(MyInteger myint){
		int val = myint.get();
		if (val%2!=0){
			return(true);
		}
		else{
			return(false);
		}
	}
	public boolean isPrime(MyInteger myint){
		int val = myint.get();
		boolean check = true;
		
		if(val==1){
			check=true;
		}
		
		for(int i = 1; i< val; i++){
			if (((val%i)==0) & (i!=1)){
				check=false;
				break;
			}
		}
		return(check);
	}
	
	public boolean equals(int Val){
		int val = Val;
		
		if (val==iValue){
			return(true);
		}
		else{
			return(false);
		}
	}
	
	public boolean equals(MyInteger myint){
		int val = myint.get();
		
		if (val==iValue){
			return(true);
		}
		else{
			return(false);
		}
	}
	
	
}
