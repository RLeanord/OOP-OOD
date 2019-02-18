
import java.time.LocalDate;

public class Keeper {

    private int id;
    private String firstName;
    private String surname;
    private LocalDate Dob;
    private int cages;
    private String phoneNumber;
    private Address address;


    private static KeeperBuilder builder = new KeeperBuilder();


    public static KeeperBuilder getBuilder() {
        return builder;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) throws InputValidationException {
        if (id > 0) {
            this.id = id;
        } else {
            throw new InputValidationException("Id must be greater than zero");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws InputValidationException {
        if (firstName.matches("\\p{Upper}(\\p{Lower}){2,20}")) {
            this.firstName = firstName;
        } else {
            throw new InputValidationException("A name must be between 3 and 20 characters");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws InputValidationException {
        if (surname.matches("\\p{Upper}(\\p{Lower}){2,20}")) {
            this.surname = surname;
        } else {
            throw new InputValidationException("A name must be between 3 and 20 characters");
        }
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate Dob) {
        this.Dob = Dob;
    }

    public int getCages() {
        return cages;
    }

    public void setCages(int cages) {
        this.cages = cages;
    }

    public void setPhoneNumber(String phoneNumber) throws InputValidationException {
        if (phoneNumber.matches("(\\p{Digit}){11}")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new InputValidationException("a phone number must be 11 digits");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
