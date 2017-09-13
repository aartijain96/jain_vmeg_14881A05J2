import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	List<Student> arrli=new ArrayList<Student>();
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students!=null)
			return students;
		else
			return null;
		}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try{
		int i,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:\n");
		len=sc.nextInt();
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		for(i=0;i<len;i++)
		{
			System.out.println("Enter id:\n");
			int id=sc.nextInt();
			System.out.println("Enter name:\n");
			String fullName=sc.next();
			System.out.println("Enter date of birth:\n");
			String input=sc.next();
			Date birthDate=format.parse(input);
			System.out.println("Enter average marks:\n");
			double avgMark=sc.nextDouble();
			Student s=new Student(id,fullName,birthDate,avgMark);
			arrli.add(s);
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int index) {
		
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		arrli.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int index=arrli.indexOf(student);
		arrli.remove(index);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		arrli.remove(index);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int index=arrli.indexOf(student);
		arrli.remove(index);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		arrli.remove(index);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int index=arrli.indexOf(student);
		arrli.remove(index);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		/*int i;
		for(i=0;i<students.length;i++)
		{
			if(((students[i].birthDate).compareTo(date))==0)
				return students;
		}*/
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
