import java.util.ArrayList;
import java.util.List;

public class Demo {

	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add(1);
		
		for(Object o: list) {
			Integer o1=(Integer) o;
			System.out.println(o);
		}
		
		/*Thread t=new Thread() {
			public void run() {
				try {
					Thread.sleep(-10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t.start();*/
	}
}
