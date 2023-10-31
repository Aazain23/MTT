

package App;
import java.util.*;

public class App {

    public static void main( String[] args )
    {
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Enter username: ");
         String username = scanner.nextLine();

         System.out.print("Enter password: ");
         String password = scanner.nextLine();

         if (authenticate(username, password)) {
             System.out.println("Authentication successful!");
         } else {
             System.out.println("Authentication failed!");
         }

         scanner.close();
     }

     public static boolean authenticate(String username, String password) {
         // Replace with your predefined user name and password
         String predefinedUsername = "ram";
         String predefinedPassword = "3025";

         return predefinedUsername.equals(username) && predefinedPassword.equals(password);
    }
}









