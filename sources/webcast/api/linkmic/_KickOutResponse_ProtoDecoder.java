package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.linkmic.KickOutResponse;

/* loaded from: classes14.dex */
public final class _KickOutResponse_ProtoDecoder implements InterfaceC31105CIr<KickOutResponse> {
    @Override // X.InterfaceC31105CIr
    public final KickOutResponse LIZ(Q9H q9h) {
        KickOutResponse kickOutResponse = new KickOutResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    KickOutResponse.ResponseData responseData = new KickOutResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    kickOutResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return kickOutResponse;
            }
        }
    }
}
