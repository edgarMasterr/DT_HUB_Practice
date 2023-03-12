package student.com;

public class Arithmetic {
	
	
	public int addOperation (int numberOne, int numberTwo) {
		
		int addResult = numberOne + numberTwo;
		return addResult;
	}
	
	public int subsOperation (int numberOne, int numberTwo) {
		
		
		int subsResult = numberOne - numberTwo;
		return subsResult;			
	}
	
	public int multOperation (int numberOne, int numberTwo) {
		
		int multOperation = numberOne * numberTwo;
		return multOperation;
	}
	
	public int divOperation (int numberOne, int numberTwo) {
		
		int divOperation = numberOne/numberTwo;
		return divOperation;
	}
	
	public void assigmentOne(int numberOne, int numberTwo) {

		int firstNumber = numberOne;
		int secondNumber = numberTwo;
		
		int result01 = this.addOperation(firstNumber, secondNumber);
		int result02 = this.addOperation(result01, secondNumber);
		int result03 = this.subsOperation(result02, secondNumber);
		int result04 = this.multOperation(result03, secondNumber);
		int result05 = this.divOperation(result04, secondNumber);
		
		System.out.println("****This is the assigment 1****");
		System.out.println("(((10+2)+2)-2)*2)/2");
		System.out.println("The result of the operation is " + result05);
	}
	
	public void assigmentTwo(int numberOne, int numberTwo) {
		int firstNumber = numberOne;
		int secondNumber = numberTwo;
		
		int result01 = this.divOperation(firstNumber, secondNumber);
		int result02 = this.subsOperation(result01, numberTwo);
		int result03 = this.addOperation(result02, numberTwo);
		int result04 = this.subsOperation(result03, numberTwo);
		int result05 = this.multOperation(result04, numberTwo);
		
		System.out.println("****This is the assigment 2****");
		System.out.println("(((10/2)-2)+2)-2)*2");
		System.out.println("The result of the operation is " + result05);
	}
	
	public static void main(String[] args) {
		
		Arithmetic mathOperation = new Arithmetic();
		
		mathOperation.assigmentOne(10, 2);
		mathOperation.assigmentTwo(10, 2);
		
	}

}
