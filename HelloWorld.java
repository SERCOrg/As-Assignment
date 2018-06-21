public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Benjamin");
		addTwoNumbers(2345, 4);
		getAreaOfCircle(21);
		getCircumferenceOfCircle(10);	
		multiply(57, 145);
		whoIsTheBestLookingPerson("Karen", "David");
	}
	
	public static void addTwoNumbers(int first, int second){
		int result = first + second;
		System.out.println("First number plus second number = " + result);
		
	}
	
	public static void getAreaOfCircle(int radius){
		double result = (radius * radius) * 3.14; 
		System.out.println("The area of your circle = " + result);
		
	}
	

	public static void getCircumferenceOfCircle(int diameter){
		double result = diameter * 3.14;
		System.out.println("The Circumference of your circle = " + result);
		
	}
	
	public static void multiply(int first, int second){
		int result = first * second;
		System.out.println("First number times second number = " + result);
		
	}
	
	public static void whoIsTheBestLookingPerson(String name1, String name2){
		int firstPersonRank = 0;
		int secondPersonRank = 0;
		if(name1.equals("David")){
			firstPersonRank = 1;
		}
		if(name1.equals("Benjamin")){
			firstPersonRank = 3;
		}
		if(name1.equals("Karen")){
			firstPersonRank = 2;
		}
		
		if(name2.equals("David")){
			secondPersonRank = 1;
		}
		if(name2.equals("Benjamin")){
			secondPersonRank = 3;
		}
		if(name2.equals("Karen")){
			secondPersonRank = 2;
		}
		
		if(firstPersonRank > secondPersonRank){
			System.out.println(name1 + " is more beautiful than " + name2);
		}else{
			System.out.println(name1 + " is ugly!!!!!");
		}
	}

}
