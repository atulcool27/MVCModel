package datao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import model.GetSetReady;

public class Databook {

	Connection con=null;
	String url="jdbc:mysql://localhost:3306/souldata";
	String user="root";
	String password = "Sqlsaurus12";
	String dbuser="";
	String dbpass="";
	String msg="abc";	
	
    

	public String Loginbook(GetSetReady gsr) {
		try{
			
			try {
			Class.forName("com.mysql.jdbc.Driver");}
			catch(ClassNotFoundException e) {e.printStackTrace();}
			
			con=DriverManager.getConnection(url, user, password);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from soulmate;");
			
			while(rs.next()) {
				dbuser=rs.getString("username");
				dbpass=rs.getString("password");
				if(dbuser.equals(gsr.getName()) && dbpass.equals(gsr.getPass())) {
					
					msg="VERIFIED";
					break;
				}
				else {
					
					msg="UNVERIFIED";}
				
			}
		}catch(Exception e) {
			
		}
		
		return msg;
		

	}
	
}
