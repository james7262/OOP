public class App {
    public static void main(String[] args) throws Exception {
        // Abstraction is to work with something we know how to use
        // without knowing how it works internally.

        student student = new student("James", "Bachrach", "CHC");
        System.out.println(student.greeting());

        // Write the lines of code to create an UndergradStudent object
        // using the student object as the basis of creation.
        // Call the greeting, creditsRemaining, and isMajorComplete methods
        // on the UndergradStudent object.
        UndergradStudent student2 = new UndergradStudent(
            student.getFirstName(), student.getLastName(), student.getSchoolName(), 3.0, 
            120, "Computer Science");
        System.out.println(student2.greeting());  
        System.out.println(student2.creditsRemaining(120)); 
        System.out.println(student2.isMajorComplete(120)); 

        Integer one = 1;
        double two = 2.0;
        String twoString = "2.0";
        Boolean bool = false;

        // Strongly typed programming languages will 
        // attempt to determine the type for you.
        System.out.println(one + two);
        System.out.println(one + twoString);
        
        // System.out.println(one + bool);


    }
}
