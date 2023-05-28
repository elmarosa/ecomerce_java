// mengimport util java yang diperlukan
// arrraylist = untuk menggunakan arraylist
import java.util.ArrayList;

public class Order {

    // variabel
    private int idUser;
    private float bayar;
    // membuat arraylist baru
    private ArrayList<Produk> lProduk = new ArrayList();
    private ArrayList<Integer> jProduk = new ArrayList();

    // constructor
    Order(){
    }

    // method getter (get)
    public int getIdUser() {
        return idUser;
    }

    // method setter (set)
    public void setIdUser(int idUser) {
        this.idUser= idUser;
    }
    public ArrayList<Produk> getLProduk(){
        return lProduk;
    }
    public void addLProduk(Produk produkJual){this.lProduk.add(produkJual);}
    public ArrayList<Integer> getJProduk() {
        return jProduk;
    }
    public void addJProduk(int jumlah) {
        this.jProduk.add(jumlah);
    }
    public float getBayar() {
        return bayar;
    }
    public void setBayar(float bayar) {
        this.bayar = bayar;
    }
}