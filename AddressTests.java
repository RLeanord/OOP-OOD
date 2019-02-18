public class AddressTests {

    public static void main(String[] args) {

        Address testAddress = new Address();

        try{
            testAddress.setHouse("10");
            System.out.println("pass");
        }
        catch (InputValidationException e){
            System.out.println("fail");
        }

        try{
            testAddress.setCity("Cityyyyyyy");
            System.out.println("fail");
        }
        catch (InputValidationException e){
            System.out.println("pass");
        }

        try{
            testAddress.setStreet("A");
            System.out.println("fail");
        }
        catch (InputValidationException e){
            System.out.println("pass");
        }
    }
}
