package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BagItemObtainRequestParams_ProtoDecoder implements InterfaceC31105CIr<BagItemObtainRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final BagItemObtainRequestParams LIZ(Q9H q9h) {
        BagItemObtainRequestParams bagItemObtainRequestParams = new BagItemObtainRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bagItemObtainRequestParams.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        bagItemObtainRequestParams.itemType = q9h.LJIIJ();
                        break;
                    case 3:
                        bagItemObtainRequestParams.itemId = q9h.LJIIJJI();
                        break;
                    case 4:
                        bagItemObtainRequestParams.count = q9h.LJIIJJI();
                        break;
                    case 5:
                        bagItemObtainRequestParams.expireAt = q9h.LJIIJJI();
                        break;
                    case 6:
                        bagItemObtainRequestParams.roomId = q9h.LJIIJJI();
                        break;
                    case 7:
                        bagItemObtainRequestParams.anchorId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItemObtainRequestParams;
            }
        }
    }
}
