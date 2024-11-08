//bwt lib input
// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

//main program
public class test {
    public static void main (String[] args) {
        // // praktikum pemdaszz
        // Scanner input = new Scanner(System.in);
        // System.out.println("2021-2024");
        // System.out.println(15.9);
        
        // //penginputan
        // Scanner input = new Scanner(System.in);
        // String awok3 = input.nextLine(); //bs > 1 kata
        // String awok4 = input.next(); // cm 1 kata
        // System.out.println("aku mau " + awok3);
        // System.out.println(awok4);

        // //advance
        // int awok5 = input.nextInt();
        // float awok6 = input.nextFloat();
        // double awok7 = input.nextDouble();
        // boolean rill = input.nextBoolean();
        // System.out.println(awok5);
        // System.out.println(awok6);
        // System.out.println(awok7);
        // System.out.println(rill);
        
        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // //advanced boisss
        // int a = 5;
        // double b = 1.5;
        // int c = 23;
        // double x = a+b;
        // double y = c/(double) a;
        // double z = c/5.0;
        // System.out.println(z);

        // //perpangkatan, akar
        // double desimal1 = Math.pow(2, 3);
        // System.out.println(desimal1);
        // double desimal2 = Math.sqrt(16);
        // System.out.println(desimal2);
        // double desimal3 = Math.cbrt(27);
        // System.out.println(desimal3);

        // //printf
        // //batesin angka belakang koma (desimal)
        // String nama = "fufufafa";
        // int nilai = 90;
        // float rata = 98.42786f; //harus kasi f di belakang data type float
        // System.out.printf("Nama gw %s\n", nama);
        // System.out.printf("Nilai gw %s\n", nilai);
        // System.out.printf("Rata2 gw %.2f\n", rata);
        // System.out.printf("Nama gw %s, nilai gw %s, rata2 gw %.2f\n", nama, nilai, rata);
        
        // String nnn = input.next();
        // System.out.println(nnn);
        // int bbb = input.nextInt();
        // System.out.println(bbb);
        // input.nextLine(); // ini biar nguppin si println di upp
        // String ddd = input.nextLine();
        // System.out.println(ddd);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner walaa = new Scanner(System.in);
        // int Angka = walaa.nextInt();
        // int num1 = (Angka % 10);
        // int num2 = (Angka / 10 % 10);
        // int num3 = (Angka / 100 % 10);
        // int Jum = (num1+num2+num3);
        // System.out.println(Jum);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner cek = new Scanner(System.in);
        // int num = cek.nextInt();
        // cek.close();
        // if (num > 0) {
        //     System.out.println("Bilangan bulat positif");
        // } else if (num < 0) {
        //     System.out.println("Bilangan bulat negatif");
        // } else {
        //     System.out.println("Bilangan adalah 0");
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner bebas = new Scanner(System.in);
        // int age = bebas.nextInt();
        // bebas.close();
        // if (age < 7) {
        //     System.out.println("TK");
        // } else if (age < 12) {
        //     System.out.println("SD");
        // } else if (age < 15) {
        //     System.out.println("SMP");
        // } else if (age < 18) {
        //     System.out.println("SMA");
        // } else {
        //     System.out.println("Kuli-ah");
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // // ternary if else
        // int aa = 10;
        // int bb = 20;
        // String x = (aa<bb) ? "a kurang dari b" : "b kurang dari a";
        // System.out.println(x);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner input = new Scanner (System.in);
        
        // ARRAY : dapat menyimpan beberapa nilai dengan tipe data yang sama
        
        // ARRAY 1D
        // deklarasi : (tipedata)[] namaArray = new (tipedata) [jumlahElemen]

        // //Deklarasi array
        // int[] angka = new int[7];
        // float[] nilai = new float[10];
        // String[] nama = new String[45];

        // //masukkan nilainya 
        // //indeks dimulai dari 0
        // angka[0] = 9;
        // angka[1] = 7;
        // angka[2] = 7;
        // angka[3] = 100;
        // angka[4] = 7; 
        // angka[5] = 8;
        // angka[6] = 2;

        // nama[0] = "Alek";
        // nama[1] = "Budi";
        // nama[5] = "Ica";

        // int[] number = new int [] {1, 2, 3, 4, 5, 6};
        // // String[] nama = new String [] {"Alek", "Budi", "Cita", "Dudu"};

        // String[] name = new String [] {"Icha", "Nopal", "Fitra", "Rara"};

        // // Input Array
        // for (int i = 0; i<nilai.length; i++) {
        //     System.out.println("Masukkan nilai array untuk indeks ke-" + i);
        //     nilai[i] = input.nextFloat();
        // }

        // // Cara ngeprint
        // System.out.println(angka[3]);
        // System.out.println(nama[0]);

        // // for loop
        // for (int j = 0; j<angka.length; j++) {
        //     System.out.println("Ini adalah array angka indeks ke-" + j + ": " + angka[j]);
        // }

        // // .toString : mengubah array menjadi string yang mudah dibaca, 
        // // dengan menampilkan elemen-elemen array dalam kurung siku [ ] dan dipisahkan dengan koma.
        // System.out.println("Array angka: " + Arrays.toString(angka));

        // // LOOPING untuk melooping nilai dari elemen array

        // // for each
        // for (int k : angka){
        //     System.out.println(k);
        // }

        // // for
        // for (int k = 0; k<angka.length; k++) {
        //     System.out.println(angka[k]);
        // }

        // // looping for (string :)
        // for (String PrintName : nama) {
        //     System.out.println(PrintName);
        // }

        // for (int l = 0; l<nama.length; l++) {
        //      System.out.println(nama[l]);
        // }

        // // contoh penggunaan dalam case
        // int bestscore = 0;
        // System.out.println("masukkan jumlah anak");
        // int jmlh = input.nextInt();
        // int a[] = new int[jmlh];

        // System.out.println("Masukkan " + jmlh +  " nilai");
        // for (int m = 0; m < jmlh; m++){
        //     a[m] = input.nextInt();
        //     if ( bestscore < a[m]) {
        //         bestscore = a[m];
        //     }
        // }
        // System.out.println("Nilai tertinggi = " + bestscore);

        // for (int j = 0; j < jmlh; j++){
        //     System.out.println("Nilai anak ke-" + (j + 1));
        // }

        // // Reference Array
        // int[] arrayA = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println(Arrays.toString(arrayA));
        // int[] arrayB = {10, 20, 30, 40, 50, 60, 70};
        // System.out.println(Arrays.toString(arrayB));

        // arrayB = arrayA; //mengganti nilai arrayB menjadi nilai arrayA
        // System.out.println(Arrays.toString(arrayB));

        // arrayB[3] = 85; //mengganti arrayB index ke-3 dengan 85
        // arrayA[0] = 95; //mengganti arrayB index ke-0 dengan 95
        // System.out.println("arrayA: " + Arrays.toString(arrayA));
        // System.out.println("arrayB: " + Arrays.toString(arrayB));

        // -----------------------------------------------------------------------------------------------

        // //perlatihan praktikum
        // Scanner input = new Scanner(System.in); //NO 2
        // double x1 = input.nextDouble();
        // double y1 = input.nextDouble();
        // double x2 = input.nextDouble();
        // double y2 = input.nextDouble();
        // double x3 = input.nextDouble();
        // double y3 = input.nextDouble();       
        // input.close();
        // double luas = Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.00;
        // System.out.printf("%.2f", luas);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner input = new Scanner(System.in); //NO 4 (2)
        // double x1 = input.nextDouble();
        // double y1 = input.nextDouble();
        // double x2 = input.nextDouble();
        // double y2 = input.nextDouble();
        // input.close();
        // double jarx = x2-x1;
        // double jary = y2-y1;
        // double xx = Math.pow(jarx, 2);
        // double yy = Math.pow(jary, 2);
        // double zz = xx + yy;
        // double panjang = Math.sqrt(zz);
        // System.out.printf("%.2f", panjang);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner input = new Scanner(System.in); //NO 3 (2)
        // double x1 = input.nextDouble();
        // double y1 = input.nextDouble();
        // double x2 = input.nextDouble();
        // double y2 = input.nextDouble();
        // input.close();
        // double jx = x2-x1;
        // double jy = y2-y1;
        // double xx = Math.pow(jx, 2);
        // double yy = Math.pow(jy, 2);
        // double zz = xx + yy;
        // double tarif = Math.sqrt(zz)*3000.00;
        // System.out.printf("Biaya perjalanan dari titik (%.2f,%.2f) ke titik (%.2f,%.2f) adalah = Rp%.2f", x1, y1, x2, y2, tarif);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner cek = new Scanner(System.in); // cek tahun kabisat
        // int tahun = cek.nextInt();
        // cek.close();
        // if (tahun % 4 == 0) {
        //     if (tahun % 100 == 0) {
        //         if (tahun % 400 != 0) {
        //             System.out.println(tahun + " bukan tahun kabisat");
        //         } else {
        //             System.out.println(tahun + " adalah tahun kabisat");
        //         }
        //     } else {
        //         System.out.println(tahun + " adalah tahun kabisat");
        //     }
        // } else {
        //     System.out.println(tahun + " adalah tahun kabisat");
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        
        // Scanner chk = new Scanner(System.in); // NOMOR 4 (3)
        // String ssn = "";
        // int mo = chk.nextInt();
        // if (mo <= 0 || mo >= 13) {
        //     System.out.println("Nomor bulan tidak valid. Masukkan angka 1-12.");
        //     chk.close();
        //     return;
        // }
        // chk.nextLine();
        // String pa = chk.next();
        // chk.close();
        // if (pa.equalsIgnoreCase("Utara")) {
        //     if (mo == 3 || mo == 4 || mo == 5) {
        //         ssn = "Musim Semi";
        //     } else if (mo == 6 || mo == 7 || mo == 8) {
        //         ssn = "Musim Panas";
        //     } else if (mo == 9 || mo == 10 || mo == 11) {
        //         ssn = "Musim Gugur";
        //     } else {
        //         ssn = "Musim Dingin";
        //     }
        //     System.out.printf("Musim pada bulan %d di belahan bumi %s adalah: %s\n", mo, pa, ssn);
        // } else if (pa.equalsIgnoreCase("Selatan")) {
        //     if (mo == 9 || mo == 10 || mo == 11) {
        //         ssn = "Musim Semi";
        //     } else if (mo == 12 || mo == 1 || mo == 2) {
        //         ssn = "Musim Panas";
        //     } else if (mo == 3 || mo == 4 || mo == 5) {
        //         ssn = "Musim Gugur";
        //     } else {
        //         ssn = "Musim Dingin";
        //     }
        //     System.out.printf("Musim pada bulan %d di belahan bumi %s adalah: %s\n", mo, pa, ssn);
        // } else {
        //     System.out.println("Belahan bumi tidak valid. Masukkan 'Utara' atau 'Selatan'.");
        // }
        
        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    
        // @SuppressWarnings("resource")  // NOMOR 4 modifikasi switch case *cc: gefi
        // Scanner chck = new Scanner(System.in);

        // //input bulan
        // System.out.print("Masukkan nomor bulan 1-12: ");
        // int mon = chck.nextInt();

        // // validasi bulan
        // if (mon <= 0 || mon >= 13) {
        //     System.out.println("Nomor bulan tidak valid. Masukkan angka 1-12.");
        //     chck.close();
        //     return;
        // }

        // // input bulan
        // System.out.print("Masukkan belahan bumi 'Utara' atau 'Selatan': ");
        // String par = chck.next().toLowerCase(); // case insensitive

        // // validasi belahan bumi
        // if (!par.equals("utara") && !par.equals("selatan")) {
        //     System.out.println("Belahan bumi tidak valid. Masukkan 'Utara' atau 'Selatan'.");
        //     chck.close();
        //     return;
        // }

        // // menentukan musim
        // String seas = "";
        // switch (par) {
        //     case "utara" :
        //         switch (mon) {
        //             case 3, 4, 5: seas = "Musim Semi"; break;
        //             case 6, 7, 8: seas = "Musim Panas"; break;
        //             case 9, 10, 11: seas = "Musim Gugur"; break;
        //             case 12, 1, 2: seas = "Musim Dingin"; break;
        //             default : seas = "Musim-musiman"; break;
        //         }
        //         break;
        //     case "selatan" :
        //         switch (mon) {
        //             case 3, 4, 5: seas = "Musim Gugur"; break;
        //             case 6, 7, 8: seas = "Musim Dingin"; break;
        //             case 9, 10, 11: seas = "Musim Semi"; break;
        //             case 12, 1, 2: seas = "Musim Panas"; break;
        //             default : seas = "Musim-musiman"; break;
        //         }
        //         break;
        // }

        // // output lengkap
        // System.out.printf("Musim pada bulan %d di belahan bumi %s adalah: %s\n", mon, par, seas);
        // chck.close();

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner bake = new Scanner(System.in); //toko roti
        // System.out.println("SELAMAT DATANG DI TEDDY'S BAKERY");
        // System.out.println("LIST ROTI:");
        // System.out.println("1. Roti Tawar - Rp 10.000,00");
        // System.out.println("2. Roti Gandum - Rp 12.000,00");
        // System.out.println("3. Roti Coklat - Rp 15.000,00");
        // System.out.println("0. Keluar");
        // int sig = 0;
        // int sto = 0;
        // while (true) {
        //     System.out.print("Pilih order dan masukkan jumlah:\n");
        //     int men = bake.nextInt();
        //     if (men > 3 || men < 0) {
        //         System.out.print("Pilihan tidak ada!\n");
        //     } else if (men == 0) {
        //         System.out.printf("Total belanja: Rp %d,00\n",sto);
        //         System.out.print("TERIMA KASIH TELAH BERBELANJA DI TEDDY'S BAKERY");
        //         return;
        //     } else {
        //         int sum = bake.nextInt();
        //         switch (men) {
        //             case 1 : sig = sum*10000;
        //                 break;
        //             case 2 : sig = sum*12000;
        //                 break;
        //             case 3 : sig = sum*15000;
        //                 break;
        //         }
        //         sto += sig;
        //     }
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner tic = new Scanner(System.in); //jual tiket
        // int jti = 0;
        // int mon = 0;
        // int dis = 0;
        // int dic = 0;
        // int net = 0;
        // while (true) {
        //     int tti = tic.nextInt();
        //     for (int i = 1; i <= tti; i++) {
        //         int tin = tic.nextInt();
        //         if (tin < 4) {
        //             net = mon;
        //         } else if (tin < 7) {
        //             mon = tin*50000;
        //             dis = 5*mon/100;
        //             dic += dis;
        //         } else {
        //             mon = tin*50000;
        //             dis = 10*mon/100;
        //             dic += dis;
        //         }
        //         jti += tin;
        //         mon = jti*50000;
        //         net = mon - dic;
        //         if (i == tti) {
        //             System.out.printf("Total transaksi: %5d\n",tti);
        //             System.out.printf("Total tiket terjual: %d\n",jti);
        //             System.out.printf("Total pendapatan: Rp %d\n",mon);
        //             System.out.printf("Total diskon: Rp %d\n",dic);
        //             System.out.printf("Pendapatan bersih: Rp %d\n",net);            
        //         }
        //     }
        //     tic.close();
        //     return;
        // }
        
        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner rem = new Scanner(System.in); //remot tv
        // String beg = rem.next().toLowerCase();
        // if (!beg.equalsIgnoreCase("power")) {
        //     System.out.println("TV OFF");
        //     rem.close();
        //     return;
        // } else {
        //     System.out.println("TV ON");
        // }
        // int chd = 1, vod = 50;
        // while (true) {
        //     String fir = rem.next().toLowerCase();
        //     if (fir.equalsIgnoreCase("channel")) {
        //         String sec = rem.next().toLowerCase();
        //         if (sec.equalsIgnoreCase("up")) {
        //             chd++;
        //             if (chd < 1 || chd > 30) {
        //                 System.out.println("Channel tidak valid");
        //             } else {
        //                 System.out.printf("Channel sekarang: %d\n",chd);
        //             }
        //         } else if (sec.equalsIgnoreCase("down")) {
        //             chd--;
        //             if (chd < 1 || chd > 30) {
        //                 System.out.println("Channel tidak valid");
        //                 chd++;
        //             } else {
        //                 System.out.printf("Channel sekarang: %d\n",chd);
        //             }
        //         } else {
        //             int cha = Integer.parseInt(sec);
        //             if (cha < 1 || cha > 30) {
        //                 System.out.println("Channel tidak valid");
        //             } else {
        //                 System.out.printf("Channel sekarang: %d\n",cha);
        //             }
        //         }
        //     } else if (fir.equalsIgnoreCase("volume")) {
        //         String sec = rem.next().toLowerCase();
        //         if (sec.equalsIgnoreCase("up")) {
        //             vod += 5;
        //             if (vod < 1 || vod > 100) {
        //                 System.out.println("Volume tidak valid");
        //             } else {
        //                 System.out.printf("Volume sekarang: %d\n",vod);
        //             }    
        //         } else if (sec.equalsIgnoreCase("down")) {
        //             vod -= 5;
        //             if (vod < 1 || vod > 100) {
        //                 System.out.println("Volume tidak valid");
        //             } else {
        //                 System.out.printf("Volume sekarang: %d\n",vod);
        //             }    
        //         }
        //     } else if (fir.equalsIgnoreCase("prev")) {
        //         String sec = rem.next().toLowerCase();
        //         if (sec.equalsIgnoreCase("channel")) {
        //             System.out.printf("Channel sekarang: %d\n",chd);
        //         }
        //     } else if (fir.equalsIgnoreCase("mute")) {
        //         System.out.printf("Volume mute\n");
        //     } else if (fir.equalsIgnoreCase("unmute")) {
        //         System.out.printf("Volume sekarang: %d\n",vod);
        //     } else if (fir.equalsIgnoreCase("power")) {
        //         System.out.println("TV OFF");
        //         rem.close();
        //         return;
        //     }
        // }

        // // modify version so no prev channel
        // Scanner rem = new Scanner(System.in);
        // String beg = rem.next().toLowerCase();
        // if (!beg.equalsIgnoreCase("power")) {
        //     System.out.println("TV OFF");
        //     rem.close();
        //     return;
        // } else {
        //     System.out.println("TV ON");
        // }
        // int chd = 1, vod = 50;
        // while (true) {
        //     String fir = rem.next().toLowerCase();
        //     if (fir.equalsIgnoreCase("channel")) {
        //         String sec = rem.next().toLowerCase();
        //         if (sec.equalsIgnoreCase("up")) {
        //             chd++;
        //             if (chd < 1 || chd > 30) {
        //                 System.out.println("Channel tidak valid");
        //             } else {
        //                 System.out.printf("Channel sekarang: %d\n",chd);
        //             }
        //         } else if (sec.equalsIgnoreCase("down")) {
        //             chd--;
        //             if (chd < 1 || chd > 30) {
        //                 System.out.println("Channel tidak valid");
        //                 chd++;
        //             } else {
        //                 System.out.printf("Channel sekarang: %d\n",chd);
        //             }
        //         } else {
        //             int cha = Integer.parseInt(sec);
        //             if (cha < 1 || cha > 30) {
        //                 System.out.println("Channel tidak valid");
        //             } else {
        //                 chd = cha;
        //                 System.out.printf("Channel sekarang: %d\n",cha);
        //             }
        //         }
        //     } else if (fir.equalsIgnoreCase("volume")) {
        //         String sec = rem.next().toLowerCase();
        //         if (sec.equalsIgnoreCase("up")) {
        //             vod += 5;
        //             if (vod < 1 || vod > 100) {
        //                 System.out.println("Volume tidak valid");
        //             } else {
        //                 System.out.printf("Volume sekarang: %d\n",vod);
        //             }    
        //         } else if (sec.equalsIgnoreCase("down")) {
        //             vod -= 5;
        //             if (vod < 1 || vod > 100) {
        //                 System.out.println("Volume tidak valid");
        //             } else {
        //                 System.out.printf("Volume sekarang: %d\n",vod);
        //             }    
        //         }
        //     } else if (fir.equalsIgnoreCase("mute")) {
        //         System.out.printf("Volume mute\n");
        //     } else if (fir.equalsIgnoreCase("unmute")) {
        //         System.out.printf("Volume sekarang: %d\n",vod);
        //     } else if (fir.equalsIgnoreCase("power")) {
        //         System.out.println("TV OFF");
        //         rem.close();
        //         return;
        //     }
        // }

        // // switch case ver
        // Scanner rem = new Scanner(System.in);
        // String beg = rem.next().toLowerCase();
        // switch (beg) {
        //     case "power":
        //         System.out.println("TV ON");
        //         break;
        //     default:
        //         System.out.println("TV OFF");
        //         rem.close();
        //         return;
        // }
        // int chd = 1, vod = 50;
        // while (true) {
        //     String fir = rem.next().toLowerCase();
        //     switch (fir) {
        //         case "channel":
        //             String chn = rem.next().toLowerCase();
        //             switch (chn) {
        //                 case "up":
        //                     chd++;
        //                     if (chd < 1 || chd > 30) {
        //                         System.out.println("Channel tidak valid");
        //                     } else {
        //                         System.out.printf("Channel sekarang: %d\n",chd);
        //                     }
        //                     break;
        //                 case "down":
        //                     chd--;
        //                     if (chd < 1 || chd > 30) {
        //                         System.out.println("Channel tidak valid");
        //                         chd++;
        //                     } else {
        //                         System.out.printf("Channel sekarang: %d\n",chd);
        //                     }
        //                     break;
        //                 default:
        //                     int cha = Integer.parseInt(chn);
        //                     if (cha < 1 || cha > 30) {
        //                         System.out.println("Channel tidak valid");
        //                     } else {
        //                         System.out.printf("Channel sekarang: %d\n",cha);
        //                     }
        //                     break;
        //             }
        //             break;
        //         case "volume":
        //             String vlm = rem.next().toLowerCase();
        //             switch (vlm) {
        //                 case "up":
        //                     vod += 5;
        //                     if (vod < 1 || vod > 100) {
        //                         System.out.println("Volume tidak valid");
        //                     } else {
        //                         System.out.printf("Volume sekarang: %d\n",vod);
        //                     }
        //                     break;
        //                 case "down":
        //                     vod -= 5;
        //                     if (vod < 1 || vod > 100) {
        //                         System.out.println("Volume tidak valid");
        //                     } else {
        //                         System.out.printf("Volume sekarang: %d\n",vod);
        //                     }
        //                     break;
        //             }
        //             break;
        //         case "prev":
        //             String prv = rem.next().toLowerCase();
        //             switch (prv) {
        //                 case "channel":
        //                     System.out.printf("Channel sekarang: %d\n",chd);
        //                     break;
        //             }
        //             break;
        //         case "mute":
        //             System.out.printf("Volume mute\n");
        //             break;
        //         case "unmute":
        //             System.out.printf("Volume sekarang: %d\n",vod);
        //             break;
        //         case "power":
        //             System.out.println("TV OFF");
        //             rem.close();
        //             return;
        //     }
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner nil = new Scanner(System.in);
        // // String name[] = new String[5];
        // int sco[] = new int[5];

        // Arrays.sort(sco);
        // int hig = sco[4];
        // int low = sco[0];
        // int i = 0;
        // if (sco[3] >= 60)
        //     i++;
        // System.out.printf("Nilai tertinggi adalah %d",hig);
        // System.out.printf("Nilai terendah adalah %d",low);
        // System.out.printf("Jumlah siswa yang lulus adalah %d",i);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner form = new Scanner(System.in); // universal numbers
        // String nums = form.nextLine();
        // form.close();
        // if (nums.contains(" ")) {
        //     String pot[] = nums.split(" ");
        //     String sol = pot[0];
        //     String per = pot[1];
        //     String pec[] = per.split("/");
        //     String up = pec[0];
        //     String dow = pec[1];
        //     int upp = Integer.parseInt(up);
        //     int dwn = Integer.parseInt(dow);
        //     int fff = fpb(upp,dwn);
        //     int ppp = upp/fff;
        //     int ddd = dwn/fff;
        //     int zxc = (Integer.parseInt(sol)*Integer.parseInt(dow)+Integer.parseInt(up))/fff;
        //     double dec = Double.parseDouble(sol)+Double.parseDouble(up)/Double.parseDouble(dow);
        //     String mif = sol + " " + String.valueOf(ppp) + "/" + String.valueOf(ddd);
        //     String fra = "/" + ddd;
        //     if (upp > dwn) {
        //         System.out.printf("Desimal: %.1f\n",dec);
        //         System.out.printf("Pecahan campuran: %d\n",zxc);
        //         System.out.printf("Pecahan: %d\n",zxc);    
        //     } else {
        //         System.out.printf("Desimal: %.1f\n",dec);
        //         System.out.printf("Pecahan campuran: %s\n",mif);
        //         System.out.printf("Pecahan: %d%s\n",zxc,fra);
        //     }
        // } else if (nums.contains("/")) {
        //     String per[] = nums.split("/");
        //     String up = per[0];
        //     String dow = per[1];
        //     int upp = Integer.parseInt(up);
        //     int dwn = Integer.parseInt(dow);
        //     int fff = fpb(upp,dwn);
        //     int ppp = upp/fff;
        //     int ddd = dwn/fff;
        //     int amb = upp / dwn;
        //     int amc = 0;
        //     double dec = Double.parseDouble(up)/Double.parseDouble(dow);
        //     String mif = "";
        //     String fra = String.valueOf(ppp) + "/" + String.valueOf(ddd);
        //     if (dwn == 0) {
        //         System.out.printf("Desimal: %.1f\n",dec);
        //         System.out.printf("Pecahan campuran: %s\n",mif);
        //         System.out.printf("Pecahan: %s\n",fra);    
        //     }
        //     if (upp > dwn) {
        //         amc = upp % dwn;
        //     }
        //     if (upp % dwn == 0) {
        //         up = "";
        //         dow = "";
        //         mif = String.valueOf(amb);
        //         fra = String.valueOf(amb);
        //     } else {
        //         mif = ppp + "/" + ddd;
        //     }
        //     System.out.printf("Desimal: %.1f\n",dec);
        //     System.out.printf("Pecahan campuran: %s\n",mif);
        //     System.out.printf("Pecahan: %s\n",fra);
        // } else {
        //     double dec = Double.parseDouble(nums);
        //     int sol = (int) (dec * 1000)/1000;
        //     int per = (int) (dec * 1000) % 1000;
        //     int up = (int) (dec * 1000);
        //     int dow = 1000;
        //     int upp = up;
        //     int dwn = dow;
        //     while (dwn != 0) {
        //         int temp = dwn;
        //         dwn = upp % dwn;
        //         upp = temp;
        //     }
        //     up /= upp;
        //     dow /= upp;
        //     per /= upp;
        //     if (up % dow == 0) {
        //         System.out.println("Desimal: " + (int) dec);
        //         System.out.printf("Pecahan campuran: %d\n", sol +  per/dow);
        //         System.out.printf("Pecahan: %d\n", up/dow);
        //     } else {
        //         System.out.println("Desimal: " + dec);
        //         System.out.printf("Pecahan campuran: %d %d/%d\n", sol, per, dow);
        //         System.out.printf("Pecahan: %d/%d\n", up, dow);
        //     }
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner zzz = new Scanner(System.in); // nilai murids
        // int sst = zzz.nextInt();
        // int sec = zzz.nextInt();
        // String nam[] = new String[sst];
        // double sco[] = new double[sec];
        // double sci[] = new double[sst];
        // double avi = 0, soc = 0, avc = 0, hig = 0;
        // String sma = "";
        // for (int i = 0;i < sst;i++) {
        //     nam[i] = zzz.next();
        //     double sum = 0;
        //     for (int j = 0;j < sec;j++) {
        //         sco[j] = zzz.nextDouble();
        //         sum += sco[j];
        //         for (int k = 0;k < sec;k++) {
        //             sci[k] = sum;
        //             avi = sci[k]/sec;
        //             if (hig < avi) {
        //                 hig = avi;
        //                 sma = nam[i];
        //             }
        //         }
        //     }
        //     soc += avi;
        //     System.out.printf("Rata-rata nilai mahasiswa %s adalah %.2f\n",nam[i],avi);
        // }
        // zzz.close();
        // avc = soc/sst;
        // System.out.printf("Rata-rata kelas: %.2f\n",avc);
        // System.out.printf("Mahasiswa yang memiliki nilai tertinggi adalah %s dengan nilai %.2f\n",sma,hig);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner ren = new Scanner(System.in); // polindrom number
        // int x = ren.nextInt();
        // if (x == 196) {
        //     System.out.println("Bilangan dilarang!");
        //     System.exit(0);
        // } else {
        //     fpal(x);
        // }
        // ren.close();
        
        // -----------------------------------------------------------------------------------------------

        // // perujianan praktikum
        // // utp ayo main kuda
        // Scanner utp = new Scanner(System.in);
        // String ho1 = utp.next();
        // double ti1 = utp.nextInt();
        // String ho2 = utp.next();
        // double ti2 = utp.nextInt();
        // String ho3 = utp.next();
        // double ti3 = utp.nextInt();
        // utp.close();
        // double sp1 = 0;
        // double sp2 = 0;
        // double sp3 = 0;
        // String fh1 = "", fh2 = "", fh3 = "";
        // if (ti1 > ti2) {
        //     if (ti1 > ti3) {
        //         if (ti2 > ti3) {
        //             fh1 = ho3;
        //             fh2 = ho2;
        //             fh3 = ho1;
        //             sp1 = 240/ti3*36;
        //             sp2 = 240/ti2*36;
        //             sp3 = 240/ti1*36;
        //         } else {
        //             fh1 = ho2;
        //             fh2 = ho3;
        //             fh3 = ho1;    
        //             sp1 = 240/ti2*36;
        //             sp2 = 240/ti3*36;
        //             sp3 = 240/ti1*36;
        //         }
        //     } else {
        //         fh1 = ho2;
        //         fh2 = ho1;
        //         fh3 = ho3;
        //         sp1 = 240/ti2*36;
        //         sp2 = 240/ti1*36;
        //         sp3 = 240/ti3*36;
        //     }
        // } else {
        //     if (ti2 > ti3) {
        //         if (ti3 > ti1) {
        //             fh1 = ho1;
        //             fh2 = ho3;
        //             fh3 = ho2;
        //             sp1 = 240/ti1*36;
        //             sp2 = 240/ti3*36;
        //             sp3 = 240/ti2*36;
        //         } else {
        //             fh1 = ho3;
        //             fh2 = ho1;
        //             fh3 = ho2;
        //             sp1 = 240/ti3*36;
        //             sp2 = 240/ti1*36;
        //             sp3 = 240/ti2*36;
        //         }
        //     } else {
        //         fh1 = ho1;
        //         fh2 = ho2;
        //         fh3 = ho3;
        //         sp1 = 240/ti1*36;
        //         sp2 = 240/ti2*36;
        //         sp3 = 240/ti3*36;
        //     }
        // }
        // System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam\n",fh1,sp1);
        // System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam\n",fh2,sp2);
        // System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam\n",fh3,sp3);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // // utp perdomainan
        // Scanner utp = new Scanner(System.in);
        // String em = utp.next(); // input email lama
        // String nd = utp.next(); // input nama user baru
        // String pd = utp.next(); // input domain
        // double pri = utp.nextDouble(); // input harga
        // utp.close();
        // double dis = 0, cos = 0;
        // int aaa = 0, zzz = 0;
        // for (int i = 0; i < em.length(); i++) {
        //     if (em.charAt(i) == '@') {
        //         aaa = i;
        //         break;
        //     }
        // }
        // for (int j = aaa; j < em.length(); j++) {
        //     if (em.charAt(j) == '.') {
        //         zzz = j;
        //     }
        // }
        // String dom = em.substring(zzz);
        // if (dom.equals(".id")) {
        //     dis = 75*pri/100;
        //     cos = pri+dis;
        // } else if (dom.equals(".com")) {
        //     dis = 50*pri/100;
        //     cos = pri+dis;
        // } else if (dom.equals(".net")) {
        //     dis = 25*pri/100;
        //     cos = pri+dis;
        // } else {
        //     cos = pri;
        // }
        // System.out.printf("Nama email baru: %s@%s%s\n",nd,pd,dom);
        // System.out.printf("Nama domain untuk Elon: %s%s\n",pd,dom);
        // System.out.printf("Total harga pembelian: $%.2f\n",cos);

        // -----------------------------------------------------------------------------------------------

        // // pemdas bersama dosen
        // Scanner walaa = new Scanner(System.in);
        // int x = walaa.nextInt();
        // walaa.close();
        // System.out.printf("%o %x %010X %c\n",x,x,x, 'I');

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner tariff = new Scanner(System.in);

        // int harga = tariff.nextInt();
        // if (harga > 100000) {
        //     System.out.println("Selamat! Anda dapat hadiah");
        // } else {
        //     System.out.println("Harga total adalah " + harga);
        // }

        // -----------------------------------------------------------------------------------------------

        // // perlatihan bersama dosen
        // int x = 10, y = 6, z = 25;
        // x *= 5 + y;
        // y += y &= x;
        // z += x >> 2 & y << 1;
        // System.out.printf("x = %d\ny = %d\nz = %d", x, y, z);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // double x;
        // x = 7/2; System.out.printf("x = %f\n", x);
        // x = 7.0/2; System.out.printf("x = %f\n", x);
        // x = 7/2.0; System.out.printf("x = %f\n", x);
        // x = 7.0/2.0; System.out.printf("x = %f\n", x);
        // x = (float)7/2; System.out.printf("x = %f\n", x);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // int y, n;
        // n = 10; y = ++n; System.out.printf("y = %d\n", y);
        // n = 10; y = n++; System.out.printf("y = %d\n", y);
        // n = 10; n++; System.out.printf("n = %d\n", n);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
       
        // int i, j;
        // for (i = 0, j = 1; i < 8; i++ , j++) {
        //     System.out.printf("%d + %d = %d\n",i,j,i+j);
        // }
       
        // int i, j;
        // for (i = 0, j = 1; i < 8; ++i , ++j) {
        //     System.out.printf("%d + %d = %d\n",i,j,i+j);
        // }
       
        // int x = 0;
        // for ( ; ; ) {
        //     if (x < 10) {
        //         System.out.printf("Hello\n");
        //     } else {
        //         break;
        //     }
        //     x++;
        // }
        
        // int i = 11;
        // do {
        //     if (i%2 != 0) {
        //         System.out.printf("%d ",i);;
        //     }
        //     i++;
        // } while (i < 189);

        // Scanner asd = new Scanner(System.in);
        // int day = asd.nextInt();
        // for (int i = 1;i <= day;i++) {
        //     int dday = i % 7 == 0 ? 7 : i%7;
        //     System.out.printf("%d ",dday);
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // int y, n;
        // n = 10; y = ++n; System.out.printf("y = %d\n", y);
        // n = 10; y = n++; System.out.printf("y = %d\n", y);
        // n = 10; n++; System.out.printf("n = %d\n", n);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
       
        // int y, n;
        // n = 10; y = ++n; System.out.printf("y = %d\n", y);
        // n = 10; y = n++; System.out.printf("y = %d\n", y);
        // n = 10; n++; System.out.printf("n = %d\n", n);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner frut = new Scanner(System.in); //challenge 1
        // System.out.println("SELAMAT DATANG DI FRUTTY FRUITY");
        // System.out.println("LIST BUAH:");
        // System.out.println("1. Pisang - Rp 28.000,00/kg");
        // System.out.println("2. Jambu - Rp 22.000,00/kg");
        // System.out.println("3. Pir - Rp 24.000,00/kg");
        // System.out.println("0. Keluar");
        // int sig = 0;
        // int sto = 0;
        // int stc[][] = new int[][]{{1,28000},{2,22000},{3,24000}};
        // while (true) {
        //     System.out.print("Pilih kode buah dan masukkan berat:\n");
        //     int men = frut.nextInt();
        //     if (men > 3 || men < 0) {
        //         System.out.print("Pilihan tidak ada!\n");
        //     } else if (men == 0) {
        //         System.out.printf("Total belanja: Rp %d,00\n",sto);
        //         System.out.print("TERIMA KASIH TELAH BERBELANJA DI FRUTTY FRUITY");
        //         return;
        //     } else {
        //         int sum = frut.nextInt();
        //         switch (men) {
        //             case 1 :
        //                 // stc[0][0]
        //                 sig = sum*28000;
        //                 break;
        //             case 2 :
        //                 sig = sum*22000;
        //                 break;
        //             case 3 :
        //                 sig = sum*24000;
        //                 break;
        //         }
        //         sto += sig;
        //     }
        // }

        // -----------------------------------------------------------------------------------------------
        
        // // self projects
        // Scanner calc = new Scanner(System.in); // kalkulator pemalas here
        // System.out.println("--kalkulator pemalas--");
        // System.out.println("panduan: q = tambah");
        // System.out.println("         w = kurang");
        // System.out.println("         e = kali");
        // System.out.println("         r = bagi");
        // System.out.println("         y = dah");
        // double sum = 0;
        // while (true) {
        //     String amr = calc.next().toLowerCase();
        //     if (amr.equalsIgnoreCase("y")) {
        //         return;
        //     }
        //     double nums = calc.nextDouble();
        //     if (amr.equalsIgnoreCase("q")) {
        //         sum += nums;
        //     } else if (amr.equalsIgnoreCase("w")) {
        //         sum -= nums;
        //     } else if (amr.equalsIgnoreCase("e")) {
        //         sum *= nums;
        //     } else if (amr.equalsIgnoreCase("r")) {
        //         sum /= nums;
        //     } else {
        //         sum = sum;
        //     }
        //     System.out.printf("%.1f\n",sum);
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner yo = new Scanner(System.in); // baris deret aritmatika dan geometri
        // System.out.println("Arit/Geo?");
        // String pen = yo.next();
        // int i = 1, j = 1;
        // if (pen.equalsIgnoreCase("arit")) {
        //     System.out.print("Masukkan suku pertama: ");
        //     double aa = yo.nextDouble();
        //     System.out.print("Masukkan beda: ");
        //     double bb = yo.nextDouble();
        //     System.out.print("Masukkan suku ke-n: ");
        //     double cc = yo.nextDouble();
        //     System.out.print("Berikut ini adalah baris dan deret aritmatikanya:\n");
        //     yo.close();
        //     double dd = 0, ee = 0;
        //     for (i = 1; i <= cc; i++) { // baris aritmatika
        //         dd = aa + (i-1)*bb;
        //         System.out.printf("%.0f, ",dd);
        //     }
        //     System.out.println("");
        //     for (i = 1; i <= cc; i++) { // deret aritmatika
        //         ee = i/2.0 * (2.0*aa + (i-1)*bb);
        //         System.out.printf("%.0f, ",ee);
        //     }
        //     System.out.printf("\nSuku ke-%.0f dari barisan tersebut adalah %.0f",cc,dd);
        //     System.out.printf("\nJumlah suku-suku dari barisan tersebut adalah %.0f",ee);
        // } else if (pen.equalsIgnoreCase("geo")) {
        //     System.out.print("Masukkan suku pertama: ");
        //     double aa = yo.nextDouble();
        //     System.out.print("Masukkan rasio: ");
        //     double bb = yo.nextDouble();
        //     if (bb == 1) {
        //         System.out.println("Baris dan deret geometri tidak bisa berpangkat 1.");
        //         yo.close();
        //         return;
        //     }
        //     System.out.print("Masukkan suku ke-n: ");
        //     double cc = yo.nextDouble();
        //     System.out.print("Berikut ini adalah baris dan deret geometrinya:\n");
        //     yo.close();
        //     double dd = 1, ee = 1;
        //     for (j = 1; j <= cc; j++) { // baris geo
        //         dd = aa*Math.pow(bb, j-1);
        //         System.out.printf("%.0f, ",dd);
        //     }
        //     System.out.println("");
        //     if (bb > 1) { // deret geo
        //         for (j = 1; j <= cc; j++) {
        //             ee = aa*(Math.pow(bb, j)-1)/(bb-1);
        //             System.out.printf("%.0f, ",ee);
        //         }
        //     } else if (bb < 1) {
        //         for (j = 1; j <= cc; j++) {
        //             ee = aa*(1-Math.pow(bb, j))/(1-bb);
        //             System.out.printf("%.2f, ",ee);
        //         }
        //     }
        //     System.out.printf("\nSuku ke-%.0f dari barisan tersebut adalah %.0f",cc,dd);
        //     System.out.printf("\nJumlah suku-suku dari barisan tersebut adalah %.0f",ee);
        // } else {
        //     System.out.println("aritmatika ato geometri ha???");
        //     yo.close();
        //     return;
        // }
        
        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner fak = new Scanner(System.in); // mencari faktorial dari n pake for
        // int sum = 1;
        // System.out.print("Masukkan angka: ");
        // int num = fak.nextInt();
        // fak.close();
        // if (num == 0) {
        //     System.out.printf("%d!= 1 | ",num);
        // }
        // for (int i = 1;i <= num; i++) {
        //     sum *= i;
        //     System.out.printf("%d!= %d | ",i,sum);
        //     if (i == num) {
        //         return;
        //     }
        // }

        // long bil, tmp, x = 1; // mencari faktorial dari n pake while *cc materi brone
        // System.out.print("Input bil: ");
        // bil = fak.nextLong();
        // fak.close();
        // tmp = bil;
        // while (bil > 1) {
        //     x *= bil--;
        //     System.out.printf("\n%d ! = %d",tmp,x);
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner pri = new Scanner(System.in); // nyari bil prima
        // int fir = pri.nextInt();
        // int las = pri.nextInt();
        // int x, y, flg;
        // System.out.println("Semua bilangan prima dari 2 sampai " + las + " adalah:");
        // for (x = 1; x <= las; x++) {
        //     if (x == 1 || x == 0)
        //         continue;
        //     // Pakai variabel flag untuk cek apakah x adalah prima atau tidak
        //     flg = 1;
        //     for (y = 2; y <= x / 2; ++y) {
        //         if (x % y == 0) {
        //             flg = 0;
        //             break;
        //         }
        //     }
        //     // Jika flag = 1 maka x adalah prima, tetapi jika flag = 0 maka x bukan prima
        //     if (flg == 1)
        //         System.out.print(x + " ");
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        
        // Scanner pyt = new Scanner(System.in); // nyari pytharogas
        // double a = pyt.nextDouble();
        // double b = pyt.nextDouble();
        // double c = Math.pow(a, 2);
        // double d = Math.pow(b, 2);
        // double e = c + d;
        // double f = Math.sqrt(e);
        // System.out.println(f);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner aaa = new Scanner(System.in);
        // System.out.print("Masukkan jumlah baris gambar: ");
        // int n = aaa.nextInt();
        // aaa.close();

        // // segitiga siku kuwalik
        // for (int i = n; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("# ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("");
        
        // //segitiga siku normal
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("# ");
        //         if (i == j) {
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println("");

        // //segitiga sama kaki
        // for (int i = 1; i <= n; i++) {
        //     for (int s = n-i; s > 0; s--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= n; j++) {
        //         if (j % 2 == 0) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("# ");
        //         }
        //         if (i == j) {
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        
        // //modify dr kopin
        // Scanner aaa = new Scanner(System.in);
        // System.out.print("Masukkan jumlah baris gambar: ");
        // int n = aaa.nextInt();
        // aaa.close();

        // // segitiga siku kebalik
        // for (int i = n; i > 0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if (i == n) {
        //             if (j == 1){
        //                 System.out.print(".");
        //             }
        //             System.out.print("_");
        //             continue;
        //         }
        //         if ((j == 1) & (i != n)) {
        //             if (i != 1) {
        //                 System.out.print("|");
        //                 continue;
        //             }
        //         }
        //         if (i == 1) {
        //             System.out.print("| /");
        //             System.out.println();
        //             System.out.print("|/");
        //             break;
        //         }
        //         System.out.print(" ");
        //         if (j == i) {
        //             System.out.print(" /");
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        // //segitiga normal
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == n) {
        //             if (j == 1){
        //                 System.out.print(".");
        //             }
        //             System.out.print("_");
        //             continue;
        //         }
        //         if ((j == 1) & (i != n)) {
        //             if (i != 1) {
        //                 System.out.print("|");
        //                 continue;
        //             }
        //         }
        //         if (i == 1) {
        //             System.out.print("| x");
        //             System.out.println();
        //             System.out.print("|x");
        //             break;
        //         }
        //         System.out.print(" ");
        //         if (j == i) {
        //             System.out.print(" y");
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        Scanner rand = new Scanner(System.in); // guess a number with me
        Random rnd = new Random();
        double z = rnd.nextInt(500);
        System.out.println(z);
        while (true) {
            double x = rand.nextDouble();
            if (x < z) {
                System.out.println("Terlalu rendah.");
            } else if (x > z) {
                System.out.println("Terlalu tinggi.");
            } else {
                System.out.println("Angka benar.");
                rand.close();
                return;
            }
        }

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner sig = new Scanner(System.in); // tugas aok persigmaan (dlm code)
        // int num = sig.nextInt();
        // int y = 0;
        // for (int i = 1;i <= 10;i++) {
        //     int z = num*i+2;
        //     y += z;
        //     System.out.printf("x%d: %d\n",i,z);
        // }
        // System.out.println("Total x = " + y);

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // Scanner cac = new Scanner(System.in); // perenkripsi dan deskripsian
        // System.out.print("Message to encrypt: \n"); // enkripsi
        // String mese = cac.nextLine().toLowerCase();
        // System.out.print("Shift value for message: \n");
        // int shie = cac.nextInt();
        // String enm = encrypt(mese, shie);
        // System.out.printf("Here is your encrypted message: %s\n",enm);
        // System.out.print("Message to decrypt: \n"); // deskripsi
        // String mesd = cac.nextLine().toLowerCase();
        // System.out.print("Shift value for message: \n");
        // int shid = cac.nextInt();
        // String dem = decrypt(mesd, shid);
        // System.out.printf("Here is your decrypted message: %s\n",dem);
    }

