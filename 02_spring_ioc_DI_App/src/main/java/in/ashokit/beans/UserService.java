package in.ashokit.beans;

public class UserService {
	
	private PwdService pwdService;

//	public UserService() {
//		System.out.println("UserService :: constructor");
//	}
	//SI
	public void setPwdService(PwdService pwdService) {
		System.out.println("setpwdService()--called..");
		this.pwdService = pwdService;
	}
	
	public void saveUser(String uname, String pwd, long phno) {
		
		String encodepwd = pwdService.encodepwd(pwd);
		
	System.out.println("Encoded pwd :: "+ encodepwd);
	
	//insert into db
	System.out.println("Record inserted in DB...");
	}
}
