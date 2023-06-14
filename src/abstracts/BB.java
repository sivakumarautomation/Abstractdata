package abstracts;

public class BB extends AbstractKey{

	@Override
	public void list() {
		System.out.println("Child");
	}
   
	public static void main(String[] args) {
		BB obj = new BB();
		obj.list();
		obj.show();
	}
}
