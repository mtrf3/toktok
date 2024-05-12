package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AnchorEventJoinRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorEventJoinRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorEventJoinRequest LIZ(Q9H q9h) {
        AnchorEventJoinRequest anchorEventJoinRequest = new AnchorEventJoinRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        anchorEventJoinRequest.targetId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    anchorEventJoinRequest.idType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorEventJoinRequest;
            }
        }
    }
}
