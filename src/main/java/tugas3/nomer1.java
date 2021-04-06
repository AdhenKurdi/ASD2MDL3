package tugas3;

import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] angka = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Adhen", "Tesla"};
        int found = 0;
        System.out.println("nama-nama orang yang berpengaruh:\n");
        for (String angka1 : angka) {
            System.out.print("|" + angka1 + "| ");
        }
        
        System.out.println("\n\nmasukan nama yang akan dicari:");
        String key = input.nextLine();
        
        for (int i=0; i<angka.length; i++){
            if (key.equalsIgnoreCase(angka[i])){
                found = 1;
                System.out.println("nama: "+key+", pada indeks ke-"+i);
                break;
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
            System.out.println("\n===== Hai Sayang =====");
        }
    }  
}
