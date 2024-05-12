package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.bag.BagItemObtainResponse;

/* loaded from: classes14.dex */
public final class _BagItemObtainResponse_ProtoDecoder implements InterfaceC31105CIr<BagItemObtainResponse> {
    @Override // X.InterfaceC31105CIr
    public final BagItemObtainResponse LIZ(Q9H q9h) {
        BagItemObtainResponse bagItemObtainResponse = new BagItemObtainResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        BagItemObtainResponse.Extra extra = new BagItemObtainResponse.Extra();
                        long LIZJ2 = q9h.LIZJ();
                        while (q9h.LJI() != -1) {
                            Q9J.LIZJ(q9h);
                        }
                        q9h.LJ(LIZJ2);
                        bagItemObtainResponse.extra = extra;
                    }
                } else {
                    BagItemObtainResponse.Data data = new BagItemObtainResponse.Data();
                    long LIZJ3 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ3);
                    bagItemObtainResponse.data = data;
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItemObtainResponse;
            }
        }
    }
}
