import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.GregorianCalendar;

public class MySQLConnect {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL="jdbc:mysql://localhost:3306/swiftrecharge";
    private static final String USERNAME= "root";
    private static final String PASSWORD ="1234";
    private static final String MAX_POOL = "250";
    
    private Connection connection;
    private Statement st;
    private ResultSet rs;
    
    
    public  MySQLConnect(){
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftrecharge","root","1234");
			st=connection.createStatement();
		    
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
    	
    }
    
    public void getData(){
    						
    		try {
    			
    	Contacts c=new Contacts();
    	String pass=c.getPassword();
    	Boolean password=Boolean.parseBoolean(pass);
    	if(password) {
    		
    	    String query="select * from meters";
    		rs=st.executeQuery(query);
        	System.out.println("METER SUMMARY DISPLAY");
        	
        	while(rs.next()){
        		StringBuilder sb = new StringBuilder();
        		Date d=new Date();
        		sb.append("Current Date: ");
        		sb.append(d);
        		sb.append("\n");
            	sb.append("Meter Name: ");
            	String FirstName= rs.getString("First Name");
        		sb.append(FirstName);
        		sb.append(" ");
        		String LastName=rs.getString("Last Name");
        		sb.append(LastName);
        		sb.append("\n");
        		sb.append("Meter Number: ");
        		String MeterNumber = rs.getString("Meter Number");
           		sb.append(MeterNumber);
           		sb.append("\n");
           		sb.append("Date of Credit Purchase: ");
        		String PurchaseDate=rs.getString("Purchase Date");
        		sb.append(PurchaseDate);
        		sb.append("\n");
        		sb.append("Last Purchase Amount: ");
        		String lastpurchase=rs.getString("Last Purchase");
        		sb.append(lastpurchase);
        		sb.append(" Units");
        		sb.append("\n");
        		sb.append("Amount of Credit Remaining: ");
        		String AmountRemaining= rs.getString("Amount Remaining");
        		sb.append(AmountRemaining); 
        		sb.append(" Units");
        		sb.append("\n");
        		int amtremain=Integer.parseInt(AmountRemaining);   		
        		if(amtremain>=500){
        			sb.append("Status of your meter: ");
        			String Status1=rs.getString("Status1");
        			sb.append(Status1);
        		}
                else if (amtremain<500 && amtremain>=200) {
                	sb.append("Status of your meter: ");
        			String Status2=rs.getString("Status2");
        			sb.append(Status2);
    			}
                else if (amtremain<200 && amtremain>=10) {
                	sb.append("Status of your meter: ");
        			String Status3 =rs.getString("Status3");
        			sb.append(Status3);
    			}
                else if(amtremain<10 && amtremain>=0) {
                	sb.append("Status of your meter: ");
        			String Status4=rs.getString("Status4");
        			sb.append(Status4);
    			}
                else{
                	System.out.println("Please recharge your meter!");
                }
        		
        		System.out.println(sb);
        	}
        }
    }
        	catch (Exception e) {
    			System.out.println(e);
    		}	

		
				    
}
}

