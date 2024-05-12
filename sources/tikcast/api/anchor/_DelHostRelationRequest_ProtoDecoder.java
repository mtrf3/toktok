package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _DelHostRelationRequest_ProtoDecoder implements InterfaceC31105CIr<DelHostRelationRequest> {
    @Override // X.InterfaceC31105CIr
    public final DelHostRelationRequest LIZ(Q9H q9h) {
        DelHostRelationRequest delHostRelationRequest = new DelHostRelationRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        delHostRelationRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    delHostRelationRequest.hostId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return delHostRelationRequest;
            }
        }
    }
}
