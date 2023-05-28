// mengimport util java yang digunakan
// scanner = untuk membaca atau menerima inputan
// arraylist = untuk menggunakan arraylist
import java.util.Scanner;
import java.util.ArrayList;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

// class main
public class Main {
    public Main() {
        public static void main(String[] args) throuws IOExpection {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(hostname:"localhost", port:1350), blacklog:0);

        httpServer.createContext(path:"", handler: null);
        httpServer.setExecutor(Executors.newSingleThreadExecutor());
        httpServer.start();
    }

    public class
    // method login yang ditampilkan pertama kali ketika program dijalankan
    public static void Utama() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                     Menu Utama                                                |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Lihat User");
        System.out.println("2. Tambah User");
        System.out.println("3. Hapus User");
        System.out.println("4. Keluar");
        System.out.print("Pilih Kategori (1/2) : ");
    }

    public static void main(String[] args) {
        // variabel yang digunakan
        int Id;
        int index;
        int banyak;
        int countUser = 0;
        String cek = "Seller";

        // arraylist yang digunakan
        ArrayList<User> pengguna = new ArrayList<>();
        ArrayList<Order> pesan = new ArrayList<>();

        // variabel char untuk melakukan looping saat menginputkan nama makanan, minuman, dan pesanan
        char loop;

        // scanner yang digunakan untuk menerima inputan
        Scanner input = new Scanner(System.in);

        // variabel yang menentukan menu yang akan ditampilkan
        int pilih;

        //
        label40:

        do {
            // menampilkan method Utama
            Utama();
            pilih = Integer.parseInt(input.nextLine());

            // switch case dengan variabel pilih
            switch (pilih) {
                case 1:
                    System.out.println("==================================================Melihat User==================================================");

                    // if : untuk menampilkan restoran apabila ada restoran yang terdata
                    if (pengguna.size() > 0) {
                        for (User Pengguna : pengguna) {
                            System.out.println("\n=================================================Informasi User=================================================");
                            System.out.println("ID User : " + Pengguna.getId());
                            System.out.print("Nama Pengguna : " + Pengguna.getNamaUser());
                            System.out.println(" " + Pengguna.getLnamaUser());
                            System.out.println("Email : " + Pengguna.getEmail());
                            System.out.println("Type : " + Pengguna.getType());
                            System.out.println("Nomor Telepon : " + Pengguna.getNomorTelp());

                            if (Pengguna.getType().equalsIgnoreCase(cek)) {
                                System.out.println("---------------------------------------------------Produk Seller----------------------------------------------------");

                                // if : untuk menampilkan produk yang dijual (jika seller)
                                if (Pengguna.getProdukJual().size() > 0) {
                                    System.out.println("Barang :");
                                    for (int i = 0; i < Pengguna.getProdukJual().size(); i++) {
                                        System.out.println(Pengguna.getProdukJual().get(i).getIdProduk() + ". " + Pengguna.getProdukJual().get(i).getNama() + " ( " + Pengguna.getProdukJual().get(i).getHarga() + " )");
                                    }
                                }
                                // else : jika tidak ada produk yang terdaftar (seller)
                                else {
                                    System.out.println("Maaf, Seller Belum Menambahkan Produk");
                                }
                            }
                        }
                    }
                    // else : jika tidak ada User yang terdata
                    else{
                        System.out.println("Belum Ada User yang Terdata");
                    }
                    break;
                case 2:
                    System.out.println("==================================================Menambah User=================================================");
                    countUser += 1;

                    // objek baru
                    User user = new User();

                    // menerima inputan mengenai informasi restoran
                    System.out.print("ID User : ");
                    user.setId(Integer.valueOf(input.nextLine()));
                    System.out.print("Nama Depan : ");
                    user.setNamaUser(input.nextLine());
                    System.out.print("Nama Belakang : ");
                    user.setLnamaUser(input.nextLine());
                    System.out.print("Email : ");
                    user.setEmail(input.nextLine());
                    System.out.print("Type : ");
                    user.setType(input.nextLine());
                    System.out.print("Nomor Telepon : ");
                    user.setNomorTelp(input.nextLine());

                    if (user.getType().equalsIgnoreCase(cek)) {
                        // perulangan untuk menerima inputan produk
                        while (true) {
                            System.out.print("Ingin Menambahkan Produk? [Y/N] : ");
                            loop = input.nextLine().toUpperCase().charAt(0);

                            // jika menginputkan : y
                            if (loop == 'Y') {
                                Produk barang = new Produk();
                                System.out.print("Id Barang : ");
                                barang.setIdProduk(input.nextLine());
                                System.out.print("Nama Barang : ");
                                barang.setNama(input.nextLine());
                                System.out.print("Deskripsi Barang : ");
                                barang.setDeskripsi(input.nextLine());
                                System.out.print("Stok Barang : ");
                                barang.setStok(Integer.valueOf(input.nextLine()));
                                System.out.print("Harga Barang : ");
                                barang.setHarga(Float.valueOf(input.nextLine()));
                                user.addProdukJual(barang);
                            }

                            // jika menginputkan : N maka looping untuk menambahkan barang akan berhenti
                            else if (loop == 'N') {
                                break;
                            }
                        }
                    }

                    // untuk menge-set Id User secara otomatis (dimulai dari angka atau ID 1)

                    // untuk menambahkan User
                    pengguna.add(user);
                    System.out.println("User Telah Ditambahkan");
                    break;
                case 3:
                    System.out.println("=================================================Menghapus User=================================================");

                    // menerima inputan id user yang akan dihapus
                    System.out.print("\nID user yang Akan Dihapus : ");
                    Id = Integer.parseInt(input.nextLine());
                    index = -1;

                    // perulangan untuk mengecek apakah ada user dengan id yang sama dengan id yang diinputkan
                    for(int i=0; i<pengguna.size(); i++){
                        if(pengguna.get(i).getId() == Id){
                            index = i;
                            break;
                        }
                    }

                    // if : jika ada user dengan id yang sama dengan id yang diinputkan
                    if(index != -1){
                        pengguna.remove(index);
                        System.out.println("User dengan ID " +Id + " Berhasil Dihapus ");
                    }

                    // else : jika tidak ada user dengan id yang sama dengan id yang diinputkan
                    else{
                        System.out.println("User dengan ID " +Id+" Gagal Dihapus. Inputkan ID User dengan Benar");
                    }
                    break;
            }
        }
        while (pilih != 4) ;
    }
}

