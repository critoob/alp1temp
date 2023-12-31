import java.util.Scanner;
import java.util.ArrayList;
public class Ver1BU {
// kurang indexsearch, edit
    private static ArrayList<Double> masukan = new ArrayList<Double>();
    private static ArrayList<Double> mkn = new ArrayList<Double>();
    private static ArrayList<Double> trpt = new ArrayList<Double>();
    private static ArrayList<Double> util = new ArrayList<Double>();
    private static ArrayList<Double> nabung = new ArrayList<Double>();
    private static ArrayList<Double> lainlain = new ArrayList<Double>();   
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<ArrayList<String>> namap = new ArrayList<>(); // nama
        ArrayList<String> npjan = new ArrayList<String>();
        ArrayList<String> npfeb = new ArrayList<String>();
        ArrayList<String> npmar = new ArrayList<String>();
        ArrayList<String> npapr = new ArrayList<String>();
        ArrayList<String> npmei = new ArrayList<String>();
        ArrayList<String> npjun = new ArrayList<String>();
        ArrayList<String> npjul = new ArrayList<String>();
        ArrayList<String> npagt = new ArrayList<String>();
        ArrayList<String> npsep = new ArrayList<String>();
        ArrayList<String> npoct = new ArrayList<String>();
        ArrayList<String> npnov = new ArrayList<String>();
        ArrayList<String> npdec = new ArrayList<String>();
    int nextmonth = 0;  
    ArrayList<String> nptemp = new ArrayList<String>();
    ArrayList<ArrayList<String>> tipep= new ArrayList<>();  // tipe
        ArrayList<String> tpjan = new ArrayList<String>();
        ArrayList<String> tpfeb = new ArrayList<String>();
        ArrayList<String> tpmar = new ArrayList<String>();
        ArrayList<String> tpapr = new ArrayList<String>();
        ArrayList<String> tpmei = new ArrayList<String>();
        ArrayList<String> tpjun = new ArrayList<String>();
        ArrayList<String> tpjul = new ArrayList<String>();
        ArrayList<String> tpagt = new ArrayList<String>();
        ArrayList<String> tpsep = new ArrayList<String>();
        ArrayList<String> tpoct = new ArrayList<String>();
        ArrayList<String> tpnov = new ArrayList<String>();
        ArrayList<String> tpdec = new ArrayList<String>();
    ArrayList<String> tptemp = new ArrayList<String>();
    ArrayList<ArrayList<Double>> hartotp = new ArrayList<>();  //harga
        ArrayList<Double> hpjan = new ArrayList<Double>();
        ArrayList<Double> hpfeb = new ArrayList<Double>();
        ArrayList<Double> hpmar = new ArrayList<Double>();        
        ArrayList<Double> hpapr = new ArrayList<Double>();
        ArrayList<Double> hpmei = new ArrayList<Double>();
        ArrayList<Double> hpjun = new ArrayList<Double>();
        ArrayList<Double> hpjul = new ArrayList<Double>();
        ArrayList<Double> hpagt = new ArrayList<Double>();
        ArrayList<Double> hpsep = new ArrayList<Double>();
        ArrayList<Double> hpoct = new ArrayList<Double>();
        ArrayList<Double> hpnov = new ArrayList<Double>();
        ArrayList<Double> hpdec = new ArrayList<Double>();
    ArrayList<Double> hptemp = new ArrayList<Double>();
    Double[] sisall = new Double[12]; //lainlain
    Double[] sisamk = new Double[12]; //makanan
    Double[] sisatp = new Double[12]; //transportasi
    Double[] sisaut = new Double[12]; //utilitas
    Double[] tabungperbulan = new Double[12];
    Double totaltabung = 0.0;
    Double sisalltemp = 0.0;
    Double sisamktemp = 0.0;
    Double sisatptemp = 0.0;
    Double sisauttemp = 0.0;
    Double tttemp = 0.0;    
    int menu;
    int bulancounter = 1;
    int bulan4arrlist = 12;
    int pertamangisibulan = 0; // nanti kalau ganti bulan manual reset ke 0 lagi, for bensin, makan, etc

