package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BagItemListRequestParams_ProtoDecoder implements InterfaceC31105CIr<BagItemListRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final BagItemListRequestParams LIZ(Q9H q9h) {
        BagItemListRequestParams bagItemListRequestParams = new BagItemListRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                bagItemListRequestParams.anchorId = q9h.LJIIJJI();
                            }
                        } else {
                            bagItemListRequestParams.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        bagItemListRequestParams.userId = q9h.LJIIJJI();
                    }
                } else {
                    bagItemListRequestParams.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItemListRequestParams;
            }
        }
    }
}
