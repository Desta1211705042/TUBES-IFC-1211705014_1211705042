import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    private static Connection konek;
    public static Connection getKonek(){
        if(konek == null){
            try{
                String url = "jdbc:mysql://localhost:3306/penjualan_sparepart_motor";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = DriverManager.getConnection(url,user,password);
            }catch (SQLException t){
                System.out.print("Gagal Koneksi");
            }
        }
        return konek;
    }
    
}
