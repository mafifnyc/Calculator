package app;

public class Calculator {

    /**
     * Main method
     * EntryPoint to Java Application
     * JVM - The guy who has capacity to run a Java Application
     * JVM can only recognize the main method
     * What is method? --> It can accomplish or do some job.
     *  What does main method do? It  helps to run Java Application.
     *  If an application does not have main main method that application
     *  can not be executed or identified by the JVM.
     *
     * */

    public static void main(String[] args){
        System.out.println("Hello");
        // Call the method inside main method to make a relationship so that JVM can execute the custom
        //  method
        int a;

        int value = add(args[0], args[1]);
        System.out.println("Value: " + value);
        //deduct();
    }

    //  Custom Method
    // Anything we provide as input Arguments / Parameters
    // Arguments Vs Parameters in Java?
    public static int add(String a, String b){
        // This method does some calculation and
        // returns the result of the calculation

        int result = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("Added  Value : " +  result);
        System.out.println("THIS IS A CUSTOM METHOD");
        String calculatorName = "Casio 570";
        return result;

    }

    public static void deduct(){
        int a = 4;
        int b = 5;
        int result = a - b;
        System.out.println("Deducted  Value : " +  result);
        System.out.println("This method can make some deduction calculation");
    }

}