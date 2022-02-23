/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Jingxin Jiang
 */
public class TestUserprofile {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        System.out.println("Enter your preferred genre of movie");
        
        String movie1=input.nextLine();
        UserProfile one=new UserProfile(name,movie1);
        System.out.println(one.getUserID()+"'s userProfile was created. Preferred genre of movie is "+one.getGenre());
                
    }
}
