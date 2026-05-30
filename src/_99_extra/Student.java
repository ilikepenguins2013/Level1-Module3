package _99_extra;

public class Student {

	      static int nextId = 1;

	      static String School="Carmel Valley ";

	      int id;

	      String name;

	      int currentLevel;

	      Student (String name, int currentLevel){

	          this.name = name;
	          this.currentLevel = currentLevel; 
	          id = nextId;
	          nextId++;
	      }

	      public static void main(String[] args){

	      //create 2 students.
	    	  Student stu1 = new Student("Arnold", 102);
	    	  Student stu2 = new Student("Argo", 102);
	      //print their names, ids and school. }}
	    	  
	      }
}
