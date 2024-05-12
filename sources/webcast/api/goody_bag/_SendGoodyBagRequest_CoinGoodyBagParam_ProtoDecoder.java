package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.SendGoodyBagRequest;

/* loaded from: classes17.dex */
public final class _SendGoodyBagRequest_CoinGoodyBagParam_ProtoDecoder implements InterfaceC31105CIr<SendGoodyBagRequest.CoinGoodyBagParam> {
    public static SendGoodyBagRequest.CoinGoodyBagParam LIZIZ(Q9H q9h) {
        SendGoodyBagRequest.CoinGoodyBagParam coinGoodyBagParam = new SendGoodyBagRequest.CoinGoodyBagParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    coinGoodyBagParam.selectedTotalCoins = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return coinGoodyBagParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SendGoodyBagRequest.CoinGoodyBagParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
