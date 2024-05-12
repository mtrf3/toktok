package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.data._BagItemPreUpdateInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BagItemConsumeResponse_Data_ProtoDecoder implements InterfaceC31105CIr<BagItemConsumeResponse.Data> {
    public static BagItemConsumeResponse.Data LIZIZ(Q9H q9h) {
        BagItemConsumeResponse.Data data = new BagItemConsumeResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.itemType = q9h.LJIIJ();
                        break;
                    case 2:
                        data.itemId = q9h.LJIIJJI();
                        break;
                    case 3:
                        data.count = q9h.LJIIJJI();
                        break;
                    case 4:
                        data.minExpireAt = q9h.LJIIJJI();
                        break;
                    case 5:
                        data.available = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        data.preUpdateInfo = _BagItemPreUpdateInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        data.battleId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BagItemConsumeResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
