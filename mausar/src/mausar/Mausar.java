

package mausar;

import java.util.Scanner;


public class Mausar {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;
        int kurang;

        System.out.print("Masukan nilai : ");
        nilai = input.nextInt();
        
        cetakAngka(nilai);
        
    }
	static void cetakAngka(int angka) {
		if (angka > 0) {
			
                        if(angka%2==0)
                        {
                            System.out.println(angka + " Bilangan Genap ");
			cetakAngka(angka=angka-3);
                        }
                        else{
                            System.out.println(angka + " Bilangan Ganjil ");
			cetakAngka(angka=angka-3);
                        }

		}
	}  
    }
    