    System.out.println("================================");
    System.out.println("Selamat datang di StudentFinCalc");

    while (bulancounter < 13){
    try{
    System.out.println("================================");
    System.out.println("Menu: ");
    System.out.println("1. Tambah entry pengeluaran");
    System.out.println("2. Cek financial report bulan ini");
    System.out.println("3. Cek financial report bulan-bulan sebelumnya");
    System.out.println("4. Pindah bulan");
    System.out.println("5. Exit");
    System.out.print("Pilih: ");
    menu = s.nextInt();

    if (menu == 1){
    int reset = 0;
    String bulan = nobulan(bulancounter);
    System.out.println("Bulan sekarang: "+bulan);
        while (pertamangisibulan == 0){ //input target pengeluaran per bulan
        inputawalbulan();
        sisalltemp = lainlain.get(bulancounter-1);
        sisamktemp = mkn.get(bulancounter-1);
        sisatptemp = trpt.get(bulancounter-1);
        sisauttemp = util.get(bulancounter-1);
        tttemp = nabung.get(bulancounter-1);
        totaltabung = totaltabung + tttemp;
        pertamangisibulan = 1;
        }
    System.out.println("================================");
    System.out.println("");
        if (sisamktemp > 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp > 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }        
        if (sisauttemp > 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisauttemp);   
        }
    System.out.print("Sisa uang untuk kebutuhan lain-lain: Rp. ");
    System.out.printf("%.0f\n", sisalltemp);                                                                                        
    System.out.println("================================");                                                                                    
    System.out.print("Input nama pengeluaran (max 20 karakter): ");
    String inputnp = s.next()+s.nextLine();
        while (inputnp.length() > 20){
        System.out.print("Input maksimal 20 karakter! Input nama pengeluaran: ");
        inputnp = s.next()+s.nextLine();           
        }
    System.out.println("Tipe pengeluaran (1 - 4)");
    System.out.println("1. Makanan/Minuman");
    System.out.println("2. Transportasi");
    System.out.println("3. Utilitas");
    System.out.println("4. Lain - lain (custom)");
    System.out.print("Pilih tipe pengeluaran: ");
    String inputtp= s.next()+s.nextLine();
    while (!(inputtp.equals("1") || inputtp.equals("2") || inputtp.equals("3") ||  inputtp.equals("4")) || inputtp.equals("1") && sisamktemp == 0 || inputtp.equals("2") && sisatptemp == 0 || inputtp.equals("3") && sisauttemp == 0){
        if (!(inputtp.equals("1") || inputtp.equals("2") || inputtp.equals("3") ||  inputtp.equals("4"))){
        System.out.print("Tipe pengeluaran invalid! Pilih tipe pengeluaran: ");
        inputtp= s.next()+s.nextLine();
        }
        else if (inputtp.equals("1") && sisamktemp == 0){
        System.out.print("Anda tidak memiliki pengeluaran makanan/minuman! Pilih tipe pengeluaran: ");
        inputtp= s.next()+s.nextLine();        
        }
        else if (inputtp.equals("2") && sisatptemp == 0){
        System.out.print("Anda tidak memiliki pengeluaran transportasi! Pilih tipe pengeluaran: ");
        inputtp= s.next()+s.nextLine();        
        }
        else if (inputtp.equals("3") && sisauttemp == 0){
        System.out.print("Anda tidak memiliki pengeluaran utilitas! Pilih tipe pengeluaran: ");
        inputtp= s.next()+s.nextLine();        
        }
    }
        if (inputtp.equals("1") || inputtp.equals("2") || inputtp.equals("3")){
        inputtp = inputtp;          
        }
        else  if (inputtp.equals("4")){
        System.out.print("Input tipe pengeluaran (maks 20 karakter): ");
        inputtp = s.next()+s.nextLine();
            while (inputtp.length() > 20){
            System.out.print("Input maksimal 20 karakter! Input tipe pengeluaran: ");
            inputtp = s.next()+s.nextLine();           
            }   
        }
    System.out.print("Input harga total pengeluaran: ");
    Double inputhtp= s.nextDouble();
    //sorts out pengeluaran per    
    if (inputtp.equals("1")){
    Double sisatempcopy = sisamktemp;
    sisamktemp = sisamktemp - inputhtp;
        while (sisamktemp < 0){
        System.out.println("Uang Makan/Minum Anda tidak mencukupi!");
        System.out.print("Apakah Anda mau mengambil uang dari tabungan? (Y/N): ");
        String yesno1 = s.next()+s.nextLine();
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke uang Makan/Minum: ");
            Double fromtabung = s.nextDouble();
            totaltabung = totaltabung - fromtabung;
            sisamktemp = sisamktemp + fromtabung;
            }
            else if (yesno1.equalsIgnoreCase("n")){
            sisamktemp = sisatempcopy;
            System.out.println("Tolong input ulang dari awal!");
            reset = 1;
            break;
            }
        }
    }
    else if (inputtp.equals("2")){
    Double sisatempcopy = sisatptemp;
    sisatptemp = sisatptemp - inputhtp;
        while (sisatptemp < 0){
        System.out.println("Uang Transportasi Anda tidak mencukupi!");
        System.out.print("Apakah Anda mau mengambil uang dari tabungan? (Y/N): ");
        String yesno1 = s.next()+s.nextLine();
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke uang Transportasi: ");
            Double fromtabung = s.nextDouble();
            totaltabung = totaltabung - fromtabung;
            sisatptemp = sisatptemp + fromtabung;
            }
            else if (yesno1.equalsIgnoreCase("n")){
            sisatptemp = sisatempcopy;
            System.out.println("Tolong input ulang dari awal!");
            reset = 1;
            break;
            }
        }   
    }    
    else if (inputtp.equals("3")){
    Double sisatempcopy = sisauttemp;
    sisauttemp = sisauttemp - inputhtp;
        while (sisauttemp < 0){
        System.out.println("Uang Utilitas Anda tidak mencukupi!");
        System.out.print("Apakah Anda mau mengambil uang dari tabungan? (Y/N): ");
        String yesno1 = s.next()+s.nextLine();
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke uang Utilitas: ");
            Double fromtabung = s.nextDouble();
            totaltabung = totaltabung - fromtabung;
            sisauttemp = sisauttemp + fromtabung;
            }
            else if (yesno1.equalsIgnoreCase("n")){
            sisauttemp = sisatempcopy;
            System.out.println("Tolong input ulang dari awal!");
            reset = 1;
            break;
            }
        }               
    }      
    else {
    Double sisatempcopy = sisalltemp;
    sisalltemp = sisalltemp - inputhtp;
        while (sisalltemp < 0){
        System.out.println("Sisa uang Anda tidak mencukupi!");
        System.out.print("Apakah Anda mau mengambil uang dari tabungan? (Y/N): ");
        String yesno1 = s.next()+s.nextLine();
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke pengeluaran lain - lain: ");
            Double fromtabung = s.nextDouble();
            totaltabung = totaltabung - fromtabung;
            sisalltemp = sisalltemp + fromtabung;
            }
            else if (yesno1.equalsIgnoreCase("n")){
            sisalltemp = sisatempcopy;
            System.out.println("Tolong input ulang dari awal!");
            reset = 1;
            break;
            }
        }           
    }

        if (reset == 1){
        continue;
        }

    nptemp.add(inputnp);
    tptemp.add(inputtp);  
    hptemp.add(inputhtp);

    System.out.println(""); //print table starts here
    System.out.println("================================");
    System.out.print("Pemasukan bulan "+bulan+": ");
        if (masukan.get(bulancounter-1) % 1 == 0){
        System.out.printf("%.0f\n", masukan.get(bulancounter-1));            
        }
        else {
        System.out.printf("%.2f\n", masukan.get(bulancounter-1));
        }
    System.out.println("\t\t\t    ===== Tabel Pengeluaran ======");
    System.out.println("\tNama\t\t\t\tTipe\t\t\t\tJumlah");

    for (int a = 0; a < nptemp.size(); a++){
        System.out.print(a+1 +"\t");
        if (nptemp.get(a).length() >= 8 && nptemp.get(a).length() < 16){
        System.out.print(nptemp.get(a)+"\t\t\t");
        }
        else if (nptemp.get(a).length() >= 16 && nptemp.get(a).length() <= 20){
        System.out.print(nptemp.get(a)+"\t\t");        
        }
        else if (nptemp.get(a).length() < 8){
        System.out.print(nptemp.get(a)+"\t\t\t\t"); //less then 8
        }
           if (tptemp.get(a).equals("1") ||  tptemp.get(a).equals("2") || tptemp.get(a).equals("3")){
           String tipe = buattipe(tptemp.get(a));
           System.out.print(tipe+"\t\t\t");
           }
           else{
                if (tptemp.get(a).length() >= 8 && tptemp.get(a).length() < 16){
                System.out.print(tptemp.get(a)+"\t\t\t");
                }
                else if (tptemp.get(a).length() >= 16 && tptemp.get(a).length() <= 20){
                System.out.print(tptemp.get(a)+"\t\t");        
                }
                else {
                System.out.print(tptemp.get(a)+"\t\t\t\t"); //less then 8
                }            
           }
        System.out.print("Rp. ");
        if (hptemp.get(a) % 1 == 0){
        System.out.printf("%.0f\n", hptemp.get(a));            
        }
        else {
        System.out.printf("%.2f\n", hptemp.get(a));
        }
    }
    System.out.println("");
        if (sisamktemp > 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp > 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }        
        if (sisauttemp > 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisauttemp);   
        }
    System.out.print("Sisa uang untuk kebutuhan lain-lain: Rp. ");
    System.out.printf("%.0f\n", sisalltemp);       
    System.out.println("");
    }

    else if (menu == 2){
    String bulan = nobulan(bulancounter);
        if (pertamangisibulan == 0){
        System.out.println("Buat tabel baru terlebih dahulu!");
        continue;
        }
    System.out.println(""); //print table starts here
    System.out.println("================================");
    System.out.print("Pemasukan bulan "+bulan+": ");
        if (masukan.get(bulancounter-1) % 1 == 0){
        System.out.printf("%.0f\n", masukan.get(bulancounter-1));            
        }
        else {
        System.out.printf("%.2f\n", masukan.get(bulancounter-1));
        }
    System.out.println("\t\t\t    ===== Tabel Pengeluaran ======");
    System.out.println("\tNama\t\t\t\tTipe\t\t\t\tJumlah");

    for (int a = 0; a < nptemp.size(); a++){
        System.out.print(a+1 +"\t");
        if (nptemp.get(a).length() >= 8 && nptemp.get(a).length() < 16){
        System.out.print(nptemp.get(a)+"\t\t\t");
        }
        else if (nptemp.get(a).length() >= 16 && nptemp.get(a).length() <= 20){
        System.out.print(nptemp.get(a)+"\t\t");        
        }
        else if (nptemp.get(a).length() < 8){
        System.out.print(nptemp.get(a)+"\t\t\t\t"); //less then 8
        }
           if (tptemp.get(a).equals("1") ||  tptemp.get(a).equals("2") || tptemp.get(a).equals("3")){
           String tipe = buattipe(tptemp.get(a));
           System.out.print(tipe+"\t\t\t");
           }
           else{
                if (tptemp.get(a).length() >= 8 && tptemp.get(a).length() < 16){
                System.out.print(tptemp.get(a)+"\t\t\t");
                }
                else if (tptemp.get(a).length() >= 16 && tptemp.get(a).length() <= 20){
                System.out.print(tptemp.get(a)+"\t\t");        
                }
                else {
                System.out.print(tptemp.get(a)+"\t\t\t\t"); //less then 8
                }            
           }
        System.out.print("Rp. ");
        if (hptemp.get(a) % 1 == 0){
        System.out.printf("%.0f\n", hptemp.get(a));            
        }
        else {
        System.out.printf("%.2f\n", hptemp.get(a));
        }
    }
    System.out.println("");
        if (sisamktemp > 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp > 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }        
        if (sisauttemp > 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisauttemp);   
        }
    System.out.print("Sisa uang untuk kebutuhan lain-lain: Rp. ");
    System.out.printf("%.0f\n", sisalltemp);       
    System.out.print("Total tabungan: ");
    System.out.printf("%.2f\n", totaltabung);
    System.out.println("Edit tabel? (Y/N): ");
    System.out.println("");
    }

    else if (menu == 3){
        if (bulancounter == 1){
        System.out.println("Ini adalah bulan pertama inputan Anda!");
        }
        else {
        System.out.print("Input bulan yang ingin dilihat (1 - Jan, 2 - Feb, dst): ");
        int inputbln3 = s.nextInt();
        if (inputbln3 >= 1 && inputbln3 <= namap.size()) {
        System.out.println("");
        System.out.println("================================");
        String bulan = nobulan(inputbln3);
        System.out.println("Bulan: "+bulan);
        System.out.print("Pemasukan: ");
            if (masukan.get(inputbln3-1) % 1 == 0){
            System.out.printf("%.0f\n", masukan.get(inputbln3-1));            
            }
            else {
            System.out.printf("%.2f\n", masukan.get(inputbln3-1));
            }
        int columnIndex = 0;
        int noprevmonth = 1; //numbering
        System.out.println("\t\t\t    ===== Tabel Pengeluaran ======");
        System.out.println("\tNama\t\t\t\tTipe\t\t\t\tJumlah");
            while (columnIndex < namap.get(inputbln3 - 1).size()) {
            String nama = namap.get(inputbln3 - 1).get(columnIndex);
            String tipe = tipep.get(inputbln3 - 1).get(columnIndex);
            Double hargajumlah = hartotp.get(inputbln3 - 1).get(columnIndex);
            System.out.print(noprevmonth+"\t");
                if (nama.length() >= 8 && nama.length() < 16){
                System.out.print(nama+"\t\t\t");
                }
                else if (nama.length() >= 16 && nama.length() <=20){
                System.out.print(nama+"\t\t");
                }
                else if (nama.length() < 8){
                System.out.print(nama+"\t\t\t\t");
                }
                if (tipe.equals("1") ||  tipe.equals("2") || tipe.equals("3")){
                    String tipe2 = buattipe(tipe);
                    System.out.print(tipe2+"\t\t\t");
                    }
                    else{
                         if (tipe.length() >= 8 && tipe.length() < 16){
                         System.out.print(tipe+"\t\t\t");
                         }
                         else if (tipe.length() >= 16 && tipe.length() <= 20){
                         System.out.print(tipe+"\t\t");        
                         }
                         else {
                         System.out.print(tipe+"\t\t\t\t"); //less then 8
                         }            
                    }
            System.out.print("Rp. ");                               
            if (hargajumlah % 1 == 0){
            System.out.printf("%.0f\n", hargajumlah);            
            }
            else {
            System.out.printf("%.2f\n", hargajumlah);
            }
            noprevmonth++;
            columnIndex++;
            }
        System.out.println("");
        if (sisamk[inputbln3-1] > 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamk[inputbln3-1]);
        }
        else if (sisatp[inputbln3-1] > 0){
        System.out.print("Sisa uang Transportasi: ");
        System.out.printf("%.0f\n", sisatp[inputbln3-1]);
        }
        else if (sisaut[inputbln3-1] > 0){
        System.out.print("Sisa uang Utilitas: ");
        System.out.printf("%.0f\n", sisaut[inputbln3-1]);
        }
        Double tbs  = sisamk[inputbln3-1] + sisatp[inputbln3-1] + sisaut[inputbln3-1] + sisall[inputbln3-1];
        System.out.print("Uang yang ditabung: ");
        System.out.printf("%.2f\n", tbs);
        } 
        else {
            System.out.println("Bulan invalid");
        }        
        }
    System.out.println("");
    }

    else if (menu == 4){ //ganti bulan
                {//clone temp to arraylist bulan
                if (bulancounter == 1){
                npjan = (ArrayList)nptemp.clone();
                namap.add(npjan);
                tpjan = (ArrayList)tptemp.clone();
                tipep.add(tpjan);
                hpjan = (ArrayList)hptemp.clone();
                hartotp.add(hpjan);                                
                }
                else if (bulancounter == 2){
                npfeb = (ArrayList)nptemp.clone();
                namap.add(npfeb);
                tpfeb = (ArrayList)tptemp.clone();
                tipep.add(tpfeb);
                hpfeb = (ArrayList)hptemp.clone();
                hartotp.add(hpfeb);                  
                }
                else if (bulancounter == 3){
                npmar = (ArrayList)nptemp.clone();                 
                namap.add(npmar);
                tpmar = (ArrayList)tptemp.clone();
                tipep.add(tpmar);
                hpmar = (ArrayList)hptemp.clone();
                hartotp.add(hpmar);                  
                }
                else if (bulancounter == 4){
                npapr = (ArrayList)nptemp.clone();                   
                namap.add(npapr);
                tpapr = (ArrayList)tptemp.clone();
                tipep.add(tpapr);
                hpapr = (ArrayList)hptemp.clone();
                hartotp.add(hpapr);                  
                }
                else if (bulancounter == 5){
                npmei = (ArrayList)nptemp.clone();                    
                namap.add(npmei);
                tpmei = (ArrayList)tptemp.clone();
                tipep.add(tpmei);
                hpmei = (ArrayList)hptemp.clone();
                hartotp.add(hpmei);                  
                }
                else if (bulancounter == 6){
                npjun = (ArrayList)nptemp.clone();                   
                namap.add(npjun);
                tpjun = (ArrayList)tptemp.clone();
                tipep.add(tpjun);
                hpjun = (ArrayList)hptemp.clone();
                hartotp.add(hpjun);                  
                }
                else if (bulancounter == 7){
                npjul = (ArrayList)nptemp.clone();                   
                namap.add(npjul);
                tpjul = (ArrayList)tptemp.clone();
                tipep.add(tpjul);
                hpjul = (ArrayList)hptemp.clone();
                hartotp.add(hpjul);                  
                }               
                else if (bulancounter == 8){
                npagt = (ArrayList)nptemp.clone();                   
                namap.add(npagt);
                tpagt = (ArrayList)tptemp.clone();
                tipep.add(tpagt);
                hpagt= (ArrayList)hptemp.clone();
                hartotp.add(hpagt);                  
                }
                else if (bulancounter == 9){
                npsep = (ArrayList)nptemp.clone();                   
                namap.add(npsep);
                tpsep = (ArrayList)tptemp.clone();
                tipep.add(tpsep);
                hpsep = (ArrayList)hptemp.clone();
                hartotp.add(hpsep);                 
                }
                else if (bulancounter == 10){
                npoct = (ArrayList)nptemp.clone();                  
                namap.add(npoct);
                tpoct = (ArrayList)tptemp.clone();
                tipep.add(tpoct);
                hpoct = (ArrayList)hptemp.clone();
                hartotp.add(hpoct);                  
                }
                else if (bulancounter == 11){
                npnov = (ArrayList)nptemp.clone();                  
                namap.add(npnov);
                tpnov = (ArrayList)tptemp.clone();
                tipep.add(tpnov);
                hpnov = (ArrayList)hptemp.clone();
                hartotp.add(hpnov);                  
                }
                else if (bulancounter == 12){
                npdec = (ArrayList)nptemp.clone();                   
                namap.add(npdec);
                tpdec = (ArrayList)tptemp.clone();
                tipep.add(tpdec);
                hpdec = (ArrayList)hptemp.clone();
                hartotp.add(hpdec);                 
                } }
    pertamangisibulan = 0;
    nptemp.clear(); //clean slate for next month
    tptemp.clear();
    hptemp.clear();
    totaltabung = totaltabung + sisalltemp + sisamktemp + sisatptemp + tttemp; //sisa gets added to tabungan
    sisall[bulancounter-1] = sisalltemp; //sisa perbulan gets recorded
    sisamk[bulancounter-1] = sisamktemp;
    sisatp[bulancounter-1] = sisatptemp;
    sisaut[bulancounter-1] = sisauttemp;
    bulancounter++; //next month
    nextmonth++; //next time input transferred is for next month
    sisalltemp = 0.0; //reinitialize sisa per month
    sisamktemp = 0.0;
    sisatptemp = 0.0;
    sisauttemp = 0.0;
    tttemp = 0.0;
    System.out.println("");
    System.out.println("");
    }

    else if (menu == 5){
    System.exit(0);
    }
    else {
    System.out.println("Invalid input, coba lagi!");
    continue;
    }

