package HashCode;

public class hashcode {
private int sid;//Instance Variable

//constructor
hashcode (int sid){//The constructor takes an integer parameter sid 
	
	this.sid=sid;//and assigns it to the instance variable sid
}//keyword this is used within an instance method or constructor to refer to the current object. It differentiates between instance variables and parameters or other variables with the same name


@Override 
public int hashCode() {
    return sid;        
}
@Override
public String toString() {
    return "Hashcode{" + "sid=" + sid + '}';
}

	public static void main(String[] args) {
hashcode t= new hashcode(150);
System.out.println(t);
System.out.println(t);
System.out.println(t);
System.out.println(t);	
hashcode t1=new hashcode(20);
System.out.println(t1);
	}
}
