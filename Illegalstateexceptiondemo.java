import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Illegalstateexceptiondemo {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("one");
		
		
		Iterator it=list.iterator();
		//lastRet -1
		while(it.hasNext()) {
			it.remove();
			Object o=it.next();
			System.out.println(o);
		}
	}
}
