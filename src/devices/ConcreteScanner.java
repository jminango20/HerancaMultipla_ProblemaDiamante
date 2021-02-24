package devices;

public class ConcreteScanner extends Device implements Scanner{

	String doc;
	
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Scanner Processing: " + doc);
		
	}
	
	@Override
	public String scan() {
		return "Scanner content";
	}
	
	

}
