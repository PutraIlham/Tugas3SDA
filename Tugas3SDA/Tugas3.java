import java.util.LinkedList;

public class Tugas3 {
   public static void main(String[] args) {
    LinkedList <Integer> nim = new LinkedList<>();
    LinkedList <String> nama = new LinkedList<>(); 
    LinkedList <String> alamat = new LinkedList<>();

    nim.add(2111522018);
    nama.add("Putra Ilham");
    alamat.add("Solok");
    System.out.println("no bp \t\t= "+nim);
    System.out.println("nama mahasiswa \t= "+nama);
    System.out.println("alamat \t\t= "+alamat);

    //add() 
    System.out.println("\n*========*======= MENAMBAH DATA MAHASISWA =======*========*");

    nim.addFirst(2111521019);
    nim.addLast(2111523020);
    nim.add(2111524021);
    nim.add(2111525022);
    nim.add(2111526023);
    

    nama.addFirst("Yoan");
    nama.addLast("Nopal");
    nama.add("Rafi");
    nama.add("Hani");
    nama.add("Yaya");

    alamat.addFirst("Padang");
    alamat.addLast("Jambi");
    alamat.add("Medan");
    alamat.add("Palembang");
    alamat.add("Bukittinggi");

    System.out.println("no bp \t\t= "+nim+"\tsize = "+nim.size());
    System.out.println("nama mahasiswa \t= "+nama+" \t\t\t\t\tsize = "+nim.size());
    System.out.println("alamat \t\t= "+alamat+"\t\t\t\tsize = "+nim.size());

    //set()
    System.out.println("\n=============== MENYISIPKAN DATA MAHASISWA ===============");

    nim.set(0,2111527024);
    nim.set(1,2111528025);
    nim.set(3,2111529026);
    nim.set(4,2111523027);

    nama.set(0,"Aza");
    nama.set(1,"Zikri");
    nama.set(3,"Zahra");
    nama.set(4,"Vianca");

    alamat.set(0,"Yogyakarta");
    alamat.set(1,"Bogor");
    alamat.set(3,"Bandung");
    alamat.set(4,"Tangerang");

    System.out.println("no bp \t\t= "+nim+"\tukuran = "+nim.size());
    System.out.println("nama mahasiswa \t= "+nama+"\t\t\t\t\tukuran = "+nim.size());
    System.out.println("alamat \t\t= "+alamat+"\t\t\tukuran = "+nim.size());

    //remove()
    System.out.println("\n=============== MENGHAPUS DATA MAHASISWA ===============");

    nim.remove(0);
    nim.remove(3);

    nama.remove(2);
    nama.remove(1);

    alamat.remove(4);
    alamat.remove(2);

    System.out.println("no bp \t\t= "+nim+"\tukuran = "+nim.size());
    System.out.println("nama mahasiswa \t= "+nama+"\t\t\t\tukuran = "+nim.size());
    System.out.println("alamat \t\t= "+alamat+"\t\tukuran = "+nim.size());

    //isEmpty()
    System.out.println("\n=============== PENGECEKAN DATA MAHASISWA ===============");

    System.out.println("data kosong?\t"+nim.isEmpty());
    System.out.println("data kosong?\t"+nama.isEmpty());
    System.out.println("data kosong?\t"+alamat.isEmpty());

    //indexof
    System.out.println("nim 2111529026 index ke = "+nim.indexOf(2111529026));
    System.out.println("nama Aza index ke = "+nama.indexOf("Aza"));
    System.out.println("alamat Bogor index ke = "+alamat.indexOf("Bogor"));

    //pop()
    System.out.println("\n=============== PENGHAPUSAN DATA MAHASISWA (POP) ===============");

    nim.pop();
    nama.pop();
    alamat.pop();

    System.out.println("no bp \t\t= "+nim+"\t\tukuran = "+nim.size());
    System.out.println("nama mahasiswa \t= "+nama+"\t\t\t\tukuran = "+nim.size());
    System.out.println("alamat \t\t= "+alamat+"\t\t\tukuran = "+nim.size());

    System.out.println("\n=============== PENAMBAHAN DATA MAHASISWA (PUSH) ===============");

    nim.push(2111525028);        
    nama.push("Fifi");
    alamat.push("Jakarta");

    System.out.println("no bp \t\t="+nim+"\t\tukuran = "+nim.size());
    System.out.println("nama mahasiswa \t= "+nama+"\t\t\t\t\tukuran = "+nim.size());
    System.out.println("alamat \t\t= "+alamat+"\t\t\tukuran = "+nim.size());
   }
    }
