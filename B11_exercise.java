/*Tin Le 
CS533-Homework 2
*/
package gradleproject1;
/**
 * @author TinGiangVN
 */
public class B11_exercise{
	private String courseName;	
	private String instructorName;	
	// Default constructor
        public B11_exercise(){
		courseName = "College";	
		instructorName = "Adam";	
	}
        // Explicit default constructor
	public B11_exercise( String course, String teacher ){
		courseName = course;	
		instructorName = teacher;	
	} 
        
	public void setCourseName( String cname ){
		courseName = cname;	// store the course name
	}
        
	public String getCourseName( ){
		return courseName;
	}
        
	public void setInstructorName( String teacher ){
		instructorName = teacher;	
	} 
	public String getInstructorName(){
		return instructorName;
	} 
	public void displayMessage(){
		System.out.printf( "Welcome to %s!\n", getCourseName() );
		System.out.printf( "This course is presented by: %s\n", getInstructorName() );
	} 
} // end class
