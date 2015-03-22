package tti.hutfut.core;
/* 
 * Main class to launch embedded Jetty server
 * 
 * embedded jetty and spring MVC framework thanks to github.com/orb15
 */
public class Main {

	public static void main(String[] args) {
		
		try {
			JettyConfig jettyConfig = new JettyConfig();
			EmbeddedJetty.startServer(jettyConfig);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
