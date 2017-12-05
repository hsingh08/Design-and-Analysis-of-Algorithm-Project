
//Importing the java packages
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.Random;

//Declaration of Vertex1 class,attribute and methods.
class Vertex1 implements Comparable<Vertex1>
{
    public final String name;
    public Edge1[] Adjacencies1; // Adjacencies1 of Edge1s
    public double minDistance1 = Double.POSITIVE_INFINITY; //Initially assigned to infinity
    public Vertex1 previous;
    public Vertex1(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex1 other)
    {
        return Double.compare(minDistance1, other.minDistance1); //Comparing previous and new min distances
    }
    

}
//Declaring class Edge1 
class Edge1
{
    public final Vertex1 target;
    public final double weight;
    public Edge1(Vertex1 argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}
/**
 * Servlet implementation class Shortest1
 */

@WebServlet(name = "Shor", urlPatterns = {"/Shor"})
public class Shor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Computing path from any source
	public static void computePaths(Vertex1 source)//can be any source
    {
        source.minDistance1 = 0.; //Initially assigned min distance to 0.
        PriorityQueue<Vertex1> Vertex1Queue = new PriorityQueue<Vertex1>();//queue defined
        Vertex1Queue.add(source);//source added initially
        
        while (!Vertex1Queue.isEmpty()) {//until the queue is empty
        Vertex1 u = Vertex1Queue.poll(); //Until the queue is empty remove it

            // Visit each Edge1 exiting u
            for (Edge1 e : u.Adjacencies1)
            {
                Vertex1 v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance1 + weight;//adding min distance and weight
        if (distanceThroughU < v.minDistance1) {
            Vertex1Queue.remove(v);

            v.minDistance1 = distanceThroughU ;
            v.previous = u;
            Vertex1Queue.add(v);
        }
            }
        }
    }
	
