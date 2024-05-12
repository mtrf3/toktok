package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.GetGoodyBagHistoryResponse;

/* loaded from: classes17.dex */
public final class _GetGoodyBagHistoryResponse_HistoryItem_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagHistoryResponse.HistoryItem> {
    public static GetGoodyBagHistoryResponse.HistoryItem LIZIZ(Q9H q9h) {
        GetGoodyBagHistoryResponse.HistoryItem historyItem = new GetGoodyBagHistoryResponse.HistoryItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        historyItem.goodyBagId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 3:
                        historyItem.biz = q9h.LJIIJ();
                        break;
                    case 4:
                        historyItem.participateMethod = q9h.LJIIJ();
                        break;
                    case 5:
                        historyItem.expectWinnerHeadcount = q9h.LJIIJ();
                        break;
                    case 6:
                        historyItem.actualWinnerHeadcount = q9h.LJIIJ();
                        break;
                    case 7:
                        historyItem.sentTimestampSec = q9h.LJIIJ();
                        break;
                    case 8:
                        historyItem.coinHistoryItem = _GetGoodyBagHistoryResponse_CoinHistoryItem_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return historyItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagHistoryResponse.HistoryItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
