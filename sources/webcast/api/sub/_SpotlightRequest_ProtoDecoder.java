package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _SpotlightRequest_ProtoDecoder implements InterfaceC31105CIr<SpotlightRequest> {
    @Override // X.InterfaceC31105CIr
    public final SpotlightRequest LIZ(Q9H q9h) {
        SpotlightRequest spotlightRequest = new SpotlightRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    spotlightRequest.anchorId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return spotlightRequest;
            }
        }
    }
}
