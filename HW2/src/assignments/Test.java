package assignments;

public class Test{ 

   public static void main(String[] args) {
    	   String[] employee = new String[]{"1,John,24,7500", "2,Hail,28,7899.90","3,Shirley1,23,0"};
    	   Employee[] newEmployee = assignment.createEmployees(employee);   	   
    	   System.out.println(assignment.salaryGreaterThanFiveThousand(newEmployee));
    	   assignment.fizzBuzz(newEmployee[2]);
    	   System.out.println(assignment.calculateTax(newEmployee[1]));
    	  
    	   assignment.swap(newEmployee[0], newEmployee[1]);
    	   
    	   
    	   System.out.println(assignment.calculateTax(newEmployee[1]));
    	   assignment.reverseFirstName(newEmployee[0]);
    	   System.out.println(newEmployee[0].getFirstName());
    	   assignment.isContainDigit(newEmployee[2]);
    	   assignment.tripleSalary(newEmployee[2]);
  } 
}

