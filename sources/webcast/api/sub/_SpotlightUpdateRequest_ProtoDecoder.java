package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _SpotlightUpdateRequest_ProtoDecoder implements InterfaceC31105CIr<SpotlightUpdateRequest> {
    @Override // X.InterfaceC31105CIr
    public final SpotlightUpdateRequest LIZ(Q9H q9h) {
        SpotlightUpdateRequest spotlightUpdateRequest = new SpotlightUpdateRequest();
        spotlightUpdateRequest.spotlightInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    spotlightUpdateRequest.spotlightInfo.add(_SpotlightUpdateItem_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return spotlightUpdateRequest;
            }
        }
    }
}
