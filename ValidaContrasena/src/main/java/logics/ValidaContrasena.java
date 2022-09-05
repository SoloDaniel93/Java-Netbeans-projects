package logics;

import gui.GUI_password;

public class ValidaContrasena {

    public static void main(String[] args) {
        
        GUI_password gpw = new GUI_password();
        gpw.setVisible(true);
       // gpw.dispose();
        
        
        
//        Scanner sc = new Scanner(System.in);
//        String pw;
//        int upperCount = 0, lowerCount = 0, digitCount = 0;
//        System.out.println("Build a secure password\n");
//        System.out.print("Enter a password: ");
//        pw = sc.nextLine();
//        //char [] sets = new char[pw.length()];
//        char c;
//
//        if (pw.length() < 8) {
//            System.out.println("Too weak password");
//        } else {
//            for (int i = 0; i < pw.length(); i++) {
//                c = pw.charAt(i);
//                if (isUpperCase(c)) {
//                    upperCount++;
//                } else if (isLowerCase(c)) {
//                    lowerCount++;
//                } else if (isDigit(c)) {
//                    digitCount++;
//                }
//            }
//
//            if (upperCount < 1) {
//                System.out.println("Your password must have 1 upperCase letter,"
//                        + " at least");
//            } if (lowerCount < 1) {
//                System.out.println("Your password must have 1 lowercase letter,"
//                        + " at least");
//            } if(digitCount < 1) {
//                System.out.println("Your password must have 1 digit,"
//                        + " at least");
//            }
//            if(upperCount > 0 && lowerCount > 0 && digitCount > 0){
//                System.out.println("your Password is correct!");
//            }else {
//                System.out.println("Sorry, your password format is mistaken");
//            }
//        }
//
    }
}
