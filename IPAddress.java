package dns_resolver;

/**
 * The IPAddress is using iIPv4 and has dotted-decimal notation, with the network, two subnets, 
 * and host separated by periods. For example, the IP address 130.191.226.146 has 
 * a network of 130, a subnet of 191, the second subnet is 226, and the host address is 146.
 * 
 * Your IPAddress class should accept a string of dotted-decimal IPAddresses in the constructor
 * and separate them into the components. 
 * 
 * @see <a href="https://en.wikipedia.org/wiki/IP_address#IPv4_addresses">Wikipedia IPv4 addresses</a>
 * @author Milad Balkhinezhad
 *
 */

public class IPAddress {

	int network;
	int subnet;
	int subnet2;
	int host;

	/**
	 * The constructor for the IPAddress class
	 * 
	 * @param ip the dotted-decimal IP address
	 */
	
	public IPAddress(String ip) {
		String data[] = ip.split("\\.");
				
		network = Integer.parseInt(data[0]);
		subnet = Integer.parseInt(data[1]);
		subnet2 = Integer.parseInt(data[2]);
		host = Integer.parseInt(data[3]);
	}

	/**
	 * Auto generated by eclipse, produces the hashcode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + host;
		result = prime * result + network;
		result = prime * result + subnet;
		result = prime * result + subnet2;
		return result;
	}
	
	/**
	 * Auto generated by eclipse, produces equals(Object obj)
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPAddress other = (IPAddress) obj;
		if (host != other.host)
			return false;
		if (network != other.network)
			return false;
		if (subnet != other.subnet)
			return false;
		if (subnet2 != other.subnet2)
			return false;
		return true;
	}
	
	/**
	 * Auto generated by eclipse, produces the String class
	 */

	@Override
	public String toString() {
		return "IPAddress [network=" + network + ", subnet=" + subnet + ", subnet2=" + subnet2 + ", host=" + host + "]";
	}



}
