package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SwipingGuidanceRequest_ProtoDecoder implements InterfaceC31105CIr<SwipingGuidanceRequest> {
    @Override // X.InterfaceC31105CIr
    public final SwipingGuidanceRequest LIZ(Q9H q9h) {
        SwipingGuidanceRequest swipingGuidanceRequest = new SwipingGuidanceRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return swipingGuidanceRequest;
    }
}
