package ia;
//here we cretaed package as ia which that organizes a set of related classes and interfaces.
public class ExcemptionD {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		PermanentEmp pe= new PermanentEmp(84,"Videhi",10,25000.00);

		System.out.println("permanent employee detail");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is message.

		/* calling id,name,no of TotalLeaves */

		System.out.println("Id  =" + pe.empId);

		System.out.println("name =" + pe.empName);

		System.out.println("leave =" + pe.TotalLeaves);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is message.

		/* calling the method */

		pe.calculate_balanceLeaves();
//calculate the balances leaves and available leaves
		pe.avail_leave(10, (char)0);
//
		pe.calculate_salary();
//calculate the salary
		System.out.println("..................................");



		//Creating object of the permanentEmp and passing the arguments

		TemporaryEmp te= new TemporaryEmp(987,"Ankit",10,18000.00);

		System.out.println("Temprory employee detail");

		/* calling id,name,no of TotalLeaves */

		System.out.println("Id  =" + te.empId);

		System.out.println("name =" + te.empName);

		System.out.println("leave =" + te.TotalLeaves);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is message.

		/* calling the method */

		te.calculate_balanceLeaves();
		
		te.avail_leave(17, (char)0);

		te.calculate_salary();



	}




	}

