import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url ="jdbc:mysql://localhost/peminjaman_buku";
                String user="root";
                String pass="";
                koneksi = DriverManager.getConnection(url, user, pass);             
                System.out.println("Koneksi berhasil;");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return koneksi;
    }
}
