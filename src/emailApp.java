/* IT support administrator tasked with the creating email accounts for new hires. App should
- Generate email with firstname.lastname@dept.company.com
- Determine dept (sales, dev, acct), if none, leave blank
- Generate random string for password
- Have method to change password, set mailbox capacity & define alt email address
- Have methods to display name, email and mailbox capacity
 */

public class emailApp {
    public static void main(String[] args) {
        email em1 = new email("Princess", "Iza");

        email em2 = new email ("Shato", "Kidd");
        em2.setAlternativeEmail("shatokidd@email.com");
        System.out.println("Your alternative email is " + em2.getAlternativeEmail());

        System.out.println(em1.showInfo());
        em1.changePassword("BlueLagoon");
        System.out.println(em1.getPassword());


    }
}
