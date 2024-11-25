import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] op = new String[] {"KPK dan FPB", "Bilangan Prima", "Baris Deret Aritmatika, Geometri, Fibonacci", "Faktorial", "Angka Palindrom"};
        System.out.println("Halo");
        System.out.println("Selamat Datang");
        System.out.println("MathAdv oleh syauqi.sy");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("                                   ***Operasi yang tersedia***");
        System.out.println("     1      |       2        |                      3                      |     4     |        5");
        for (int i = 0; i <= op.length; i++) {
            if (i == op.length-1) {
                System.out.print(op[i]);
                break;
            } else {
                System.out.print(op[i] + " | ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.print("Pilih operasi yang ingin Anda gunakan: ");
        int pil = scanner.nextInt();
        switch (pil) {
            case 1:
                System.out.println("Anda memilih operasi '" + op[pil-1] + "'.");
                System.out.print("Masukkan angka pertama: ");
                int aaa = scanner.nextInt();
                System.out.print("Masukkan angka kedua: ");
                int bbb = scanner.nextInt();
                int kpk = kpk(aaa, bbb);
                int fpb = fpb(aaa, bbb);
                System.out.println("KPK dari kedua bilangan tersebut adalah: " + kpk);
                System.out.println("FPB dari kedua bilangan tersebut adalah: " + fpb);
                break;
            case 2:
                System.out.println("Anda memilih operasi '" + op[pil-1] + "'.");
                System.out.print("Masukkan angka pertama: ");
                int pfi = scanner.nextInt();
                System.out.print("Masukkan angka terakhir: ");
                int pla = scanner.nextInt();
                System.out.println("Semua bilangan prima dari " + pfi + " sampai " + pla + " adalah:");
                prima(pfi, pla);
                break;
            case 3:
                System.out.println("Anda memilih operasi '" + op[pil-1] + "'.");
                System.out.println("Aritmatika | Geometri | Fibonacci");
                System.out.println("    1      |     2    |     3");
                int pen = scanner.nextInt();
                switch (pen) {
                    case 1:
                        System.out.print("Masukkan suku pertama: ");
                        double aa = scanner.nextDouble();
                        System.out.print("Masukkan beda: ");
                        String tbb = scanner.next();
                        if (tbb.contains(".")) {
                            System.out.println("Mohon maaf, bilangan bertipe float tidak diperbolehkan.");
                            scanner.close();
                            return;
                        }
                        int bb = Integer.parseInt(tbb);
                        if (bb == 0) {
                            System.out.println("Beda bilangan tidak boleh 0.");
                            scanner.close();
                            return;
                        }
                        System.out.print("Masukkan suku ke-n: ");
                        double cc = scanner.nextDouble();
                        System.out.println("Berikut ini adalah baris dan deret aritmatikanya:");
                        scanner.close();
                        arithm(aa, bb, cc);
                        break;
                    case 2:
                        System.out.print("Masukkan suku pertama: ");
                        double dd = scanner.nextDouble();
                        System.out.print("Masukkan rasio: ");
                        double ee = scanner.nextDouble();
                        if (ee == 1) {
                            System.out.println("Baris dan deret geometri tidak bisa berpangkat 1.");
                            scanner.close();
                            return;
                        }
                        System.out.print("Masukkan suku ke-n: ");
                        double ff = scanner.nextDouble();
                        System.out.println("Berikut ini adalah baris dan deret geometrinya:");
                        scanner.close();
                        geo(dd, ee, ff);
                        break;
                    case 3:
                        System.out.print("Masukkan suku ke-n: ");
                        int gg = scanner.nextInt();
                        System.out.println("Berikut ini adalah baris fibonaccinya:");
                        scanner.close();
                        fibo(gg);
                        break;
                    default:
                        System.out.println("Pilih 1 untuk aritmatika, 2 untuk geometri, dan 3 untuk fibonacci.");
                        scanner.close();
                        return;
                }
                break;
            case 4:
                System.out.println("Anda memilih operasi '" + op[pil-1] + "'.");
                System.out.print("Masukkan angka: ");
                int num = scanner.nextInt();
                scanner.close();
                faktor(num);
                break;
            case 5:
                System.out.println("Anda memilih operasi '" + op[pil-1] + "'.");
                System.out.print("Masukkan angka: ");
                int x = scanner.nextInt();
                scanner.close();
                if (x == 196) {
                    System.out.println("Bilangan dilarang!");
                    System.exit(0);
                } else {
                    fpal(x);
                }
                break;
            default:
                System.out.println("Mohon maaf, untuk sementara hanya tersedia 5 operasi di atas...");
                break;
        }
    }

    private static int kpk(int a, int b) { // fungsi kpk
        return Math.abs(a*b) / fpb(a, b);
    }

    private static int fpb(int a, int b) { // fungsi fpb
        if (b == 0) {
            return a;
        }
        return fpb(b, a % b);
    }

    private static void prima(int aa,int bb) { // prosedur mencari bilangan prima
        int flg;
        for (int i = aa; i <= bb; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            flg = 1;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1) {
                System.out.print(i + " ");
            }
        }
    }

    private static void faktor(int aa) { // prosedur faktorial
        long sum = 1;
        if (aa == 0) {
            System.out.printf("%d!= 1 | ",aa);
        }
        for (int i = 1;i <= aa; i++) {
            if (i == aa) {
                System.out.printf("%d!= %d ",i,sum);
                return;
            }
            sum *= i;
            System.out.printf("%d!= %d | ",i,sum);
        }
    }

    private static void arithm(double aa,double bb,double cc) { // prosedur baris deret aritmatika
        int i;
        double dd = 0, ee = 0;
        for (i = 1; i <= cc; i++) { // baris aritmatika
            dd = aa + (i-1)*bb;
            if (i == cc) {
                System.out.printf("%.0f",dd);
                break;
            }
            System.out.printf("%.0f, ",dd);
        }
        System.out.println("");
        for (i = 1; i <= cc; i++) { // deret aritmatika
            ee = i/2.0 * (2.0*aa + (i-1)*bb);
            if (i == cc) {
                System.out.printf("%.0f",ee);
                break;
            }
            System.out.printf("%.0f, ",ee);
        }
        System.out.printf("\nSuku ke-%.0f dari barisan tersebut adalah %.0f",cc,dd);
        System.out.printf("\nJumlah suku-suku dari barisan tersebut adalah %.0f",ee);
    }

    private static void geo(double aa,double bb,double cc) { // prosedur baris deret geometri
        int j;
        double dd = 1, ee = 1;
        for (j = 1; j <= cc; j++) { // baris geo
            dd = aa*Math.pow(bb, j-1);
            if (j == cc) {
                System.out.printf("%.0f",dd);
                break;
            }
            System.out.printf("%.0f, ",dd);
        }
        System.out.println("");
        if (bb > 1) { // deret geo
            for (j = 1; j <= cc; j++) {
                ee = aa*(Math.pow(bb, j)-1)/(bb-1);
                if (j == cc) {
                    System.out.printf("%.0f",ee);
                    break;
                }    
                System.out.printf("%.0f, ",ee);
            }
        } else if (bb < 1) {
            for (j = 1; j <= cc; j++) {
                ee = aa*(1-Math.pow(bb, j))/(1-bb);
                if (j == cc) {
                    System.out.printf("%.0f",ee);
                    break;
                }    
                System.out.printf("%.2f, ",ee);
            }
        }
        System.out.printf("\nSuku ke-%.0f dari barisan tersebut adalah %.0f",cc,dd);
        System.out.printf("\nJumlah suku-suku dari barisan tersebut adalah %.0f",ee);
    }

    private static void fibo(int aa) { // prosedur baris fibonacci
        int k;
        int bb = 0, cc = 1, dd = 0;
        for (k = 0; k < aa; k++) { // baris fibonacci
            if (k == 0) {
                bb = 0;
            } else if (k == 1) {
                bb = 1;
            } else {
                dd = bb + cc;
                bb = cc;
                cc = dd;
            }
            if (k == aa-1) {
                System.out.printf("%d",bb);
                break;
            }
            System.out.printf("%d, ",bb);
        }
        System.out.printf("\nSuku ke-%d dari barisan tersebut adalah %d",aa,bb);
    }

    private static void fpal(int run) { // prosedur mencari bilangan palindrom
        while (!rev(run)) {
            int rvd = rvn(run);
            int sum = run + rvd;
            System.out.println(run + " + " + rvd + " = " + sum);
            run = sum;
        }
        System.out.println(run + " merupakan bilangan palindrom");
    }

    private static boolean rev(int run) { // fungsi cek kesamaan angka
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

    private static int rvn(int run) { // fungsi mengambil angka terakhir
        int rvr = 0;
        while (run != 0) {
            rvr = rvr * 10 + run % 10;
            run /= 10;
        }
        return rvr;
    }
}
