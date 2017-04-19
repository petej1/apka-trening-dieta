package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Paweł on 17.04.2017.
 */
public class DBConnect {

    private Connection conn;
    private Statement st;
    private ResultSet rs;

    public DBConnect(){
        try{
Class.forName("com.mysql.jdbc.Driver");

conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PeopleAndResults","root","");
st = conn.createStatement();

        }catch (Exception ex){
            System.out.println("Error: " + ex);
        }
    }

    public void getData(){
        try {
            String query = "select * from people";
            rs = st.executeQuery(query);
            System.out.println("Records from database: " );
            while (rs.next()){
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                String age = rs.getString("Age");
                String sex = rs.getString("Sex");
                System.out.println("name" + name);
                System.out.println("surname" + surname);
                System.out.println("age" + age);
                System.out.println("sex" + sex);
            }

        }catch (Exception ex){
            System.out.println("Error: " + ex);
        }
    }
}
