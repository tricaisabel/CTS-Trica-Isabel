package main;

import subteran.ValidatorMetrou;
import terestru.ValidatorAdapter;
import terestru.ValidatorAdapterObiect;
import terestru.ValidatorAutobuz;
import terestru.ValidatorTerestru;

public class Main {
    static void valideaza(ValidatorTerestru validatorAdapter){
        validatorAdapter.valideazaBilet();
    }
    public static void main(String[] args) {
        ValidatorTerestru validatorTerestru=new ValidatorAutobuz();
        valideaza(validatorTerestru);

        ValidatorMetrou validatorMetrou=new ValidatorMetrou();
        ValidatorAdapterObiect adapterObiect=new ValidatorAdapterObiect(validatorMetrou);
        valideaza(adapterObiect);

        ValidatorAdapter validatorAdapter=new ValidatorAdapter();
        valideaza(validatorAdapter);
    }
}
