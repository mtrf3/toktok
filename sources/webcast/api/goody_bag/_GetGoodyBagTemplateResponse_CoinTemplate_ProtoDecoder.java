package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.goody_bag.GetGoodyBagTemplateResponse;

/* loaded from: classes16.dex */
public final class _GetGoodyBagTemplateResponse_CoinTemplate_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagTemplateResponse.CoinTemplate> {
    public static GetGoodyBagTemplateResponse.CoinTemplate LIZIZ(Q9H q9h) {
        GetGoodyBagTemplateResponse.CoinTemplate coinTemplate = new GetGoodyBagTemplateResponse.CoinTemplate();
        coinTemplate.totalCoinOptions = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        coinTemplate.totalCoin = q9h.LJIIJ();
                    }
                } else {
                    coinTemplate.totalCoinOptions.add(Integer.valueOf(q9h.LJIIJ()));
                }
            } else {
                q9h.LJ(LIZJ);
                return coinTemplate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagTemplateResponse.CoinTemplate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
