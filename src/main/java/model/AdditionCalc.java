package model;

public class AdditionCalc {

	// attributes
	private int num1;
	private int num2;
	private int num3;
	private int total;
	
	// constructors
	public AdditionCalc() {
		// default
		super();
	}
	
	public AdditionCalc(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		addNumbers(num1, num2, num3);
	}
	
	// getters and setters
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		addNumbers(num1, num2, num3);
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	// methods
	public void addNumbers(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		// add the numbers and set it equal to total
		total = num1 + num2 + num3;
	}

	@Override
	public String toString() {
		return "AdditionCalc [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
}
