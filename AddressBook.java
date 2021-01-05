/**
 * @author Sandeep_Singh
 * functionality Create contact and also print that contact
 *
 */
public class AddressBook {
          private String city;
          private String state;
          private String zipcode;
          private String email;


        public static void main(String[] args) {
                System.out.println("Welcome To Address Book Program");
                AddressBook obj1=new AddressBook("Mahoba","Uttar-Pradesh","210433","sandeepgaurdec13@gmail.com");
                 
                 String mycity=obj1.getCity();
                 System.out.println(mycity);
                 String mystate=obj1.getState();
                 System.out.println(mystate);
                 String myzipcode=obj1.getZipcode();
                 System.out.println(myzipcode);
                 String myemail=obj1.getemail();
                 System.out.println(myemail);
                 
}

        public AddressBook(String city, String state, String zipcode, String email) {
        this.city=city;
        this.state=state;
        this.email=email;
        this.zipcode=zipcode;

        }

        public String toString() {
                return " [city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", email=" + email ;
        }

        public String getCity() {
                return city;
        }

        public String getState() {
                return state;
        }

        public String getZipcode() {
                return zipcode;
        }

        public String getemail() {
                return email;
        }


}


