import java.time.LocalDate;

public class KeeperTest {

    public static void main(String[] args) {

        KeeperBuilder testKeeper = new KeeperBuilder();

        try{
            testKeeper.setFirstName("F");
            System.out.println("fail");
        }
        catch (InputValidationException e){
            System.out.println("pass");
        }

        try{
            testKeeper.setSurname("MoreThanTwentyCharacters");
            System.out.println("fail");
        }
        catch (InputValidationException e){
            System.out.println("pass");
        }

        try {
            Keeper.getBuilder().setSurname("").setDob(LocalDate.parse("210910")).build();
        }
        catch (InputValidationException e){
            System.out.println("pass");
        }

        try {
            testKeeper = Keeper.getBuilder().setFirstName("Rory").setSurname("Leanord");
            System.out.println(testKeeper);
        }
        catch (InputValidationException e){
        }

    }
}
