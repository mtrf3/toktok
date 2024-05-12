package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.GetGoodyBagHistoryResponse;

/* loaded from: classes17.dex */
public final class _GetGoodyBagHistoryResponse_CoinHistoryItem_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagHistoryResponse.CoinHistoryItem> {
    public static GetGoodyBagHistoryResponse.CoinHistoryItem LIZIZ(Q9H q9h) {
        GetGoodyBagHistoryResponse.CoinHistoryItem coinHistoryItem = new GetGoodyBagHistoryResponse.CoinHistoryItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        coinHistoryItem.refundedCoin = q9h.LJIIJ();
                    }
                } else {
                    coinHistoryItem.totalCoin = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return coinHistoryItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagHistoryResponse.CoinHistoryItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
