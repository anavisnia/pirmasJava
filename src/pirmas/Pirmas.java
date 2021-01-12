package pirmas;

import java.util.Scanner;

public class Pirmas {

    public static void main(String[] args) {
//        byte mazas;     // 8bit      -128 127
//        short trumpas;  // 16bit     -32768 32767
//        int normalus;   // 32bit    -2,147,486,648  2,147,483,647
//        long ilgas;     // 64bit     -9,223,372,036,854,755,808     9,233,372,036,854,775,807
//        float trupmena; // 32bit
//        double didele;  // 64bit
//        boolean arTiesa; // true / false
//        char simbolis;   // 16bit

//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ivesk 1 skaiciu:");
//        
//        int pirmas = sc.nextInt();
//        
//        System.out.println("Ivesk 2 skaiciu:");
//        
//        double antras = sc.nextDouble();
//        
//        double suma = pirmas + antras;
//        
//        System.out.println("suma: " + suma);
        //    char c = 'g'; // vienas vienintelis simbolius
        //    char i = '\u54ab'; // \ u parodo kad tai bus vienas simbolius ir ju turi buti tik 4
//        boolean d;
//        d = true;
/*      Scanner sc = new Scanner(System.in);
        int sk = sc.nextInt();

        if (sk > 0) {
            System.out.println("teigiamas");
            System.out.println("dar vienas veiksmas");
        } else {
            System.out.println("neigiamas");
        }
        System.out.println("pabaiga");
*/     
/*
        if(sk < 0) {
            System.out.println("neigiamas");
        } else if (sk == 0) {
            System.out.println("nulis");
        } else if (sk < 10) {
            System.out.println("mazas");
        } else if (sk < 100) {
            System.out.println("vidutinis");
        } else {
            System.out.println("didelis");
        }
        System.out.println("pabaiga");
        
        
        System.out.println("nuo");
        int nuo = sc.nextInt();
        System.out.println("iki");
        int iki = sc.nextInt();
        
        while (nuo <= iki) {
            System.out.println(nuo);
            nuo += 1;
        }
        
        System.out.println("pabaiga");
*/ 
        // ********************************************************************
        // Homework
        // ********************************************************************
        /*
        daugybos lentele pvz kaip turi atrodyti
        nuo 5 iki 7 
        5*5 5*6 5*7
        6*5 6*6 6*7
        7*5 7*6 7*7
        */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nuo:");
//        int nuo = sc.nextInt();
//        System.out.println("iki");
//        int iki = sc.nextInt();
//        System.out.println("");
        
/*        while(nuo <= iki) {
            if(nuo == iki) {
                System.out.print(nuo + " ");
                nuo = iki * iki;
            }
            System.out.print(nuo + " ");
            nuo = nuo * iki;
*/
            // tik ivesti skaiciai
//            while(nuo <= iki) {
//                System.out.println(nuo);
//                nuo = nuo * iki;
//                System.out.println(nuo);
//            }
            // nuo 1 iki 3 ihardkodinta
           /* while(nuo <= iki) {
                System.out.println(nuo);
                System.out.println(nuo * (nuo + 1));
                System.out.println(nuo * iki);
                
                nuo++;
                System.out.println(nuo);
                System.out.println(nuo * nuo);
                System.out.println(nuo * iki);
                nuo--;
                
                System.out.println(iki);
                System.out.println(iki * (iki - nuo));
                System.out.println(iki * iki);
                break;
            }
            */
           
           // jeigu tris skaicia......
        /*   while(nuo < iki) {
               int a = nuo;
               int b = iki;
            if (a == nuo) {
                System.out.println(a * a);
                System.out.println(a * (a + 1));
                System.out.println(a * b);
            }
            if (a > nuo && a < iki) {
                System.out.println((a + 1) * a);
                System.out.println((a + 1) * (a + 1));
                System.out.println((a + 1) * b);
            }
            if (b == iki) {
                System.out.println(b *  a);
                System.out.println(b * (a + 1));
                System.out.println(b * b);
            }
            break;
           }
        */
        
        // kolegu sprendimas
        /*
           int x = nuo;
           int y = iki - nuo + 1;
           
           while(nuo <= iki) {
               while(x <= iki) {
                   System.out.print(x * nuo + " ");
                   x++;
               }
               System.out.println();
               nuo++;
               x = x - y;
           }
           */
        // *******************************************************
       // Klases sprendymas 
       /*
        int i = nuo;
        while ( i<= iki) {
            int j = nuo;
            while (j <= iki) {
                System.out.print(i * j + " ");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
        System.out.println("pabaiga");
        */
       
       // int i = 3;
       // int j = 5;
//       do {
//           System.out.println(i);
//           i += 1;
//       }while (i < j);
       
       
//       while (i < j) {{
//           System.out.println(i);
//           i += 1;
//       }

//    int i;
//    int ats = 0;
//    for (i = 15; i <= 37; i++) {
//        ats += i;
//        }
//        System.out.println(ats);

        //double d = Math.random();
        //System.out.println(d);
        
        // 1. Akmuo
        // 2. Zirkles
        // 3. Poperius
        // 0. Pabaiga
        
        System.out.println("1. Akmuo");
        System.out.println("2. Zirkles");
        System.out.println("3. Poperius");
        System.out.println("0. Pabaiga");
        
        Scanner sc = new Scanner(System.in);
        int zp = sc.nextInt();
        
        int kp = (int) (Math.random() * 3) + 1;
        
    }
}