    private static String encrypt(String mes, int shi) {
        StringBuilder enm = new StringBuilder();
        for (int i = 0;i < mes.length();i++) {
            char yyy = mes.charAt(i);
            if (Character.isLetter(yyy)) {
                yyy = (char) ((yyy - 'a' + shi + 26) % 26 + 'a');
            }
            enm.append(yyy);
        }
        return enm.toString();
    }

    private static String decrypt(String mes, int shi) {
        StringBuilder dem = new StringBuilder();
        for (int i = 0;i < mes.length();i++) {
            char yyy = mes.charAt(i);
            if (Character.isLetter(yyy)) {
                yyy = (char) ((yyy - 'a' - shi + 26) % 26 + 'a');
            }
            dem.append(yyy);
        }
        return dem.toString();
    }

    private static int fpb(int a, int b) { // method fpb
        if (b == 0) {
            return a;
        }
        return fpb(b, a % b);
    }

    public static void fpal(int run) {
        while (!rev(run)) {
            int rvd = rvn(run);
            int sum = run + rvd;
            System.out.println(run + " + " + rvd + " = " + sum);
            run = sum;
        }
        System.out.println(run + " merupakan bilangan palindrome");
    }

    private static boolean rev(int run) {
        String nums = Integer.toString(run);
        int lft = 0;
        int rgt = nums.length() - 1;
        while (lft < rgt) {
            if (nums.charAt(lft) != nums.charAt(rgt)) {
                return false;
            }
            lft++;
            rgt--;
        }
        return true;
    }

    private static int rvn(int run) {
        int rvr = 0;
        while (run != 0) {
            rvr = rvr * 10 + run % 10;
            run /= 10;
        }
        return rvr;
    }
} //jangan diapus