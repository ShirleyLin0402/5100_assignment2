package assignments;

import java.util.Arrays;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class assignment {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public static double salaryGreaterThanFiveThousand(Employee[] employees) {
        // @TODO
    	double sum = 0.0 ;
    	for (int i = 0; i < employees.length ; i++) {
    		if(employees[i].getSalary() > 5000) {
    			sum = sum + employees[i].getSalary();
    		}
    	}
        return sum;
    }

    
    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public static void fizzBuzz(Employee employee) {
        // @TODO
    	if(employee.getId() % 3 == 0 && employee.getId() % 5 == 0) {
    		System.out.println("FizzBuzz");
    	}
    	else if (employee.getId() % 3 == 0) {
    		System.out.println("Fizz");
    	}
    	else if(employee.getId() % 5 == 0) {
    		System.out.println("Buzz");
    	}
    }

    
    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public static double calculateTax(Employee employee) {
        // @TODO
    	double tax = 0.0;
    	if (employee.getSalary() <= 2500) {
    		tax = 0.1 * employee.getSalary();
    	
    	}else if( employee.getSalary() > 2500 && employee.getSalary() <= 5000) {
    		tax = 0.25 *  employee.getSalary();
    	
    	}else if(  employee.getSalary() > 5000) {
    		tax = 0.35 *  employee.getSalary();
    	}
    		
        return tax;
    }
    
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public static void swap(Employee firstEmployee, Employee secondEmployee) {
        // @TODO
    	double temp = firstEmployee.getSalary();
    	firstEmployee.setSalary(secondEmployee.getSalary());
    	secondEmployee.setSalary(temp);
    	
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public static int employeesAgeGreaterThan50(Employee[] employees) {
        // @TODO
    	int sum = 0;
    	for (int i = 0; i < employees.length; i++) {
    		if(employees[i].getAge() > 50) {
    			sum = sum + 1;
    		}
    	}
        return sum;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public static void reverseFirstName(Employee employee) {
        // @TODO
    	String name = employee.getFirstName();
    	//byte[] nameByteArray = name.getBytes();
    	//byte[] reverseName = new byte[nameByteArray.length];
    	String reverseName = "" ;
    	for (int i =name.length() - 1 ; i >= 0 ;i-- ) {
    		reverseName = reverseName + name.charAt(i);
    	}
    	employee.setFirstName(reverseName);
    }

    
    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public static void isContainDigit(Employee employee) {
        // @TODO
    	String firstName = employee.getFirstName();
    	String regex = "(.)*(\\d)(.)*";
    	Pattern pattern = Pattern.compile(regex);
    	Matcher matcher =  pattern.matcher(firstName);
    	
    	boolean containDigit = matcher.matches();;
    	
    	System.out.println(containDigit);
    	
    }

    
     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public static void tripleSalary(Employee employee) {
        // @TODO
    	double tripleSalary = employee.raiseSalary(3.0);
    	System.out.println(tripleSalary);
    }
    

    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public static Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        for(int i = 0; i < employeesStr.length; i++) {
        	 List<String> employeeDetail =Arrays.asList(employeesStr[i].split(","));
        	 int employeeId = Integer.parseInt(employeeDetail.get(0));
        	 String employeeFirstName = employeeDetail.get(1);
        	 int employeeAge = Integer.parseInt(employeeDetail.get(2));
        	 double employeeSalary = Double.parseDouble(employeeDetail.get(3));
        	 employees[i] = new Employee(employeeId,employeeFirstName,employeeAge,employeeSalary);
        	 
        }
       
        return employees;
    }
    
    
}

    