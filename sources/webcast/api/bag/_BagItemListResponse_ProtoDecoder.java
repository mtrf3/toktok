package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.bag.BagItemListResponse;

/* loaded from: classes6.dex */
public final class _BagItemListResponse_ProtoDecoder implements InterfaceC31105CIr<BagItemListResponse> {
    @Override // X.InterfaceC31105CIr
    public final BagItemListResponse LIZ(Q9H q9h) {
        BagItemListResponse bagItemListResponse = new BagItemListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        BagItemListResponse.Extra extra = new BagItemListResponse.Extra();
                        long LIZJ2 = q9h.LIZJ();
                        while (q9h.LJI() != -1) {
                            Q9J.LIZJ(q9h);
                        }
                        q9h.LJ(LIZJ2);
                        bagItemListResponse.extra = extra;
                    }
                } else {
                    bagItemListResponse.data = _BagItemListResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItemListResponse;
            }
        }
    }
}
