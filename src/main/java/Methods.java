public class Methods extends Depo {
    static void AnaMenu() {
        System.out.println("Hosgeldiniz\n Yapmak istediğiniz islemi seçiniz.\n" +
                "1- Urun Tanimlama \n2- Urun Listeleme\n3- Urun Girisi\n4- Urunu Rafa Koy\n5-Urun Cikis\n6-Cikis");
        secim = scan.next();
        switch (secim) {
            case "1":
                urunTanimlama();
            case "2":
                urunListeleme();
            case "3":
                urunGirisi();
            case "4":
                urunRafaKoy();
            case "5":
                urunCikis();
            case "6":
                System.out.println("Iyi calismalar");
                System.exit(0);
            default:
                System.out.println("Yanlis Giris Yaptiniz");
                AnaMenu();
        }

    }

    private static void urunCikis() {
        System.out.println(urunList);
        System.out.println("Cikis yapmak istediğiniz Urun Id` sini giriniz");
        idSecim = scan.nextInt();
        if (idList.contains(idSecim)) {
            urunIsimList.remove(idList.indexOf(idSecim));
            ureticiList.remove(idList.indexOf(idSecim));
            miktarList.remove(idList.indexOf(idSecim));
            birimList.remove(idList.indexOf(idSecim));
            rafList.remove(idList.indexOf(idSecim));
            urunList.remove(idList.indexOf(idSecim));
            idList.remove((Integer) idSecim);
            System.out.println("yapmak istediğiniz islemi giriniz\n1- Ana Menu \n2- Urun Cikis");
            secim = scan.next();
            switch (secim) {
                case "1":
                    AnaMenu();
                case "2":
                    urunCikis();
                default:
                    System.out.println("Yanlis Giris Yaptiniz");
                    urunCikis();
            }
        }else {
            System.out.println("Yanlis id girdiniz");
            urunCikis();
        }



    }

    private static void urunRafaKoy() {
        System.out.println(urunList);
        System.out.println("Rafa koymak istediğiniz Urun Id` sini giriniz");
        idSecim = scan.nextInt();
        System.out.println("Hangi rafa koymak istediğinizi giriniz");
        raf = scan.next();
        if (idList.contains(idSecim)) {
            rafList.set(idList.indexOf(idSecim), raf);
            urunList.get(idList.indexOf(idSecim)).setRaf(raf);
            System.out.println("yapmak istediğiniz islemi giriniz\n1- Ana Menu \n2- Urun rafa koy");
            secim = scan.next();
            switch (secim) {
                case "1":
                    AnaMenu();
                case "2":
                    urunRafaKoy();
                default:
                    System.out.println("Yanlis Giris Yaptiniz");
                    urunRafaKoy();
            }
        } else {
            System.out.println("Listede Bu Id bulunamdi");
            urunGirisi();
        }
    }

    private static void urunGirisi() {
        System.out.println(urunList);
        System.out.println("Eklemek istediğiniz Urun Id` sini giriniz");
        idSecim = scan.nextInt();
        System.out.println("Eklemek istediğiniz Miktari giriniz");
        miktar = scan.nextInt();
        if (idList.contains(idSecim)) {
            miktarList.set(idList.indexOf(idSecim), miktar);
            urunList.get(idList.indexOf(idSecim)).setMiktar(miktar);
            System.out.println("yapmak istediğiniz islemi giriniz\n1- Ana Menu \n2- Urun Girisi");
            secim = scan.next();
            switch (secim) {
                case "1":
                    AnaMenu();
                case "2":
                    urunGirisi();
                default:
                    System.out.println("Yanlis Giris Yaptiniz");
                    urunGirisi();
            }
        } else {
            System.out.println("Listede Bu Id bulunamdi");
            urunGirisi();
        }


    }

    private static void urunListeleme() {
        System.out.println(urunList);
        System.out.println("yapmak istediğiniz islemi giriniz\n1- Ana Menu \n2- Urun Girisi");
        secim = scan.next();
        switch (secim) {
            case "1":
                AnaMenu();
            case "2":
                urunGirisi();
            default:
                System.out.println("Yanlis Giris Yaptiniz");
                urunListeleme();

        }
    }
        private static void urunTanimlama() {
            Urunler urn = new Urunler(id, urunIsmi, uretici, miktar, birim, raf);
            id++;
            idList.add(id);
            urn.setId(id);

            raf = " ";
            rafList.add(raf);
            urn.setRaf(raf);

            System.out.println("Urun Adi Giriniz");
            urunIsmi = scan.next();
            urunIsimList.add(urunIsmi);
            urn.setUrunIsmi(urunIsmi);

            System.out.println("Uretici Giriniz");
            uretici = scan.next();
            ureticiList.add(uretici);
            urn.setUretici(uretici);

            System.out.println("Birim Giriniz");
            birim = scan.next();
            birimList.add(birim);
            urn.setBirim(birim);

            rafList.add(" ");
            urn.setRaf(raf);

            miktarList.add(0);
            urn.setMiktar(miktar);

            urunList.add(urn);
            System.out.println("yapmak istediğiniz islemi giriniz\n1- Ana Menu \n2- Urun Tanimlama");
            secim = scan.next();
            switch (secim) {
                case "1":
                    AnaMenu();
                case "2":
                    urunTanimlama();
                default:
                    System.out.println("Yanlis Giris Yaptiniz");
                    urunTanimlama();
            }

        }
    }
