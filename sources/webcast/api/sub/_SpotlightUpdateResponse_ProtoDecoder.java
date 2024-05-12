package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _SpotlightUpdateResponse_ProtoDecoder implements InterfaceC31105CIr<SpotlightUpdateResponse> {
    @Override // X.InterfaceC31105CIr
    public final SpotlightUpdateResponse LIZ(Q9H q9h) {
        SpotlightUpdateResponse spotlightUpdateResponse = new SpotlightUpdateResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    spotlightUpdateResponse.data = _SpotlightUpdateResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return spotlightUpdateResponse;
            }
        }
    }
}
