package dns_resolver;

/**
 * A URL Object is a representation of the URL that we have been giving. 
 * It knows how to compare URLs!
 * 
 * @author Milad Balkhinezhad
 *
 */
public class URL implements Comparable<URL> {

	String address;
	
	public URL (String URL) {
		address = URL;
	}
	
	public String toString() {
		return address.toString();
	}
	public int hashCode() {
		return address.hashCode();
	}
	public boolean equals(URL o) {
		return address.equals(o.address);
	}
	public int compareTo(URL obj) {
		return address.compareTo(obj.address);
	}
	
}
