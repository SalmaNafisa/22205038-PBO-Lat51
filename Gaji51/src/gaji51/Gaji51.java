/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gaji51;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
* Nama : Salma Nafisa Qurrotu'Aini
 * Nim : 22205038
 * Kelas : Teknik Informatika
 * Matakuliah : PBO1
 * Semester : 3
 */

public class Gaji51 {
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);
        Manager mnr1 = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        mnr1.setNik(baca.nextLine());
        System.out.print("Masukkan Nama : ");
        mnr1.setNama(baca.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mnr1.setGolongan(baca.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mnr1.setJabatan(baca.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mnr1.setKehadiran(baca.nextInt());
        System.out.println("");

        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : " + mnr1.getNik());
        System.out.println("Nama : " + mnr1.getNama());
        System.out.println("Golongan : " + mnr1.getGolongan());
        System.out.println("Jabatan : " + mnr1.getJabatan());
        System.out.println("");

        System.out.println("TUNJANGAN GOLONGAN : " + mnr1.tunjanganGolongan
                           (mnr1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + mnr1.tunjanganJabatan
                           (mnr1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + mnr1.tunjanganKehadiran
                           (mnr1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL " + mnr1.totalGaji());

    }

}