/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      menampilkan waktu
 */
public class IF110119026Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        Locale lokal = Locale.forLanguageTag("id");
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", lokal);
        
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
    
}
