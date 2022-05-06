package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler handleAutobuz=new AutobuzHandler();
        MijlocTransportHandler handlerMetrou=new MetrouHandler();
        MijlocTransportHandler handlerTramvai=new TramvaiHandler();
        MijlocTransportHandler handlerTroleibuz=new TroleibuzHandler();

        handlerTroleibuz.setUrmatorulMijloc(handleAutobuz);
        handleAutobuz.setUrmatorulMijloc(handlerTramvai);
        handlerTramvai.setUrmatorulMijloc(handlerMetrou);

        handlerTroleibuz.recomandaMijloc(7);
        handlerTroleibuz.recomandaMijloc(1);
        handlerTroleibuz.recomandaMijloc(4);
        handlerTroleibuz.recomandaMijloc(12);

//        MijlocTransportHandler handleAutobuzCluj=new AutobuzHandler(2);
//        MijlocTransportHandler handlerMetrouCluj=new MetrouHandler(10000);
//        MijlocTransportHandler handlerTramvaiCluj=new TramvaiHandler(4);
//        MijlocTransportHandler handlerTroleibuzCluj=new TroleibuzHandler(6);
//
//        handleAutobuzCluj.setUrmatorulMijloc(handlerTramvaiCluj);
//        handlerTramvaiCluj.setUrmatorulMijloc(handlerTroleibuzCluj);
//        handlerTroleibuzCluj.setUrmatorulMijloc(handlerMetrou);
//
//        handlerTroleibuz.recomandaMijloc(7);
//        handlerTroleibuz.recomandaMijloc(1);
//        handlerTroleibuz.recomandaMijloc(4);
//        handlerTroleibuz.recomandaMijloc(12);
    }
}
