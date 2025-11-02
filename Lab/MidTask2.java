public class MidTask2 {
    public static void main(String[] args) {
       //Generating Full Name
        String str1 = "Prinon";
        String str2 = "Islam";
        String FullName = str1+ " " + str2;
        System.out.println("Your Full Name Is : " +FullName);
        
        //generating product code
        String productName = "iphone 14 pro max";
        String productId = "hvp13";
        String proCode =  productName+ " " + productId;
        System.out.println("Your Product Code is : " + proCode);
        
        //Extracting the user name
        String userName= "mygoogle24";
        String template= "@gmail.com";
        String Gen = userName+template;
        System.out.println("your generated email is : "+Gen );
         
        // Another method
         String email = "mygoogle24@gmail.com";
         String substring = email.substring(0, 10);
         System.out.println("substring : " + substring);

         // A chat app
    

          // Convert to Uppercase and lowercase
        String upperName = " prinon islam";
        String upperGen = upperName.toUpperCase();
        String lowerGen = upperName.toLowerCase();
        System.out.println("Uppercase: " + upperGen);
        System.out.println("lowercase: " + lowerGen);

         // replacing the word in a sentence
         String name = "Islam Prinon";
         String replace = name.replace("Prinon", "Prinon");
         System.out.println( "After replacing the name : " + replace);










        


    }
}
