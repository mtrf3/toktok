package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _AnchorEventsRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorEventsRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorEventsRequest LIZ(Q9H q9h) {
        AnchorEventsRequest anchorEventsRequest = new AnchorEventsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorEventsRequest.eventMode = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorEventsRequest;
            }
        }
    }
}
