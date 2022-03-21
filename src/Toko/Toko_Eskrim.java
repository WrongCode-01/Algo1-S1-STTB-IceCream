
package Toko;

import java.util.Scanner;

public class Toko_Eskrim {

    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int jenis,harga_topping; 
        double harga_es,diskon,banyak_pesanan,topping,total_pesanan;
        for(String Ulang="iya"; Ulang.equalsIgnoreCase("iya");){
        System.out.println("Toko Es-Krim M Dena");
        System.out.println("Harap Pilih Jenis Es-Krim Yang Diinginkan");
        System.out.println("1. Cup        = Rp. 5000");
        System.out.println("2. Corong     = Rp. 3000");
        System.out.println("3. Roti       = Rp. 4000");
        System.out.println("4. Box        = Rp. 6500");
        System.out.print("Mau Yang Mana (1-4): ");
        jenis = in.nextInt();
        System.out.println("---------------------------------------");
        switch (jenis){
            case 1: harga_es = 5000;
                    System.out.println("Toping ");
                    System.out.println("1. Ceres        = Rp. 1500");
                    System.out.println("2. Cha cha      = Rp. 2000");
                    System.out.println("3. Keju         = Rp. 3500");
                    System.out.println("4. Oreo         = Rp. 4000");
                    System.out.println("5. Cokelat      = Rp. 1000");
                    System.out.print("Silahkan Pilih Toping (1-5) :  ");
                    topping = in.nextDouble();
                        if(topping==1){
                           harga_topping=1500;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 1 - Cup");
                           System.out.println("Jenis Topping No 1 - Ceres");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==2){
                           harga_topping=2000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 1 - Cup");
                           System.out.println("Jenis Topping No 2 - Cha Cha");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==3){
                           harga_topping=3500;  
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 1 - Cup");
                           System.out.println("Jenis Topping No 3 - Keju");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==4){
                           harga_topping=4000; 
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 1 - Cup");
                           System.out.println("Jenis Topping No 4 - Oreo");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==5){
                           harga_topping=1000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 1 - Cup");
                           System.out.println("Jenis Topping No 5 - Cokelat");
                           System.out.println("Total harga = " + total_pesanan);
                        }else{
                           System.out.println("Pilihan tak tersedia");
                           }   
                    break;
            case 2: harga_es = 3000;
                    System.out.println("Toping ");
                    System.out.println("1. Ceres        = Rp. 1500");
                    System.out.println("2. Cha cha      = Rp. 2000");
                    System.out.println("3. Keju         = Rp. 3500");
                    System.out.println("4. Oreo         = Rp. 4000");
                    System.out.println("5. Cokelat      = Rp. 1000");
                    System.out.print("Silahkan Pilih Toping (1-5) :  ");
                    topping = in.nextDouble();
                        if(topping==1){
                           harga_topping=1500;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 2 - Corong");
                           System.out.println("Jenis Topping No 1 - Ceres");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==2){
                           harga_topping=2000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 2 - Corong");
                           System.out.println("Jenis Topping No 2 - Cha Cha");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==3){
                           harga_topping=3500;  
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 2 - Corong");
                           System.out.println("Jenis Topping No 3 - Keju");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==4){
                           harga_topping=4000; 
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 2 - Corong");
                           System.out.println("Jenis Topping No 4 - Oreo");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==5){
                           harga_topping=1000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 2 - Corong");
                           System.out.println("Jenis Topping No 5 - Cokelat");
                           System.out.println("Total harga = " + total_pesanan);
                        }else{
                           System.out.println("Pilihan tak tersedia");
                        }
                    break;
            case 3: harga_es = 4000;
                    System.out.println("Toping ");
                    System.out.println("1. Ceres        = Rp. 1500");
                    System.out.println("2. Cha cha      = Rp. 2000");
                    System.out.println("3. Keju         = Rp. 3500");
                    System.out.println("4. Oreo         = Rp. 4000");
                    System.out.println("5. Cokelat      = Rp. 1000");
                    System.out.print("Silahkan Pilih Toping (1-5) :  ");
                    topping = in.nextDouble();
                        if(topping==1){
                           harga_topping=1500;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 3 - Roti");
                           System.out.println("Jenis Topping No 1 - Ceres");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==2){
                           harga_topping=2000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 3 - Roti");
                           System.out.println("Jenis Topping No 2 - Cha Cha");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==3){
                           harga_topping=3500;  
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 3 - Roti");
                           System.out.println("Jenis Topping No 3 - Keju");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==4){
                           harga_topping=4000; 
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 3 - Roti");
                           System.out.println("Jenis Topping No 4 - Oreo");
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==5){
                           harga_topping=1000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 3 - Roti");
                           System.out.println("Jenis Topping No 5 - Cokelat");
                           System.out.println("Total harga = " + total_pesanan);
                        }else{
                           System.out.println("Pilihan tak tersedia");
                        }
                    break;     
            case 4: harga_es = 6500;
                    System.out.println("Toping ");
                    System.out.println("1. Ceres        = Rp. 1500");
                    System.out.println("2. Cha cha      = Rp. 2000");
                    System.out.println("3. Keju         = Rp. 3500");
                    System.out.println("4. Oreo         = Rp. 4000");
                    System.out.println("5. Cokelat      = Rp. 1000");
                    System.out.print("Silahkan Pilih Toping (1-5) :  ");
                    topping = in.nextDouble();
                        if(topping==1){
                           harga_topping=1500;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 4 - Box");
                           System.out.println("Jenis Topping No 1 - Ceres");
                                if(banyak_pesanan >2){
                                    diskon=total_pesanan*15/100;
                                    total_pesanan=total_pesanan-diskon;
                                    System.out.println("Diskon Didapat 15% = " + diskon);
                                }else{ 
                                    System.out.println("Diskon : 0");}           
                                    System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==2){
                           harga_topping=2000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 4 - Box");
                           System.out.println("Jenis Topping No 2 - Cha Cha");
                                if(banyak_pesanan >2){
                                    diskon=total_pesanan*15/100;
                                    total_pesanan=total_pesanan-diskon;
                                    System.out.println("Diskon Didapat 15% = " + diskon);
                                }else{ 
                                    System.out.println("Diskon : 0");}
                           System.out.println("Total harga = " + total_pesanan);
                        }else if(topping==3){
                           harga_topping=3500;  
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim : ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 4 - Box");
                           System.out.println("Jenis Topping No 3 - Keju");
                                if(banyak_pesanan >2){
                                    diskon=total_pesanan*15/100;
                                    total_pesanan=total_pesanan-diskon;
                                    System.out.println("Diskon Didapat 15% = " + diskon);
                                }else{ 
                                   System.out.println("Diskon : 0");}
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==4){
                           harga_topping=4000; 
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 4 - Box");
                           System.out.println("Jenis Topping No 4 - Oreo");
                                if(banyak_pesanan >2){
                                    diskon=total_pesanan*15/100;
                                    total_pesanan=total_pesanan-diskon;
                                    System.out.println("Diskon Didapat 15% = " + diskon);
                                }else{ 
                                   System.out.println("Diskon : 0");}
                           System.out.println("Total harga = " + total_pesanan);
                        }else if (topping==5){
                           harga_topping=1000;
                           System.out.println("----------------------------");
                           System.out.print("Anda Ingin Membeli Berapa Es-Krim ? ");
                           banyak_pesanan = in.nextDouble();
                           System.out.println("----------------------------");
                           total_pesanan=(harga_es+harga_topping)*banyak_pesanan;
                           System.out.println("Jenis Es Krim No 4 - Box");
                           System.out.println("Jenis Topping No 5 - Cokelat");
                                if(banyak_pesanan >2){
                                    diskon=total_pesanan*15/100;
                                    total_pesanan=total_pesanan-diskon;
                                    System.out.println("Diskon Didapat 15% = " + diskon);
                                }else{ 
                                   System.out.println("Diskon : 0");}
                           System.out.println("Total harga = " + total_pesanan);
                        }else {
                           System.out.println("Pilihan tak tersedia");
                        }
                    break;
        }
        System.out.println("-------------------------------");
        System.out.print("Apakah Akan Melakukan Pesanan Baru ? (iya/tidak) : ");
        Ulang=in.next();
        System.out.println("-------------------------------");
    }}}
        
