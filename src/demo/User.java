package demo;

public class User {

    public static String username;
    private String password = "test@123"; // global or class

    // local >  global

    //getter method
    public String getPassword() {
        return password;
    } // camel case

    public String getUsername() {
        return username;
    }

    //setter function
    public void setPassword(String password){
        this.password = password; //
    }



}
