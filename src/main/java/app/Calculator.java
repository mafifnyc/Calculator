package app;

public class Calculator {

    public static void main(String[] args){
        int a;
        int value = add(args[0], args[1]);
        int deductValue = deduct(args[0],args[1]);
        System.out.println("Value: " + deductValue);
    }


    public static int add(String a, String b){
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("Added  Value : " +  result);
        return result;
    }

    public static int deduct(String a, String b){
        int result = Integer.parseInt(a) - Integer.parseInt(b);
        System.out.println("Deducted  Value : " +  result);
        return result;
    }

}
