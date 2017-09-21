import java.awt.*;
import java.util.ArrayList;

class Student
{
	String name;
	Adress homeAdress;
	int score;
	
	public Student(String a,Adress b,int c)
	{
		name=a;
		homeAdress=b;
		score=c;
	}
	public String toString()
	{
		return name+":"+homeAdress;
	
	}
}

class Adress 
{
	String city;
	String streetAddress;
	long zipCode;
	
	public Adress(String a,String b,long c)
	{
		city=a;
		streetAddress=b;
		zipCode=c;
	}
	public String toString()
	{
		return city+streetAddress;
	}
	
	
}
class Course
{
	String name;
	long average;
	ArrayList<Student> list=new ArrayList<Student>(5);
	Student ss;
	
    public Course(String name)
	{
		this.name=name;
	}
	
	public void addStudent(Student stu)
	{
		list.add(stu);
	}
	
	public double average()
	{
		for(int i=0;i<list.size();i++)
		{
			ss=list.get(i);
			average=average+ss.score;

		}
		average=average/list.size();
		return average;
	}
	
	public void roll(ArrayList list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).toString());
		}
	}
	
}

public class StudenSys
{
	public static void main(String args[])
	{
		Course course=new Course("Maths");
		
	
	Adress ad1=new Adress("New York","101rue",701);
	Student st1=new Student("Lm",ad1,89);
	course.addStudent(st1);
	
	Adress ad2=new Adress("Paris","103rue",701);
	Student st2=new Student("LX",ad2,85);
	course.addStudent(st2);
	
	Adress ad3=new Adress("London","106rue",701);
	Student st3=new Student("QI",ad3,82);
	course.addStudent(st3);
	
	Adress ad4=new Adress("	Beikin","107rue",701);
	Student st4=new Student("LL",ad4,99);
	course.addStudent(st4);
	
	Adress ad5=new Adress("New York","101rue",701);
	Student st5=new Student("xx",ad5,89);
	course.addStudent(st5);
	course.roll(course.list);
	System.out.println("Ave:"+course.average());
	}
	
	
}
