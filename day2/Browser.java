package week1.day2;

public class Browser {
	
	public String launchBrowser(String BrowserName) 
	{
		System.out.println("Browser launched successfully  :" + BrowserName);
		return BrowserName;
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser bo = new Browser();
		String Bname = "Chrome";
		bo.launchBrowser(Bname)	;
		bo.loadUrl();

	}
	


}
