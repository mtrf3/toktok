package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _SpotlightResponse_ProtoDecoder implements InterfaceC31105CIr<SpotlightResponse> {
    @Override // X.InterfaceC31105CIr
    public final SpotlightResponse LIZ(Q9H q9h) {
        SpotlightResponse spotlightResponse = new SpotlightResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    spotlightResponse.data = _SpotlightResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return spotlightResponse;
            }
        }
    }
}
