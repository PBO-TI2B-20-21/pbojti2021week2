package pbojs2;
public class testBarangg {
    public static void main(String[] args) {
        Barangg brg1=new Barangg();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        System.out.println("Stok baru adalah"+brg1.tambahStok(20));
    }
}
