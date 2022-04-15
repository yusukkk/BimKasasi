package projelerim;

import java.util.Scanner;

public class BimKasasi {
    public static void main(String[] args) {
       /*
 __   __               _    _
 \ \ / /   _ ___ _   _| | _| | __
  \ V / | | / __| | | | |/ / |/ /
   | || |_| \__ \ |_| |   <|   <
   |_| \__,_|___/\__,_|_|\_\_|\_\

        */

        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            int top;
            for (; ; ) {
                System.out.println("!!!Şu anlık elımızde 1 - 10 barkodd nolu ürünler var!!!");
                System.out.print("Ürünün barkodunu okutunuz ");
                top = sc.nextInt();
                switch (top) {
                    case 1:
                        System.out.println("Cocostar " + "1,99 TL");
                        int coco = 2;
                        top += coco;
                        break;
                    case 2:
                        System.out.println("Patitio " + "6,99 TL");
                        int pat = 7;
                        top += pat;
                        break;
                    case 3:
                        System.out.println("Su " + "1,99 TL");
                        int su = 2;
                        top += su;
                        break;
                    case 4:
                        System.out.println("Tada durum " + "7,99 TL");
                        int cig = 8;
                        top += cig;
                        break;
                    case 5:
                        System.out.println("Lecola " + "5,99 TL");
                        int le = 6;
                        top += le;
                        break;
                    case 6:
                        System.out.println("Leporta " + "5,99 TL");
                        int lp = 6;
                        top += lp;
                        break;
                    case 7:
                        System.out.println("Bebeto jelibon " + "3,99 TL");
                        int bebeto = 4;
                        top += bebeto;
                        break;
                    case 8:
                        System.out.println("Dido " + " 3,99 TL");
                        int dido = 4;
                        top += dido;
                        break;
                    case 9:
                        System.out.println("Eti karam " + " 3,99 TL");
                        int eti = 4;
                        top += eti;
                        break;
                    case 10:
                        System.out.println("Bigboble " + " 1,99 TL");
                        int big = 2;
                        top += big;
                        break;
                    default:
                        System.out.println("Şu an bu barkod ile ürün bulunmuyo");
                        break;
                }
                System.out.println("İşleme devam etmek için 1 istemiyosan 2");
                int tek = sc.nextInt();
                if (tek == 2) {
                    System.out.println("Ödeme işlemine geçiliyo");
                    break;

                } else if (tek == 1) {
                    System.out.println("İşlem devam ediyo");
                }
                else{
                    System.out.println("Yanliş değere girişimi");
                }
            }
            //odeme ilsemi
            System.out.println("Ödemenız gereken tutar " + top+" TL");
            System.out.print("Verilen miktar = ");
            int pu = sc.nextInt();
            if ((pu - top) <= 0) {
                System.out.println("Yetersiz bakiye");
            }
            if ((pu - top) >= 0) {
                System.out.println("Artan para = " + (top - pu) + " TL");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                return;
            }
        }
    }
}