	//Computing shortest path
	 public static List<Vertex1> getShortestPathTo(Vertex1 target)
	    {
	        List<Vertex1> path = new ArrayList<Vertex1>();
	        for (Vertex1 Vertex1 = target; Vertex1 != null; Vertex1 = Vertex1.previous)
	            path.add(Vertex1);

	        Collections.reverse(path); //Computing destination as source as reversing the path
	        return path;
	    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Shor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    PrintWriter out=response.getWriter(); //Executing in html format.
			out.println("<html>");
			out.println("<body>");
			 
			//Object obj = request.getAttribute("source");
		    //Vertex1 d1 = (Vertex1) obj;
		    //out.println(obj);
			//request.getAttribute("source");
			//out.println(source);
			//sTRrequest.getAttribute("source").toString()
		   // Vertex1 A = new Vertex1(request.getAttribute("source").toString());
		    //Vertex1 B = new Vertex1("64152");
		    //Vertex1 C = new Vertex1("64153");
		    //A.Adjacencies1 = new Edge1[]{ new Edge1(B, 4) };
		    //B.Adjacencies1 = new Edge1[]{ new Edge1(C, 4) };
		    //B.Adjacencies1 = new Edge1[]{ new Edge1(A, 2) };
		    //C.Adjacencies1 = new Edge1[]{ new Edge1(B, 2) };
			out.println(request.getAttribute("source"));
			//String s1=request.getAttribute("source");
			Vertex1 A = new Vertex1(request.getAttribute("source").toString());//Taking the input from jsp page
	        Vertex1 B = new Vertex1(request.getAttribute("source").toString());
	        Vertex1 D = new Vertex1(request.getAttribute("source").toString());
	        //Vertex1 E = new Vertex1(request.getAttribute("source").toString());
	        Vertex1 F = new Vertex1(request.getAttribute("source").toString());
	        Vertex1 K = new Vertex1("K");
	        Vertex1 J = new Vertex1("J");
	        Vertex1 M = new Vertex1("64151");
	        Vertex1 O = new Vertex1("O");
	        Vertex1 P = new Vertex1("P");
	        Vertex1 R = new Vertex1("64152");
	        Vertex1 Z = new Vertex1("64150");
	        Vertex1 Z3 = new Vertex1("64153");
	        Vertex1 Z4 = new Vertex1("64154");
	        Vertex1 Z5 = new Vertex1("64155");
	        Vertex1 Z6 = new Vertex1("64156");
	        //Vertex1 Z7 = new Vertex1("64157");

	        //A.Adjacencies1 = new Edge1[]{ new Edge1(M, 2) };
	        // set the Edge1s and weight
	      
	        A.Adjacencies1 = new Edge1[]{ new Edge1(M, 2) };
	        A.Adjacencies1 = new Edge1[]{ new Edge1(B, 5) };
	        B.Adjacencies1 = new Edge1[]{ new Edge1(D, 11) };
	        B.Adjacencies1 = new Edge1[]{ new Edge1(R, 3) };
	        D.Adjacencies1 = new Edge1[]{ new Edge1(B, 11) };
	        F.Adjacencies1 = new Edge1[]{ new Edge1(K, 23) };
	        K.Adjacencies1 = new Edge1[]{ new Edge1(O, 40) };
	        J.Adjacencies1 = new Edge1[]{ new Edge1(K, 25) };
	        M.Adjacencies1 = new Edge1[]{ new Edge1(R, 2) };
	        O.Adjacencies1 = new Edge1[]{ new Edge1(K, 40) };
	        P.Adjacencies1 = new Edge1[]{ new Edge1(Z, 18) };
	        R.Adjacencies1 = new Edge1[]{ new Edge1(P, 15) };
	        Z.Adjacencies1 = new Edge1[]{ new Edge1(P, 18) };
            
	       /* R.Adjacencies1 = new Edge1[]{ new Edge1(Z3, 15) };
	        R.Adjacencies1 = new Edge1[]{ new Edge1(Z5, 25) };
	        Z3.Adjacencies1 = new Edge1[]{ new Edge1(R, 15) };
	        Z3.Adjacencies1 = new Edge1[]{ new Edge1(Z4,18) };
	        Z4.Adjacencies1 = new Edge1[]{ new Edge1(Z3,18) };
	        Z5.Adjacencies1 = new Edge1[]{ new Edge1(R,25) };
	        Z5.Adjacencies1 = new Edge1[]{ new Edge1(Z6,23) };
	        Z6.Adjacencies1 = new Edge1[]{ new Edge1(Z5,23) };*/
	      
	        Scanner sc=new Scanner(System.in);
	        System.out.println();
	        //ServletContext context=getServletContext();
	        //Vertex1 s=(Vertex1) context.getAttribute("source");
	        //Vertex1 a=(Vertex1) obj;
	        //out.println(s);
	        //Vertex1 S=A;
	        
	        int n=0;//availability
	        
	        if(n==0)
	        	{
	        	//Class.forName("com.mysql.jdbc.Driver");
                Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/vsystem", "root", "root");//Connection with database
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 
                Statement st =null;
                Statement st1=null;
                Statement st2=null;
                Statement st3=null;
                Statement st4=null;
                Statement st5=null;
                Statement st6=null;
				try {
					st = conn.createStatement();
					st1 = conn.createStatement();
					st2 = conn.createStatement();
					st3 = conn.createStatement();
					st4 = conn.createStatement();
					st5 = conn.createStatement();
					st6 = conn.createStatement();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 String sql1 = "Select count from vcount WHERE zipcode='" + request.getAttribute("source") + "'";//input as zip code
	                //System.out.println(sql1);
	                try {
						ResultSet rs1 = st.executeQuery(sql1);
						while (rs1.next()) 
						{
		            	    //int id=rs.getInt(id); 
		                	int type1=rs1.getInt("count");
		                	System.out.println(type1);
		                	//rs1.close();
						
		                    
		                    try {
		                    	if(type1>0){//Checking the availability greater than 0
		                    	String sql = "UPDATE vcount set count=count-1 WHERE zipcode='" + request.getAttribute("source") + "'";//Updating the database after requesting
				                System.out.println(sql);
				                st1.executeUpdate(sql);
				                System.out.println("Before else");
				                st1.close();
				                //ResultSet rs=st.executeQuery(sql);
		    					//rs.close();
		    					//rs1.close();
		    					
		                    	}
		                    	else
		                    	{
		                    		String sql2="SELECT zipcode2,distance from distance where zipcode1='"+request.getAttribute("source") + "'";
		                    		ResultSet rs2 = st2.executeQuery(sql2);
		                    		String sql3="SELECT zipcode1,distance from distance where zipcode2='"+request.getAttribute("source") + "'";
		                    		ResultSet rs3 = st3.executeQuery(sql3);
		                    		String zip1="64151";
	    		                	String sql4 = "Select count from vcount WHERE zipcode='" + zip1 + "'";
	    		                	ResultSet rs4 = st4.executeQuery(sql4);
	    		                	String zip2="64150";
	    		                	String sql5 = "Select count from vcount WHERE zipcode='" + zip2 + "'";
	    		                	ResultSet rs5 = st5.executeQuery(sql5);
	    		                	
		                    		while (rs3.next() && rs2.next() && rs4.next() && rs5.next()) {
		    		            	    //int id=rs.getInt(id);
		                    			int zipcode2=rs2.getInt("zipcode2");
		    		                	System.out.println(zipcode2);
		    		                	int distance1=rs2.getInt("distance");
		    		                	System.out.println(distance1);
		    		                	int zipcode1=rs3.getInt("zipcode1");
		    		                	System.out.println(zipcode1);
		    		                	int distance2=rs3.getInt("distance");
		    		                	System.out.println(distance2);
		    		                	int destinationzip = 0;
		    		                	int fdistance = 0;
		    		                	
		    		                	int type4=rs4.getInt("count");
		    		                	System.out.println(type4);
		    		                	int type5=rs5.getInt("count");
		    		                	System.out.println(type5);
		    		                	//System.out.println("Hello");
		    		                	
		    		                	if((type5==0 && type4==0))
	    		                		{
	    		                             A.Adjacencies1= new Edge1[]{ new Edge1(M,2) };
	    		                             M.Adjacencies1= new Edge1[]{ new Edge1(R,2) };
	    		                             
			    		                	 computePaths(A); //computing path 
			    			        		 out.println("Distance to " + R + ": " + R.minDistance1);
			    			        	     List<Vertex1> path = getShortestPathTo(R);
			    			        	     out.println("Path: " + path);
			    			        	     break;
	    		                		}
		    		                	if((type4 ==0) && (type5>0))
		    		                	{
		    		                		destinationzip=zipcode2;
		    		                		//System.out.println(destinationzip);
		    		                		//System.out.println(destinationzip);
		    		                		fdistance=distance1;
		    		                		
		    		                	}
		    		                	else
		    		                	{
		    		                	if((distance1<distance2))
		    		                	{   
		    		                		out.println("Hello");
		    		                		destinationzip=zipcode2;
		    		                		System.out.println(destinationzip);
		    		                		fdistance=distance1;
		    		                		//System.out.println("Hello");
		    		                		//System.out.println(fdistance);
		    		                	}
		    		                	else
		    		                	{
		    		                		destinationzip=zipcode1;
		    		                		System.out.println(destinationzip);
		    		                		fdistance=distance2;
		    		                	}
		    		                	}
		    		                
		    		                	
		    							
		    		                	 String zip=Integer.toString(destinationzip);
		    		                	 Vertex1 D1 = new Vertex1(zip);
		    		                	 //out.println(zip);
		    							
		    		                	 if(request.getAttribute("source").toString().equalsIgnoreCase("64151"))//if zip code is 64151
		    		                	 {
		    		                	 A.Adjacencies1 = new Edge1[]{ new Edge1(D1, fdistance) };
		    		                	 D1.Adjacencies1 = new Edge1[]{ new Edge1(R, 8) };
		    		                	 computePaths(A); // run Dijkstra
		    			        		 out.println("Distance to " + destinationzip + ": " + D1.minDistance1);//Computing minimum distance
		    			        	     List<Vertex1> path = getShortestPathTo(D1);
		    			        	     out.println("Path: " + path);
		    			        	     Random rand = new Random();
		    			        		 int  n3 = rand.nextInt(50000) + 1;
		    			        		 out.println("Assigned no is"+n3);
		    		                	 }
		    		                	 if(request.getAttribute("source").toString().equalsIgnoreCase("64150"))//if the zip code is 64150
		    		                	 {
		    		                	 B.Adjacencies1 = new Edge1[]{ new Edge1(D1, fdistance) };
		    		                	 D1.Adjacencies1 = new Edge1[]{ new Edge1(R, 8) };
		    		                	 computePaths(B); 
		    			        		 out.println("Distance to " + destinationzip + ": " + fdistance);
		    			        	     List<Vertex1> path = getShortestPathTo(D1);
		    			        	     out.println("Path: " + path);
		    			        	     Random rand = new Random();
		    			        		 int  n2 = rand.nextInt(50000) + 1;
		    			        		 out.println("Assigned no is"+n2);
		    		                	 }
		    		                	 if(request.getAttribute("source").toString().equalsIgnoreCase("64149"))//if the zip code is 64149
		    		                	 {
		    		                	 D.Adjacencies1 = new Edge1[]{ new Edge1(D1, fdistance) };
		    		                	 D1.Adjacencies1 = new Edge1[]{ new Edge1(R, 3) };
		    		                	 computePaths(D); 
		    			        		 out.println("Distance to " + destinationzip + ": " + fdistance);
		    			        	     List<Vertex1> path = getShortestPathTo(D1);
		    			        	     out.println("Path: " + path);
		    			        	    /* Random rand = new Random();
		    			        		 int  n4 = rand.nextInt(50000) + 1;
		    			        		 out.println("Assigned no is"+n4);*/
		    		                	 }
		    		                	  if(request.getAttribute("source").toString().equalsIgnoreCase("64152"))//if the zip code is 64152
		    		                  	   {
		    		                		F.Adjacencies1 = new Edge1[]{ new Edge1(D1, fdistance) };
		    		                		D1.Adjacencies1 = new Edge1[]{ new Edge1(R, 3) };
		    		           	            computePaths(F); // run Dijkstra
		    		           	            out.println("Distance to " + destinationzip + ": " + D1.minDistance1);
		    		              	        List<Vertex1> path1 = getShortestPathTo(D1);
		    		              	        out.println("Path: " + path1);
		    		                  	   }
		    		                	
		                    		}
		                    		
		                    		
		                    	}
		                    	} catch (SQLException e) {
		    					// Handling exceptions
		    					e.printStackTrace();
		    				}
						}	} catch (SQLException e1) {
						// Handling Exceptions
						e1.printStackTrace();
					}
	            
                
	        		 //check();
	        		 
	        	}
	       
		out.println("Available");//If it is available
		Random rand = new Random();
		int  n1 = rand.nextInt(50000) + 1;
		out.println("Assigned no is"+n1);
		out.println("</body>");
		out.println("</html>");
	}

}
