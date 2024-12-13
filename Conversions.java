/**
 * This class is the starter code for the conversions task in Lab0. 
 * The purpose of this exercise is to gain more practice with datatype conversions in java.
 */

public class Conversions {
    // Errors - missing return types, missing bodies
    
    // What should be the return type for this method?
    public double problem1() {
        int x = 3;
        double y = 3;
        return x + (y / 2);
    }
    
    // What should be the return type for this method?
    public double problem2() {
        int x = 3;
        double y = 3.2;
        double z = x;
        return z + (y / 2);
    }
    
    // What should be the return type for this method?
    public int problem3() {
        int x = 3;
        double y = 8.8;
        return x + (int) y / 2;
    }
    
    // What String will be returned by this method?
    // "36.41 * 100: //Some double that is not exactly 3641 but close"
    // After determining the String that will be returned, run your code to check yourself.
    private String problem4(){
        double x = 36.41; 
        double y = x * 100; 
        return "36.41 * 100: " + y;
    }
    
    // This method takes a total number of seconds as input and returns a String
    // formatted in according to the following style:
    // initial secs: 2345 ==> hours: 0 mins: 39 secs: 5
    public String initSecs(int seconds){
        // limitations due to data sizes
        int hours;
        int mins;
        int secs;
        
        hours = seconds / 3600;
        mins = (seconds % 3600) / 60;
        secs = seconds % 60;
        
        return ("initial secs: " + seconds + " ==> hours: " + hours + " mins: " + mins + " secs: " + secs);
    }

    // This main method runs the program.
    public static void main(String[] args){
        // Instantiate a new Conversions object
        Conversions myConversions = new Conversions();

        // Printing results for problems 1-4
        System.out.println(myConversions.problem1());
        System.out.println(myConversions.problem2());
        System.out.println(myConversions.problem3());
        System.out.println(myConversions.problem4()); // Check to see if this matches your answer
        
        // Write test cases for initSecs, what are good edge cases to consider?
        System.out.println(myConversions.initSecs(0));
        System.out.println(myConversions.initSecs(1));
        System.out.println(myConversions.initSecs(61));
        System.out.println(myConversions.initSecs(120));
        System.out.println(myConversions.initSecs(121));
        System.out.println(myConversions.initSecs(3600));
        System.out.println(myConversions.initSecs(2345));
        System.out.println(myConversions.initSecs(60));
    }
}
