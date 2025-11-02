public class Question4 {
    public static void main(String[] args) {
        int num1=10;
        int num2=15;
        System.out.println("Before Swaping:");
         System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
        // num1=num2+num1;
         //num2=num1-num2;
         //num1=num1-num2;
         int tamp =  num1;
         num1=num2;
         num2=tamp;
             
        System.out.println("After Swaping:");

        System.out.println("Number 1 is: " + num1);
        System.out.println("Number 2 is: " + num2);
    }
}
