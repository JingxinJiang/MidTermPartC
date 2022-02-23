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
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        boolean check=false;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        String movie1="";
        while(!check){
        System.out.println("Enter your preferred genre of movie");
        System.out.println("Choose your favorite genre from Comedy, Drama, Action, Mystery");
        movie1=input.nextLine();
        
        for(int i=0;i<genres.length;i++){
           if (movie1.equals(genres[i])){
               check=true;
               break;
           }
        }
        }
    
        if(check==true){
            UserProfile one=new UserProfile(name,movie1);
        System.out.println(one.getUserID()+"'s userProfile was created. Preferred genre of movie is "+one.getGenre());}
        
                
    }
}
