package dns_resolver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import data_structures.Hash;
import data_structures.HashI;
import exceptions.FileFormatException;


/**
 * The LoadInternetAddresses class should take a filename as a string, uses BufferedReader
 * to read the file, split the lines into URLs and IPAddresses, and create the appropriate
 * objects. It should add those objects to a hash, and finally, after reading the whole file
 * it should return the instance of the hash.
 * 
 * If there is an error with the file format, you should throw a new FileFormatException error
 * with an appropriate message.
 *  
 * @author Milad Balkhinezhad
 *
 */
public class LoadInternetAddresses {
	HashI<URL,IPAddress> address;

	public LoadInternetAddresses() {
		address = new Hash<URL, IPAddress>(100);
	}
	
	public HashI<URL, IPAddress> load_addresses(String filename) throws FileFormatException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		try {
			String line;
			while ((line = br.readLine()) != null) {
				String[] value = line.split("\t");
				if (value.length != 2) {
					throw new FileFormatException("Incorrect Format");
				}
				URL url = new URL(value[1]);
				IPAddress ip = new IPAddress(value[0]);
				address.add(url, ip);
			}	
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return address;
	}
}
