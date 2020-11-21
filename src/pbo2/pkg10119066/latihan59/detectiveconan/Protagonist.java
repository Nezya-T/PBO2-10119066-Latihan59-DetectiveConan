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
public class Protagonist extends KarakterConan {
    private int CaseSolved;
    
    public Protagonist(String name, String gender, String job, int age){
        super(name, gender, job, age);
    }
    public int getCaseSolved(){
        return CaseSolved;
    }
    public void setCaseSolved(int caseSolved){
        this.CaseSolved = CaseSolved;
    }
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Case Solved     : " + getCaseSolved() + " Case");
    }
    
    
}
