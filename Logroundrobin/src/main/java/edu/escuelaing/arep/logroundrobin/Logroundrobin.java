package edu.escuelaing.arep.logroundrobin;

import static spark.Spark.*;

public class Logroundrobin {

	public static void main(String... args) {
		port(getPort());
		get("/log", (req, res) -> {
			String val = req.queryParams("value");
			return LogMessage(val);
		});
	}

	private static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567;
	}
	
	private static String LogMessage(String val) throws IOException{
		return HttpRemoteCaller.remoteHttpCall("http://localhost:4568/log")
	}
	
	

	
}
