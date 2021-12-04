package driver;
import AdminDepartment.AdminDepartment;
import TechDepartment.TechDepartment;
import hrDepartment.hrDepartment;
import superDepartment.superDepartment;

public class driver {
	public static void main(String[] args) 
	{
		
		superDepartment obj= new AdminDepartment();
		System.out.println("\nWelcome to "+obj.departmentName());
		System.out.println(obj.gettodayswork());
		System.out.println(obj.getworkdeadline());
		System.out.println(obj.istodayholiday());
		superDepartment obj2=new hrDepartment();
		System.out.println("\nwelcome to "+obj2.departmentName());
		System.out.println(((hrDepartment) obj2).doactivity());
		System.out.println(obj2.gettodayswork());
		System.out.println(obj2.getworkdeadline());
		System.out.println(obj.istodayholiday());
		
		superDepartment obj3= new TechDepartment();
		System.out.println("\nwelcome to "+obj3.departmentName());
		System.out.println(obj3.gettodayswork());
		System.out.println(obj3.getworkdeadline());
		System.out.println(((TechDepartment) obj3).techstackinformation());
		System.out.println(obj.istodayholiday());
					
			}
	

}
 