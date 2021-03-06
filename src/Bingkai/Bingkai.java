package Bingkai;


public class Bingkai {
    private int panjang,lebar; //fields
    private static int hasil; //fields
    private static int jumlah_bing; //fields
    private String jenis; //fields
    
   public Bingkai(){
       
   }
    public Bingkai(int panjang, int lebar, String jenis){ //konstruktor
        this.panjang = panjang;
        this.lebar = lebar;
        this.jenis = jenis;
    }
    
    public void displayDaftarBingkai(){ //method
        System.out.println("------Harga per meter------");
        System.out.println("Hitam Metalik   | Rp. 3.000");
        System.out.println("Coklat Metalik  | Rp. 2.700");
        System.out.println("Coklat Bercorak | Rp. 2.300");
        System.out.println("Hitam Bercorak  | Rp. 2.500");
        System.out.println("Emas            | Rp. 5.000");
        System.out.println("Perak           | Rp. 4.000");
    }
    public int hasil(int hasil){
        return hasil=hasil;
    }
    public int menentukan(){
        if(jenis=="Hitam Metalik")
            hasil = panjang*lebar*3000;
        else if(jenis=="Coklat Metalik")
            hasil = panjang*lebar*2700;
        else if(jenis=="Coklat Corak")
            hasil = panjang*lebar*2300;
        else if(jenis=="Hitam Corak")
            hasil = panjang*lebar*2500;
        else if(jenis=="Emas")
            hasil = panjang*lebar*5000;
        else if(jenis=="Perak")
            hasil = panjang*lebar*4000;
    return hasil;
    }


    public void display(){
        System.out.println("Jenis Bingkai            : "+jenis);
        System.out.println("Ukuran                   : "+panjang*lebar+" m2");
        System.out.println("Total                    : Rp. "+hasil);
        
    }
}
