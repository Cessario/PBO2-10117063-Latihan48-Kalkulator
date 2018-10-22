/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan48.kalkulator;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : Kalkulator
 */
public class PBO210117063Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator klk = new Kalkulator();
        klk.setValue1(6);
        klk.setValue2(3);
        
        System.out.println("VALUE 1 = " +klk.getValue1());
        System.out.println("VALUE 2 = "+klk.getValue2());
        System.out.println("Result Add is = " +klk.add(klk.getValue1(), klk.getValue2()));
        System.out.println("Result Minus is = "+klk.minus(klk.getValue1(), klk.getValue2()));
        System.out.println("Result Multiple is = "+klk.multiplication(klk.getValue1(), klk.getValue2()));
        System.out.println("Result Division is = "+klk.division(klk.getValue1(), klk.getValue2()));
        
    }
    
}
