/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01imam;

/**
 *
 * @author ACER-PC
 */
public class Sepeda_MotorAKsi {
    public static void main(String[] args) {
        Sepeda_Motor Bapak = new Sepeda_Motor();
        
        Bapak.Merk="Yamaha";
        Bapak.Warna="Merah";
        Bapak.CC="150cc";
        Bapak.Velg="Bintang";
        Bapak.Ban="Tubles";
        
        Bapak.cetakInfo();
    }
}
