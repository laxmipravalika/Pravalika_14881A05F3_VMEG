import java.util.Date;

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
                                                  int i;
                                     if(students==null)
                                          {
                                               throw new  IllegalArgumentException;
                                             }
                                          else
                                             {
 
                                    
                                    for(i=0;i<students.length();i++)
                                       {
                                            return student[i];
                                          } 
                                         }

		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
                              int i=0;
                                if((students[index]==null)||((index<0)||(index>students.length())))
                                                  {
                                                           throw  new IllegalArgumentException;
                                                   }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
                                          if((students[index]==null)||((index<0)||(index>students.length())))
                                                  {
                                                           throw  new IllegalArgumentException;
                                                   }
                                        else
                                              {
                              for(int i=1;i<=students.length();i++)
                                           {
                                                  if(i==index)
                                                       {
                                                          students[i].replaceAll(student[index],student[i]);
                                                       }
                                            }
                                              }

		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
                               if((student[index]==null)||((index<0)||(index>students.length())))
                                                  {
                                                           throw  new IllegalArgumentException;
                                                   }
                                else
                                      {
                                            for(i=1;i<=students.length();i++)
                                                     {
                                                              if(i<=index-1)
                                                                   {
                                                                         i++;
                                                                      }
                                                        student studentsf[] = students.slice(1, index);
			        student studentsl[] = students.slice(index, students.length); 
			        studentsf.push(student);
			        studentsf.concat(studentsl);
		                        students = studentsf ;
                                                   }      
                                       }
                                                       
                                                           
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
                                               if(students==null)
                                          {
                                               throw new  IllegalArgumentException;
                                             }
                      else
                       int i=0;
                             for(i=0;i<students.length();i++)
                                         {
                                              if(i==students.length())
                                                         {
                                                               students[i-1].append(student);
                                                        }}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
                                       if((student[index]==null)||((index<0)||(index>students.length())))
                                                  {
                                                           throw  new IllegalArgumentException;
                                                   }
                                 else
                                              {
                                                       for(i=1;i<=students.length();i++)
                                                        {
                                                                      if(i==index)
                                                             students.remove(students[index])
}
}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
                           students.addfirst(student[index]);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
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
