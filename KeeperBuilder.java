import java.time.LocalDate;

public class KeeperBuilder {

    private Keeper keeper = new Keeper();


    public Keeper build() {
        return keeper;
    }

    public KeeperBuilder setFirstName(String firstName) throws InputValidationException {
        keeper.setFirstName(firstName);
        return this;
    }

    public KeeperBuilder setSurname(String surname) throws InputValidationException {
        keeper.setSurname(surname);
        return this;
    }

    public KeeperBuilder setDob(LocalDate Dob) throws InputValidationException {
        keeper.setDob(Dob);
        return this;
    }

    public KeeperBuilder setOrderNo(int OrderNo) throws InputValidationException {
        keeper.setOrderNo(OrderNo);
        return this;
    }

    public KeeperBuilder setPhoneNumber(String phoneNumber) throws InputValidationException {
        keeper.setPhoneNumber(phoneNumber);
        return this;
    }

    public KeeperBuilder setAddress(Address address) throws InputValidationException {
        keeper.setAddress(address);
        return this;
    }
}
