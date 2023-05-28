import java.util.ArrayList;

public class User {
    // membuat arraylist baru
    private ArrayList<Produk> produkJual = new ArrayList();
    // variabel
    private int Id;
    private String namaUser;
    private String lnamaUser;
    private String email;
    private String type;
    private String nomorTelp;

    // constructor
    User(){
    }

    User(int Id, String namaResto, String alamatResto){
        this.Id = Id;
        this.namaUser = namaUser;
        this.lnamaUser = lnamaUser;
        this.email = email;
        this.type = type;
        this.nomorTelp = nomorTelp;
    }

    // method getter (get)
    public int getId() {
        return Id;
    }
    // method setter (set)
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getNamaUser() {
        return namaUser;
    }
    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }
    public String getLnamaUser(){return lnamaUser;}
    public void setLnamaUser(String lnamaUser){this.lnamaUser = lnamaUser;}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {this.email = email;}
    public void setType(String type){this.type = type;}
    public String getType(){return type;}
    public String getNomorTelp(){ return nomorTelp;}
    public void setNomorTelp(String nomorTelp){this.nomorTelp = nomorTelp;}
    public ArrayList<Produk> getProdukJual() {
        return produkJual;
    }
    public void addProdukJual(Produk produkJual) {this.produkJual.add(produkJual);}
}