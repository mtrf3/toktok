package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BagItemConsumeRequestParams_ProtoDecoder implements InterfaceC31105CIr<BagItemConsumeRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final BagItemConsumeRequestParams LIZ(Q9H q9h) {
        BagItemConsumeRequestParams bagItemConsumeRequestParams = new BagItemConsumeRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bagItemConsumeRequestParams.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        bagItemConsumeRequestParams.itemType = q9h.LJIIJ();
                        break;
                    case 3:
                        bagItemConsumeRequestParams.itemId = q9h.LJIIJJI();
                        break;
                    case 4:
                        bagItemConsumeRequestParams.count = q9h.LJIIJJI();
                        break;
                    case 5:
                        bagItemConsumeRequestParams.minExpireAt = q9h.LJIIJJI();
                        break;
                    case 6:
                        bagItemConsumeRequestParams.roomId = q9h.LJIIJJI();
                        break;
                    case 7:
                        bagItemConsumeRequestParams.anchorId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItemConsumeRequestParams;
            }
        }
    }
}
