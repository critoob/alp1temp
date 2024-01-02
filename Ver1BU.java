import java.util.Scanner;
import java.util.ArrayList;
public class Ver1temp3 {
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
    Double[] keluarperbulan = new Double[12];
    Double totalkeluarmk = 0.0;
    Double totalkeluartp = 0.0;
    Double totalkeluarut = 0.0;
    Double totalkeluarll = 0.0;
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

    while (bulancounter <= 13){
    try{
        if (bulancounter == 13){ // financial report
        System.out.println("=================================================");
           // String bulan = nobulan(bulancounter);
        String bulannb = "placeholder";
        String bulanns = "placeholder";
        String bulankb = "placeholder";
        String bulanks = "placeholder";
        Double nabungbiggest = tabungperbulan[0];
        Double nabungsmallest = tabungperbulan[0];
        Double keluarbiggest = keluarperbulan[0];
        Double keluarsmallest = keluarperbulan[0];        
            for (int a = 1; a < tabungperbulan.length; a++){ 
                if (tabungperbulan[a] > nabungbiggest){ //biggest tabung
                nabungbiggest = tabungperbulan[a];
                bulannb = nobulan(a);
                }
                if (tabungperbulan[a] < nabungsmallest){ //smallest tabung
                nabungsmallest = tabungperbulan[a];
                bulanns = nobulan(a);
                }
                if (keluarperbulan[a] > keluarbiggest){ //biggest keluar
                keluarbiggest = keluarperbulan[a];
                bulankb = nobulan(a);
                }
                if (keluarperbulan[a] > keluarsmallest){ //biggest keluar
                keluarsmallest = keluarperbulan[a];
                bulanks = nobulan(a);
                }
            }
    System.out.println("========= Financial Report Akhir Tahun ==========");
       System.out.println("\tBulan\t\t\t\t\tPengeluaran\t\t\t\t\tTabungan");
            for (int a = 0; a < 12; a++){
            String bulan = nobulan(a);
            System.out.print("\t");
            if (bulan.length() >= 8 && bulan.length() < 16){
                System.out.print(bulan+"\t\t\t\t\t");
                }
                else if (bulan.length() >= 16 && bulan.length() <= 20){
                System.out.print(bulan+"\t\t\t\t");        
                }
                else if (bulan.length() < 8){
                System.out.print(bulan+"\t\t\t\t\t\t"); //less then 8
                }
            System.out.print("Rp. ");
            if (keluarperbulan.toString().length() >= 4 && keluarperbulan.toString().length() < 12){
                System.out.printf("%.0f", keluarperbulan[a]);
                System.out.print("\t\t\t\t\t");
                }
                else if (keluarperbulan.toString().length() >= 12 && keluarperbulan.toString().length() <= 16){
                System.out.printf("%.0f", keluarperbulan[a]);
                System.out.print("\t\t\t\t");        
                }
                else if (keluarperbulan.toString().length() < 4){
                System.out.printf("%.0f", keluarperbulan[a]);
                System.out.print("\t\t\t\t\t\t"); //less then 8
                }
            System.out.print("Rp. ");
            if (tabungperbulan.toString().length() >= 4 && tabungperbulan.toString().length() < 12){
                System.out.printf("%.0f", tabungperbulan[a]);
                System.out.print("\t\t\t\t\t");
                }
                else if (tabungperbulan.toString().length() >= 12 && tabungperbulan.toString().length() <= 16){
                System.out.print("\t\t\t\t");        
                }
                else if (tabungperbulan.toString().length() < 4){
                System.out.print("\t\t\t\t\t\t"); //less then 8
                }
            System.out.println("");
            }
        System.out.println("");
        System.out.println("Bulan di mana Anda menghabiskan uang paling sedikit adalah "+bulanks+" sebanyak: Rp. ");
        System.out.printf("%.2f\n", keluarsmallest);        
        System.out.println("Bulan di mana Anda menghabiskan uang paling banyak adalah "+bulankb+" sebanyak: Rp. ");
        System.out.printf("%.2f\n", keluarbiggest);
        System.out.print("Bulan di mana Anda menabung paling sedikit adalah "+bulanns+" sebanyak: Rp. ");
        System.out.printf("%.2f\n", nabungsmallest);        
        System.out.println("Bulan di mana Anda menabung paling banyak adalah: "+bulannb+" sebanyak: Rp. ");
        System.out.printf("%.2f\n", nabungbiggest);
        if (totalkeluarmk > 0){
        System.out.println("Total pengeluaran makan/minum Anda tahun ini adalah: Rp. ");
        System.out.printf("%.2f\n", (totalkeluarmk));
        }
        if (totalkeluartp > 0) {
        System.out.println("Total pengeluaran transportasi Anda tahun ini adalah: Rp. ");
        System.out.printf("%.2f\n", (totalkeluartp));
        }
        if (totalkeluarut > 0) {
        System.out.println("Total pengeluaran utilitas Anda tahun ini adalah: Rp. ");
        System.out.printf("%.2f\n", (totalkeluarut));
        }                        
        System.out.println("Total pengeluaran lain - lain Anda tahun ini adalah: Rp. ");
        System.out.printf("%.2f\n", (totalkeluarll));
        System.out.println("Total pengeluaran Anda tahun ini adalah: Rp. ");
        System.out.printf("%.2f\n", (totalkeluarll+totalkeluarmk+totalkeluartp+totalkeluarut));                
        System.out.print("Total tabungan Anda tahun ini adalah: Rp. ");
        System.out.printf("%.2f\n", totaltabung);
        System.out.println("");
        System.out.println("See you next time!");
        System.exit(0);
        }
    System.out.println("================================");
    String bulan = nobulan(bulancounter);
    System.out.println("Bulan sekarang: "+bulan);    
    System.out.println("Menu: ");
    System.out.println("1. Tambah entry pengeluaran");
    System.out.println("2. Edit tabel / pengeluaran / pemasukan bulan ini");
    System.out.println("3. Cek financial report bulan ini");
    System.out.println("4. Cek financial report bulan-bulan sebelumnya");
        if (bulancounter != 12){
        System.out.println("5. Pindah bulan");
        }
        else if (bulancounter == 12){
        System.out.println("5. Akhiri tahun dan print financial report");
        }
    System.out.println("6. Exit");
    System.out.print("Pilih: ");
    menu = s.nextInt();

    if (menu == 1){
    int reset = 0;
        while (pertamangisibulan == 0){ //input target pengeluaran per bulan
        inputawalbulan();
        sisalltemp = lainlain.get(bulancounter-1);
        sisamktemp = mkn.get(bulancounter-1);
        sisatptemp = trpt.get(bulancounter-1);
        sisauttemp = util.get(bulancounter-1);
        tttemp = nabung.get(bulancounter-1);
        totaltabung = totaltabung + tttemp; //adds tabungan this month to total tabungan
        pertamangisibulan = 1;
        }
    System.out.println("================================");
    System.out.println("");
        if (sisamktemp >= 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp >= 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }        
        if (sisauttemp >= 0){
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
    while (!(inputtp.equals("1") || inputtp.equals("2") || inputtp.equals("3") ||  inputtp.equals("4")) || inputtp.equals("1") && sisamktemp == -1 || inputtp.equals("2") && sisatptemp == -1 || inputtp.equals("3") && sisauttemp == -1){
        if (!(inputtp.equals("1") || inputtp.equals("2") || inputtp.equals("3") ||  inputtp.equals("4"))){
        System.out.print("Tipe pengeluaran invalid! Pilih tipe pengeluaran: ");
        inputtp= s.next()+s.nextLine();
        }
        else if (inputtp.equals("1") && sisamktemp == -1){
        System.out.print("Anda tidak memiliki pengeluaran makanan/minuman! Pilih tipe pengeluaran: ");
        inputtp= s.next()+s.nextLine();        
        }
        else if (inputtp.equals("2") && sisatptemp == -1){
        System.out.print("Anda tidak memiliki pengeluaran transportasi! Pilih tipe pengeluaran: ");
        inputtp= s.next()+s.nextLine();        
        }
        else if (inputtp.equals("3") && sisauttemp == -1){
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
            while (!yesno1.equalsIgnoreCase("y") && !yesno1.equalsIgnoreCase("n")){
            System.out.print("Input hanya bisa Y/N! Apakah Anda mau mengambil uang dari tabungan?: ");
            yesno1 = s.next()+s.nextLine();
            }
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke uang Makan/Minum: ");
            Double fromtabung = s.nextDouble();
                while (fromtabung <= 0){
                System.out.print("Input invalid! Input jumlah uang yang ditransfer dari tabungan ke uang Makan/Minum: ");
                fromtabung = s.nextDouble();
                }
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
            while (!yesno1.equalsIgnoreCase("y") && !yesno1.equalsIgnoreCase("n")){
            System.out.print("Input hanya bisa Y/N! Apakah Anda mau mengambil uang dari tabungan?: ");
            yesno1 = s.next()+s.nextLine();
            }
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke uang Transportasi: ");
            Double fromtabung = s.nextDouble();
                while (fromtabung <= 0){
                System.out.print("Input invalid! Input jumlah uang yang ditransfer dari tabungan ke uang Transportasi: ");
                fromtabung = s.nextDouble();
                }
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
            while (!yesno1.equalsIgnoreCase("y") && !yesno1.equalsIgnoreCase("n")){
            System.out.print("Input hanya bisa Y/N! Apakah Anda mau mengambil uang dari tabungan?: ");
            yesno1 = s.next()+s.nextLine();
            }
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke uang Utilitas: ");
            Double fromtabung = s.nextDouble();
                while (fromtabung <= 0){
                System.out.print("Input invalid! Input jumlah uang yang ditransfer dari tabungan ke uang Utilitas: ");
                fromtabung = s.nextDouble();
                }
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
            while (!yesno1.equalsIgnoreCase("y") && !yesno1.equalsIgnoreCase("n")){
            System.out.print("Input hanya bisa Y/N! Apakah Anda mau mengambil uang dari tabungan?: ");
            yesno1 = s.next()+s.nextLine();
            }
            if (yesno1.equalsIgnoreCase("y")){
            System.out.print("Input jumlah uang yang ditransfer dari tabungan ke pengeluaran lain - lain: ");
            Double fromtabung = s.nextDouble();
                while (fromtabung <= 0){
                System.out.print("Input invalid! Input jumlah uang yang ditransfer dari tabungan ke pengeluaran lain - lain: ");
                fromtabung = s.nextDouble();
                }
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
        if (sisamktemp >= 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp >= 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }
        if (sisauttemp >= 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisauttemp);   
        }
    System.out.print("Sisa uang untuk kebutuhan lain-lain: Rp. ");
    System.out.printf("%.0f\n", sisalltemp);       
    System.out.println("");
    }

    else if (menu == 2){
        if (pertamangisibulan == 0){
        System.out.println("Buat tabel baru terlebih dahulu!");
        System.out.println("");
        continue;
        }
    System.out.println("================================");
    System.out.println("1. Edit tabel/pengeluaran");
    System.out.println("2. Edit pemasukan dan tabungan");
    System.out.print("Pilih: ");
    int input2  = s.nextInt();
    while (input2 != 1 && input2 != 2 ){
    System.out.print("Pilihan hanya 1 atau 2! Pilih: ");
    input2  = s.nextInt();
    }
        if (input2 == 1){
        bulan = nobulan(bulancounter);
        System.out.println(""); //tabel lama here
        System.out.println("================================");
        System.out.println("");
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
        System.out.print("Hapus / Edit baris (H/E) : ");
        String hapusedit = s.next()+s.nextLine();
            while (!hapusedit.equalsIgnoreCase("H") && !hapusedit.equalsIgnoreCase("E")){
            System.out.print("Input hanya bisa H/E! Hapus / Edit baris: ");
            hapusedit = s.next()+s.nextLine();
            }
        if (hapusedit.equalsIgnoreCase("H")){
        System.out.print("Pilih baris untuk dihapus: ");
        int pilihbaris = s.nextInt();
        if (pilihbaris >= 1 && pilihbaris <= nptemp.size()) {
            if (tptemp.get(pilihbaris - 1).equals("1")){
                sisamktemp = sisamktemp + hptemp.get(pilihbaris - 1);
            }
            else if (tptemp.get(pilihbaris - 1).equals("2")){
                sisatptemp = sisatptemp + hptemp.get(pilihbaris-1);
            }
            else if (tptemp.get(pilihbaris - 1).equals("3")){
                sisauttemp = sisauttemp + hptemp.get(pilihbaris-1);
            }
            else {
                sisalltemp = sisalltemp + hptemp.get(pilihbaris-1);
            }          
            nptemp.remove(pilihbaris - 1);
            tptemp.remove(pilihbaris - 1);
            hptemp.remove(pilihbaris - 1);
            System.out.println("Baris " + pilihbaris + " berhasil dihapus!");
        } else {
            System.out.println("Baris yang dipilih invalid, tidak ada perubahan!");
        }
        } //end of hapus part
        else if (hapusedit.equalsIgnoreCase("E")){
        System.out.print("Pilih baris untuk diedit: ");
        int pilihbaris = s.nextInt();
        if (pilihbaris >= 1 && pilihbaris <= nptemp.size()) {
            System.out.println("Baris "+pilihbaris+": "); //display that specific row
            System.out.print(nptemp.get(pilihbaris-1)+"\t\t"+tptemp.get(pilihbaris-1)+"\t\t");
                if (hptemp.get(pilihbaris-1) % 1 == 0){
                System.out.printf("%.0f\n", hptemp.get(pilihbaris-1));            
                }
                else {
                System.out.printf("%.2f\n", hptemp.get(pilihbaris-1));
                }
            System.out.println("");
            System.out.println("Bagian yang ingin diedit: \n1. Nama\n2. Tipe\n3. Jumlah");
            System.out.print("Pilih: ");
            int partedit = s.nextInt();
            while (partedit != 1 && partedit != 2 && partedit != 3){
            System.out.print("Pilihan hanya bisa 1 - 3! Pilih bagian yang ingin diedit: ");
            partedit = s.nextInt();
            }
            System.out.println("");
            if (partedit == 1){
            System.out.print("Input nama pengeluaran baru: ");
            String inputbaris = s.next()+s.nextLine();
            nptemp.set(pilihbaris-1, inputbaris);
            }

            else if (partedit == 2){
            System.out.println("Tipe pengeluaran\n1. Makan/Minum\n2. Transportasi\n3. Utilitas\n4. Lain - lain (custom)");
            System.out.print("Pilih tipe pengeluaran baru: ");
            String inputbaris = s.next()+s.nextLine();
            while (!inputbaris.equals("1") && !inputbaris.equals("2") && !inputbaris.equals("3") && !inputbaris.equals("4")){
            System.out.print("Pilihan hanya 1-4! Pilih tipe pengeluaran baru: ");
            inputbaris = s.next()+s.nextLine();
            }
                if (inputbaris.equals("4")){
                System.out.print("Input tipe pengeluaran: ");
                inputbaris = s.next()+s.nextLine();
                }
            tptemp.set(pilihbaris-1, inputbaris);
            }

            else if (partedit == 3){
            System.out.print("Input jumlah pengeluaran baru: ");
            Double inputbaris = s.nextDouble();
            while (inputbaris <= 0){
            System.out.print("Input invalid! Input jumlah pengeluaran baru: ");
            inputbaris = s.nextDouble();
            }
            }
        System.out.println("Perubahan berhasil!");
        } else {
            System.out.println("Baris yang dipilih invalid, tidak ada perubahan!");
        }                
        }
        }
        else if (input2 == 2){
        System.out.println("");
        if (sisamktemp >= 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp >= 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }        
        if (sisauttemp >= 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisauttemp);   
        }
        System.out.print("Sisa uang untuk kebutuhan lain-lain: Rp. ");
        System.out.printf("%.0f\n", sisalltemp);

        System.out.println("Kategori: ");
        System.out.println("1. Makanan/Minuman\n2. Transportasi\n3. Utilitas\n4. Lain - lain\n5. Tabungan");
        System.out.print("Dana ditarik dari kategori: ");
        int inputambil = s.nextInt();
        System.out.print("Dana ditransfer ke kategori: ");
        int inputtransfer = s.nextInt();
            while (inputambil == inputtransfer){
            System.out.println("Kategori ditarik dan ditransfer tidak bisa sama!");
            System.out.print("Dana ditarik dari kategori: ");
            inputambil = s.nextInt();
            System.out.print("Dana ditransfer ke kategori: ");
            inputtransfer = s.nextInt();
            }
        
        System.out.print("Input jumlah yang ditarik: ");
        Double ambiltemp = s.nextDouble();
        while (ambiltemp <= 0){
        System.out.print("Input Anda invalid! Input jumlah yang ditarik: ");
        ambiltemp = s.nextDouble();
        }
            if (inputambil == 1){ // Uang diambil dari: 
               if (sisamktemp < ambiltemp){
                System.out.println("Uang Makan/Minum Anda tidak cukup!");
                continue;
               }
                else {
                sisamktemp = sisamktemp - ambiltemp;
               }
            }
            else if (inputambil == 2){
               if (sisatptemp < ambiltemp){
                System.out.println("Uang Transportasi Anda tidak cukup!");
                continue;
               }
                else {
                sisatptemp = sisatptemp - ambiltemp;
               }         
            }
            else if (inputambil == 3){
               if (sisauttemp < ambiltemp){
                System.out.println("Uang Utilitas Anda tidak cukup!");
                continue;
               }
                else {
                sisauttemp = sisauttemp - ambiltemp;
               }                
            }
            else if (inputambil == 4){
               if (sisalltemp < ambiltemp){
                System.out.println("Uang pengeluaran lain - lain Anda tidak cukup!");
                continue;
               }
                else {
                sisalltemp = sisalltemp - ambiltemp;
               }                
            }
            else if (inputambil == 5){
               if (totaltabung < ambiltemp){
                System.out.println("Tabungan Anda tidak cukup!");
                continue;
               }
                else {
                totaltabung = totaltabung - ambiltemp;
               }   
            }
            
            if (inputtransfer == 1){ //dana transfer ke:
                if (sisamktemp < 0){
                sisamktemp = 0.0;
                } 
            sisamktemp = sisamktemp + ambiltemp;            
            }
            else if (inputtransfer == 2){
                if (sisatptemp < 0){
                sisatptemp = 0.0;
                } 
            sisatptemp = sisatptemp + ambiltemp;
            }
            else if (inputtransfer == 3){
                if (sisauttemp < 0){
                sisauttemp = 0.0;
                } 
            sisauttemp = sisauttemp + ambiltemp;
            }
            else if (inputtransfer == 4){
                if (sisalltemp < 0){
                sisalltemp = 0.0;
                } 
            sisalltemp = sisalltemp + ambiltemp;                
            }
            else if (inputtransfer == 5){
            totaltabung = totaltabung + ambiltemp;                
            }
        
        System.out.println("");
        System.out.println("Pengeluaran yang baru: ");
        if (sisamktemp >= 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp >= 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }        
        if (sisauttemp >= 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisauttemp);   
        }
        System.out.print("Sisa uang untuk kebutuhan lain-lain: Rp. ");
        System.out.printf("%.0f\n", sisalltemp);

        }
    System.out.println("\n");
    }

    else if (menu == 3){
    bulan = nobulan(bulancounter);
        if (pertamangisibulan == 0){
        System.out.println("Buat tabel baru terlebih dahulu!");
        System.out.println("");
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
        if (sisamktemp >= 0){
        System.out.print("Sisa uang Makan/Minum: Rp. ");
        System.out.printf("%.0f\n", sisamktemp);            
        }
        if (sisatptemp >= 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatptemp);   
        }        
        if (sisauttemp >= 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisauttemp);   
        }
    System.out.print("Sisa uang untuk kebutuhan lain-lain: Rp. ");
    System.out.printf("%.0f\n", sisalltemp);       
    System.out.print("Total tabungan : Rp. ");
    System.out.printf("%.2f\n", totaltabung);
    System.out.println("");
    }

    else if (menu == 4){
        if (bulancounter == 1){
        System.out.println("Ini adalah bulan pertama inputan Anda!");
        }
        else {
        System.out.print("Input bulan yang ingin dilihat (1 - Jan, 2 - Feb, dst): ");
        int inputbln3 = s.nextInt();
        if (inputbln3 >= 1 && inputbln3 <= namap.size()) {
        System.out.println("");
        bulan = nobulan(inputbln3);
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
        if (sisatp[inputbln3-1] > 0){
        System.out.print("Sisa uang Transportasi: Rp. ");
        System.out.printf("%.0f\n", sisatp[inputbln3-1]);
        }
        if (sisaut[inputbln3-1] > 0){
        System.out.print("Sisa uang Utilitas: Rp. ");
        System.out.printf("%.0f\n", sisaut[inputbln3-1]);
        }
        Double tbs  = tabungperbulan[inputbln3-1];
        System.out.print("Uang yang ditabung: Rp. ");
        System.out.printf("%.2f\n", tbs);
        } 
        else {
            System.out.println("Bulan invalid");
        }        
        }
    System.out.println("");
    }

    else if (menu == 5){ //ganti bulan
    System.out.println("Peringatan: Tabel pengeluaran bulan ini tidak bisa diedit setelah pindah bulan!");
    System.out.print("Apakah Anda yakin mau pindah bulan? (Y/N): ");
    String yesno4 = s.next()+s.nextLine();
    while (!yesno4.equalsIgnoreCase("y") && !yesno4.equalsIgnoreCase("n")){
    System.out.print("Input hanya bisa Y/N! Apakah Anda yakin mau pindah bulan?: ");
    yesno4 = s.next()+s.nextLine();
    }
    if (yesno4.equalsIgnoreCase("y")){
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
    sisall[bulancounter-1] = sisalltemp; //sisa perbulan gets recorded
    sisamk[bulancounter-1] = sisamktemp;
    sisatp[bulancounter-1] = sisatptemp;
    sisaut[bulancounter-1] = sisauttemp;
    totalkeluarmk = totalkeluarmk + (mkn.get(bulancounter-1) - sisamktemp);
    totalkeluartp = totalkeluartp + (trpt.get(bulancounter-1) - sisatptemp);
    totalkeluarut = totalkeluarut + (util.get(bulancounter-1) - sisauttemp);
    totalkeluarll = totalkeluarll + (lainlain.get(bulancounter-1) - sisalltemp);       
    tabungperbulan[bulancounter - 1] = tttemp + sisalltemp + sisamktemp + sisatptemp + sisauttemp; //recording tabungan 
    keluarperbulan[bulancounter - 1] = masukan.get(bulancounter - 1) - tabungperbulan[bulancounter - 1];
    totaltabung = totaltabung + sisalltemp + sisamktemp + sisatptemp + sisauttemp; //sisa gets added to tabungan
    bulancounter++; //next month
    nextmonth++; //next time input transferred is for next month
    sisalltemp = 0.0; //reinitialize sisa per month
    sisamktemp = 0.0;
    sisatptemp = 0.0;
    sisauttemp = 0.0;
    tttemp = 0.0;
    System.out.println("Bulan telah dipindah!");
    System.out.println("");
    System.out.println("");
    }
    else if (yesno4.equalsIgnoreCase("n")){
    System.out.println("");
    continue;
    }
    }

    else if (menu == 6){
    System.exit(0);
    }

    else {
    System.out.println("Invalid input, coba lagi!");
    continue;
    }

//break;
} catch (Exception e){
System.out.println("Input error, try again!");
continue;
}

} // bulancounter

} //psvm main ends
    public static void inputawalbulan(){
    Scanner s = new Scanner(System.in);
        System.out.println("================================");
        Double masn = 1.0; Double mkn1 = 1.0; Double trpt1 = 1.0; Double util1 = 1.0; Double nb1 = 1.0; Double sisatemp;
        System.out.print("Input pemasukan uang untuk bulan ini: ");
        masn = s.nextDouble();
            while (masn <= 0){
            System.out.print("Input Anda invalid! Input pemasukan uang untuk bulan ini: ");
            masn = s.nextDouble();
            }
        System.out.print("Input target pengeluaran uang makan untuk bulan ini (jika tidak ada, tulis 0): ");
        mkn1 = s.nextDouble();
            while (mkn1 < 0){
            System.out.print("Input Anda invalid! Input target pengeluaran uang makan untuk bulan ini (jika tidak ada, tulis 0): ");
            mkn1 = s.nextDouble();
            }
        System.out.print("Input target pengeluaran uang transportasi untuk bulan ini (jika tidak ada, tulis 0): ");
        trpt1 = s.nextDouble();
            while (trpt1 < 0){
            System.out.print("Input Anda invalid! Input target pengeluaran uang transportasi untuk bulan ini (jika tidak ada, tulis 0): ");
            trpt1 = s.nextDouble();
            }
        System.out.print("Input target pengeluaran utilitas / kos untuk bulan ini (jika tidak ada, isi 0): ");
        util1 = s.nextDouble();
            while (util1 < 0){
            System.out.print("Input Anda invalid! Input target pengeluaran utilitas / kos untuk bulan ini (jika tidak ada, isi 0): ");
            util1 = s.nextDouble();
            }
        System.out.print("Input jumlah uang yang ingin ditabung: ");
        nb1 = s.nextDouble();
            while (nb1 < 0){
            System.out.print("Input Anda invalid! Input jumlah uang yang ingin ditabung: ");
            nb1 = s.nextDouble();
            }
                //while lebih kecil
        while (masn < mkn1 + trpt1 + util1 + nb1){
            System.out.println("Masukan Anda lebih kecil dari target pengeluaran, tolong input ulang!");
            System.out.print("Input pemasukan uang untuk bulan ini: ");
            masn = s.nextDouble();
                while (masn <= 0){
                System.out.print("Input Anda invalid! Input pemasukan uang untuk bulan ini: ");
                masn = s.nextDouble();
                }
            System.out.print("Input target pengeluaran uang makan untuk bulan ini (jika tidak ada, tulis 0): ");
            mkn1 = s.nextDouble();
                while (mkn1 < 0){
                System.out.print("Input Anda invalid! Input target pengeluaran uang makan untuk bulan ini (jika tidak ada, tulis 0): ");
                mkn1 = s.nextDouble();
                }
            System.out.print("Input target pengeluaran uang transportasi untuk bulan ini (jika tidak ada, tulis 0): ");
            trpt1 = s.nextDouble();
                while (trpt1 < 0){
                System.out.print("Input Anda invalid! Input target pengeluaran uang transportasi untuk bulan ini (jika tidak ada, tulis 0): ");
                trpt1 = s.nextDouble();
                }
            System.out.print("Input target pengeluaran utilitas / kos untuk bulan ini (jika tidak ada, isi 0): ");
            util1 = s.nextDouble();
                while (util1 < 0){
                System.out.print("Input Anda invalid! Input target pengeluaran utilitas / kos untuk bulan ini (jika tidak ada, isi 0): ");
                util1 = s.nextDouble();
                }
            System.out.print("Input jumlah uang yang ingin ditabung: ");
            nb1 = s.nextDouble();
                while (nb1 < 0){
                System.out.print("Input Anda invalid! Input jumlah uang yang ingin ditabung: ");
                nb1 = s.nextDouble();
                }
        }

    sisatemp = masn - (mkn1 + trpt1 + util1 + nb1);
    System.out.print("Sisa uang untuk pengeluaran lain - lain: Rp. ");
        if (mkn1 == 0){ //if 0 becomes -1.0 to indicate empty on option1
        mkn1 = -1.0;
        }
        if (trpt1 == 0){
        trpt1 = -1.0;
        }
        if (util1 == 0){
        util1 = -1.0;
        }
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
