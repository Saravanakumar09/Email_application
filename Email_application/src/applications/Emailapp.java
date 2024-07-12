package applications;

public class Emailapp {
	public static void main(String []a) {
		Email em1 =new Email("Saravana","kumar");
		em1.setalterMail("saravana232004@gmail.com");
		System.out.println("Alternate mail:"+em1.getAltermail());
		em1.setmailCapacity(500);
		System.out.println("MailboxCapacity :"+em1.getmailboxCapacity());
		em1.setchangePassword("Saravana@9");
		System.out.println("Change Password:"+em1.getchangePassword());

	}
		}