//break;
} catch (Exception e){
System.out.println("Input error, shutting down!");
break;
}

} // bulancounter

} //psvm main ends
    public static void inputawalbulan(){
    Scanner s = new Scanner(System.in);
        System.out.println("================================");
        Double masn = 1.0; Double mkn1 = 1.0; Double trpt1 = 1.0; Double util1 = 1.0; Double nb1 = 1.0; Double sisatemp;
        System.out.print("Input pemasukan uang untuk bulan ini: ");
        masn = s.nextDouble();
        System.out.print("Input target pengeluaran uang makan untuk bulan ini (jika tidak ada, tulis 0): ");
        mkn1 = s.nextDouble();
        System.out.print("Input target pengeluaran uang transportasi untuk bulan ini (jika tidak ada, tulis 0): ");
        trpt1 = s.nextDouble();
        System.out.print("Input target pengeluaran utilitas / kos untuk bulan ini (jika tidak ada, isi 0): ");
        util1 = s.nextDouble();
        System.out.print("Input jumlah uang yang ingin ditabung: ");
        nb1 = s.nextDouble();
        while (masn < mkn1 + trpt1 + util1 + nb1){
            System.out.println("Masukan Anda lebih kecil dari target pengeluaran, tolong input ulang!");
            System.out.print("Input pemasukan uang untuk bulan ini: ");
            masn = s.nextDouble();
            System.out.print("Input target pengeluaran uang makan untuk bulan ini (jika tidak ada, tulis 0): ");
            mkn1 = s.nextDouble();
            System.out.print("Input target pengeluaran uang transportasi untuk bulan ini (jika tidak ada, tulis 0): ");
            trpt1 = s.nextDouble();
            System.out.print("Input target pengeluaran utilitas / kos untuk bulan ini (jika tidak ada, isi 0): ");
            util1 = s.nextDouble();
            System.out.print("Input jumlah uang yang ingin ditabung: ");
            nb1 = s.nextDouble();
        }
    sisatemp = masn - (mkn1 + trpt1 + util1 + nb1);
    System.out.print("Sisa uang untuk pengeluaran lain - lain: Rp. ");
            if (sisatemp % 1 == 0){
            System.out.printf("%.0f\n", sisatemp);            
            }
            else {
            System.out.printf("%.2f\n", sisatemp);
            }
    lainlain.add(sisatemp);
    masukan.add(masn);
    mkn.add(mkn1);
    trpt.add(trpt1);
    util.add(util1);
    nabung.add(nb1);
    }

    private static String nobulan(int nomerbulan) {
    switch (nomerbulan) {
        case 1:  return "Januari";
        case 2:  return "Februari";
        case 3:  return "Maret";
        case 4:  return "April";
        case 5:  return "Mei";
        case 6:  return "Juni";
        case 7:  return "Juli";
        case 8:  return "Agustus";
        case 9:  return "September";
        case 10: return "October";
        case 11: return "November";
        case 12: return "Desember";
        default: return null;  // Return null for invalid input
        }
    }

    private static String buattipe(String tipepe) {
    switch (tipepe.toLowerCase()) {
            case "1": return "Makan/Minum";
            case "2": return "Transportasi";
            case "3": return "Utilitas";
            default: return null;  // Return null for invalid input
        }
    }

}