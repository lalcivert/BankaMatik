package day01;

import java.util.Scanner;

public class BankaMatik {
    public static void main(String[] args) {
        String kullaniciAdi,sifre;
        Scanner input = new Scanner(System.in);
        int girisHakki = 3;
        int bakiye = 1500;
        int islem;
        while(girisHakki > 0) {
            System.out.print("Kullanıcı Adınız : ");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifreniz : ");
            sifre = input.nextLine();

            if(kullaniciAdi.equals("patika") && sifre.equals("0404")) {
                System.out.println("Merhaba, AğrıBank'a hoşgeldiniz! ");

              do {
                  System.out.println("1-Para yatırma\n" +
                          "2-Para çekme\n" +
                          "3-Bakiye sorgula\n" +
                          "4-Çıkış yap");
                  System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                  islem = input.nextInt();

            switch (islem){
                case 1 :
                    System.out.println("Para miktarını giriniz: ");
                    int miktar = input.nextInt();
                    bakiye +=miktar;
                    break;

                case 2 :
                    System.out.println("Para miktarını giriniz: ");
                    int miktar2 = input.nextInt();
                    if(miktar2 > bakiye) {
                        System.out.println("Bakiye yetersiz.");
                    }else{
                        bakiye-=miktar2;
                    }
                    break;

                case 3 :
                    System.out.println("Bakiyeniz: "+bakiye);
                    break;


            }
              }while(islem !=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }else {
                girisHakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz..");
                if(girisHakki == 0) {
                    System.out.println("Hesabınız bloke edilmiştir lütfen banka ile iletişime geçiniz..");
                }else {
                    System.out.println("Kalan Hakkınız: "+girisHakki);
                }
            }
        }

    }
}
