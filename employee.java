import java.io.*;
import java.util.*;
import java.sql.*;
public class employee
{
	public static void main(String [] args)
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//10.10.111.202:1521/bit","csora127","bit");
			Statement s = conn.createStatement();
			String tableName="employee";
			s.execute("insert into employee values('1','Adhi','50000','5000','2000','10000')");
			s.execute("insert into employee values('2','Ashwin','60000','4000','2000','9000')");
			s.execute("insert into employee values('3','ABK','80000','7000','2000','12000')");
			s.execute("insert into employee values('4','Ganesh','70000','8000','2000','14000')");
			s.execute("insert into employee values('5','Ajay','50000','5000','2000','1000')");
			s.execute("insert into employee values('6','Abi','90000','3000','2000','16000')");
			s.execute("insert into employee values('7','Balaji','90000','10000','2000','15000')");
			s.execute("insert into employee values('8','Arun','120000','6000','2000','20000')");
			s.execute("insert into employee values('9','Bharathi','70000','8000','2000','9000')");
			s.execute("insert into employee values('10','Abishek','100000','8000','2000','16000')");
			
			s.execute("alter table employee add('total number(10)'");
			String selTable="SELECT * FROM "+tableName;
			s.execute(selTable);
			ResultSet rs = s.getResultSet();
			while((rs!=null)&(rs.next()))
			{
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4)+" : "+rs.getString(5)+" : "+rs.getString(6)+" : "+rs.getString(7));
				}
				
				s.execute(selTable);
				s.close();
				conn.close();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
			
