package subteran;

public class ValidatorMetrou implements ValidatorSubteran{
    @Override
    public void valideazaCalatorie() {
        System.out.println("S-a validat calatoria metroului");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("S-a validat abonamentul metroului");
    }
}
