public class Produk {
    // variabel
    private String idProduk;
    private String Nama;
    private String Deskripsi;
    private Integer Stok;
    private float Harga;

    // constructor
    Produk(){
    }

    Produk(String Nama, float Harga) {
        this.idProduk = idProduk;
        this.Nama = Nama;
        this.Deskripsi = Deskripsi;
        this.Stok = Stok;
        this.Harga = Harga;
    }

    public String getIdProduk(){return idProduk;}
    public void setIdProduk(String idProduk){this.idProduk = idProduk;}
    // method getter (get)
    public String getNama() {
        return Nama;
    }
    // method setter (set)
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getDeskripsi(){return Deskripsi;}
    public void setDeskripsi(String Deskripsi){this.Deskripsi = Deskripsi;}
    public Integer getStok(){return Stok;}
    public void setStok(Integer Stok){this.Stok = Stok;}
    public float getHarga() {
        return Harga;
    }
    public void setHarga(float Harga) {
        this.Harga = Harga;
    }
}