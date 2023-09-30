package co.edu.escuelaing.arep.logservice;


import static spark.Spark.*;
public class Logservice {

	public static void main(String[] args) {
		port(getPort());
		staticFiles.location("/public");
		get("/log",(req,res) ->{
			String val = req.queryParams("value");
			return logMessage(val);
		});

	}
	
	public static int getPort() {
		if(System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		
		return 4568;
	}
	
	private static String logMessage(String val) {
        return "hola";	

	}
	
}
