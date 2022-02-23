/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Jingxin Jiang
 */
public class TestUserprofile {
    public static void main(String[] args) {
        UserProfile one=new UserProfile("Lucy1","Comedy");
        System.out.println(one.getUserID()+"'s userProfile was created. Preferred genre of movie is "+one.getGenre());
                
    }
}
