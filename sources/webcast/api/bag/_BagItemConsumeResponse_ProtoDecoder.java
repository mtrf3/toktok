package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.bag.BagItemConsumeResponse;

/* loaded from: classes6.dex */
public final class _BagItemConsumeResponse_ProtoDecoder implements InterfaceC31105CIr<BagItemConsumeResponse> {
    @Override // X.InterfaceC31105CIr
    public final BagItemConsumeResponse LIZ(Q9H q9h) {
        BagItemConsumeResponse bagItemConsumeResponse = new BagItemConsumeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        BagItemConsumeResponse.Extra extra = new BagItemConsumeResponse.Extra();
                        long LIZJ2 = q9h.LIZJ();
                        while (q9h.LJI() != -1) {
                            Q9J.LIZJ(q9h);
                        }
                        q9h.LJ(LIZJ2);
                        bagItemConsumeResponse.extra = extra;
                    }
                } else {
                    bagItemConsumeResponse.data = _BagItemConsumeResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItemConsumeResponse;
            }
        }
    }
}
