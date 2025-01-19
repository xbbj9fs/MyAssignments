package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling method of another calss:\n");
		Browser bo = new Browser();
		String Bname = "MS-EdgeBrowse";
		bo.launchBrowser(Bname)	;
		bo.loadUrl();

	}

}
