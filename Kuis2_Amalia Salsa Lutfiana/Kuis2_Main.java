/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis2_amalia;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class kuis2_Main {
 public static void menu(){
		System.out.println("===KUIS 2 PRAKTIKUM ASD T1 1G===");
		System.out.println("Dibuat Oleh : Amalia Salsa Lutfiana");
                System.out.println("NIM : 2141720228");
                System.out.println("Absen : 1G/04");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("1. Tambah Antrian");
		System.out.println("2. Hapus Antrian");
		System.out.println("3. Cetak Antrian");
                System.out.println("4. Laporan Pengurutan Pesanan by Nama");
                System.out.println("4. Hitung Total Pendapatan");
		System.out.println("6. Keluar");
		System.out.println("++++++++++++++++++++++++++++++++++");
	}

	public static void main(String[]args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Scanner vak = new Scanner(System.in);
		int menu = 0;

		Kuis2_Antrian dou = new Kuis2_Antrian();
		while(menu != 4){
			menu();
			menu = sc.nextInt();
			System.out.println("==================================");
			try{
				switch(menu){
					case 1:
						System.out.println("-------------------------------");
						System.out.println("Masukkan Data Pembeli");
						System.out.println("-------------------------------");
						System.out.print("Nomor Antrian: ");
						int nomor = sc.nextInt();
						System.out.print("Nama Customer: ");
						String nama = vak.nextLine();
                                                System.out.print("Nomor Hp: ");
						int hp = sc.nextInt();
						dou.Enqueue(nomor, nama, hp);
						System.out.println("------------------------------");
						dou.print();
						break;
					case 2:
                                                System.out.println("-------------------------------");
                                                System.out.println("\tTRANSAKSI INPUT PESANAN\t");
                                                System.out.println("-------------------------------");
						dou.Dequeue();
						dou.print();
						break;
					case 3:
						dou.print();
						break;
					case 4:
						System.out.println("Keluar");
						break;
				}
				System.out.println();
			}catch (Exception e){
			}
		}
        }
}