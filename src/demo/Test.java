package demo;

public class Test {

    // main function
    public static void main(String[] args) {
        User user = new User();
        user.setPassword("newPassword");
        System.out.println(user.getPassword());

    }

}

