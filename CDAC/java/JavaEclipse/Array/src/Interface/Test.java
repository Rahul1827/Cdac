package Interface;

interface MyInter{
	
	void My_show();
}

public class Test extends My_test implements MyInter {

	
	void show () {
		
		super.show();
		System.out.println("Test Class or Sub Class");
		
	}
	public	void  My_show()
		{
			
			System.out.println("My Interface");
			
		}
		
		
	}

