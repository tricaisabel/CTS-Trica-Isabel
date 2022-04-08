package terestru;

import subteran.ValidatorMetrou;

public class ValidatorAdapterObiect implements ValidatorTerestru{
    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapterObiect(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
