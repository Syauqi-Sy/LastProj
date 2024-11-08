import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//main program
public class test {
    public static void main (String[] args) {
        // //perlatihan praktikum
        // Scanner input = new Scanner(System.in);
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
        //     System.out.println("aritmatika ato geometri???");
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

        // // segitiga siku kebalik
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
}
