package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.TnsPiracyInfoResponse;

/* loaded from: classes14.dex */
public final class _TnsPiracyInfoResponse_ProtoDecoder implements InterfaceC31105CIr<TnsPiracyInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final TnsPiracyInfoResponse LIZ(Q9H q9h) {
        TnsPiracyInfoResponse tnsPiracyInfoResponse = new TnsPiracyInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    TnsPiracyInfoResponse.ResponseData responseData = new TnsPiracyInfoResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    tnsPiracyInfoResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return tnsPiracyInfoResponse;
            }
        }
    }
}
