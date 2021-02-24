package devices;

public class Scanner extends Device{

	String doc;
	
	public Scanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Scanner Processing: " + doc);
		
	}
	
	public String scan() {
		return "Scanner content";
	}
	
	

}
