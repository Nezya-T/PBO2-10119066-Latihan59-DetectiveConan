/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan59.detectiveconan;

/**
 *
 * @author Neyza-T
 */
public class KarakterConan {
    private final String name, gender, job;
    private final int age;
    
    public KarakterConan(String name, String gender, String job, int age){
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getJob(){
        return job;
    }
    public int getAge(){
        return age;
    }
    public void TampilData(){
        System.out.println("Character Name : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Gender         : " + gender);
        System.out.println("Profession     : " + job);
        
    }

    void tampilData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
