import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StudentGroup sg=new StudentGroup(n); 
		while(true)
		{
			System.out.println("---------MENU----------");
			System.out.println("1.getStudents");
			System.out.println("2.setStudents");
			System.out.println("3.getStudent");
			System.out.println("4.setStudent");
			System.out.println("5.add");
			System.out.println("6.addFirst");
			System.out.println("7.addLast");
			System.out.println("8.remove by Index");
			System.out.println("9.remove by student");
			System.out.println("10.removeFromIndex");
			System.out.println("11.removeFromElement");
			System.out.println("12.removeToIndex");
			System.out.println("13.removeToElement");
			System.out.println("14.getByBirthDate");
			System.out.println("15.getBetweenBirthDates");	
			System.out.println("16.getNearBirthDate");
			System.out.println("17.getCurrentAgeByDate");
			System.out.println("18.getStudentsByAge");
			System.out.println("19.getStudentsWithMaxAvgMark");
			System.out.println("20.getNextStudent");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: Student[] stu=sg.getStudents();
					for(Student s:stu)
						System.out.println(s);
					break;
				case 2:
					Student[] s=new Student[n];
					for(int i=0;i<n;i++)
					{
						System.out.println("Enter Student data:");
						int id=sc.nextInt();
						String name=sc.next();
						Date d=new Date(sc.next());
						double avg=sc.nextDouble();
						s[i]=new Student(id,name,d,avg);
					}
					sg.setStudents(s);
					break;
				/*case 3:
					break;
				case 4:
					break;	
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				case 17:
					break;
				case 18:
					break;
				case 19:
					break;
				case 20:
`					break;*/
				default :return;
			}
		}

	}

}
