package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {

	public PwdService() {
		System.out.println("pwdService :: constructor");
		
  }
	
	public String encodepwd(String pwd) {
	     Encoder encoder = Base64.getEncoder();
	     String encodedpwd = encoder.encodeToString(pwd.getBytes());
	     
	     return encodedpwd;
	}
}
