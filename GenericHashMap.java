import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericHashMap {
	
	public  Map<Integer,String > m = new HashMap<Integer,String>();
	
	public void put(int emp_code,String emp_name){
		m.put(emp_code, emp_name);
	}
	
	public void get(){
		
		for(Integer k : m.keySet()){
			//System.out.println(k);
			System.out.println(m.get(k));
		}
		
		
	}
	 public static void main(String[] args) {
		 GenericHashMap obj = new GenericHashMap();
		 obj.put(1, "JAKAY");
		 obj.put(2, "RAM");
		 obj.put(3, "RAJ");
		 obj.put(4, "SATHISH");
		 obj.put(5, "ARUN");
		 
		 obj.get();
	   }

}