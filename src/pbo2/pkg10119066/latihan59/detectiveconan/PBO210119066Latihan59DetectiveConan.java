/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan59.detectiveconan;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Kelas    : IF2
 * Nim      : 10119066
 */
public class PBO210119066Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KorbanVirus kv1;
        KorbanVirus kv2;
        kv1 = new KorbanVirus("Conan Edogawa", "Male","Teitan Elementary School Student", 7, "Shinichi Kudo", 17);
        kv2 = new KorbanVirus("Ai Haibara", "Female", "Teitan Elementary School Student", 7, "Shiho Miyano", 18);
        System.out.println("Detective Conan");
        System.out.println("");
        System.out.println("=============APTX 4869 virus victim=============");
        System.out.println("");
        kv1.tampilData();
        System.out.println("");
        kv2.tampilData();
        System.out.println("");
        Protagonist p1, p2, p3;
        p1 = new Protagonist("Shinichi Kudo", "Male", "Detective", 17);
        System.out.println("=============Protagonist=============");
        System.out.println("");
        p1.setCaseSolved(291);
        p1.tampilData();
        System.out.println("");
        p2 = new Protagonist("Kogoro Mori", "Male", "Detective", 38);
        p2.setCaseSolved(400);
        p2.tampilData();
        System.out.println("");
        p3 = new Protagonist("Ran Mori", "Female", "Teitan HighSchool Student", 17);
        p3.setCaseSolved(3);
        p3.tampilData();
    }
    
}
